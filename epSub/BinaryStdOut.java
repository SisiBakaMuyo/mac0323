import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class BinaryStdOut {
    private static DataOutputStream file;   // output grava arquivo
    private static int buffer;                // 8-bit buffer de bits para escrever
    private static int n;                     // numeros de bits que restam no buffer
    private static boolean isInitialized;     // se ja foi inicializado
    private static char tipo;                 // indica o tipo de arquivo de saida

    private BinaryStdOut() { }

    public static void setTipo(char c){
        tipo = c;
    }

    private static void initialize() throws Exception{
        try{
            if (tipo == 't')
                file = new DataOutputStream(new FileOutputStream("saida.bin"));
            if (tipo == 'b') 
                file = new DataOutputStream(new FileOutputStream("saida.txt"));   
            buffer = 0;
            n = 0;
            isInitialized = true;
        }catch (Exception e) {
            throw new Exception(e);
        }      
    }


    private static void writeBit(boolean bit) throws Exception{
        if (!isInitialized) initialize();

        buffer <<= 1;
        if (bit) buffer |= 1;

        n++;
        if (n == 8) clearBuffer();
        
    } 


    private static void writeByte(int x) throws Exception{
        if (!isInitialized) initialize();

        assert x >= 0 && x < 256;

        // otimizacao
        if (n == 0) {
            try {
                file.write(x);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        for (int i = 0; i < 8; i++) {
            boolean bit = ((x >>> (8 - i - 1)) & 1) == 1;
            writeBit(bit);
        }
    }


    private static void clearBuffer() throws Exception{
        if (!isInitialized) initialize();

        if (n == 0) return;
        if (n > 0) buffer <<= (8 - n);
        try {
            file.write(buffer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        n = 0;
        buffer = 0;
    }


    public static void flush() throws Exception{
        clearBuffer();
        try {
            file.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void close() throws Exception{
        flush();
        try {
            file.close();
            isInitialized = false;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void write(boolean x) throws Exception{
        writeBit(x);
    } 

    public static void write(byte x) throws Exception{
        writeByte(x & 0xff);
    }

    public static void write(int x) throws Exception{
        writeByte((x >>> 24) & 0xff);
        writeByte((x >>> 16) & 0xff);
        writeByte((x >>>  8) & 0xff);
        writeByte((x >>>  0) & 0xff);
    }

    public static void write(int x, int r) throws Exception{
        if (r == 32) {
            write(x);
            return;
        }
        if (r < 1 || r > 32)        throw new IllegalArgumentException("Illegal value for r = " + r);
        if (x < 0 || x >= (1 << r)) throw new IllegalArgumentException("Illegal " + r + "-bit char = " + x);
        for (int i = 0; i < r; i++) {
            boolean bit = ((x >>> (r - i - 1)) & 1) == 1;
            writeBit(bit);
        }
    }

    public static void write(double x) throws Exception{
        write(Double.doubleToRawLongBits(x));
    }

    public static void write(long x) throws Exception{
        writeByte((int) ((x >>> 56) & 0xff));
        writeByte((int) ((x >>> 48) & 0xff));
        writeByte((int) ((x >>> 40) & 0xff));
        writeByte((int) ((x >>> 32) & 0xff));
        writeByte((int) ((x >>> 24) & 0xff));
        writeByte((int) ((x >>> 16) & 0xff));
        writeByte((int) ((x >>>  8) & 0xff));
        writeByte((int) ((x >>>  0) & 0xff));
    }

    public static void write(float x) throws Exception{
        write(Float.floatToRawIntBits(x));
    }

    public static void write(short x) throws Exception{
        writeByte((x >>>  8) & 0xff);
        writeByte((x >>>  0) & 0xff);
    }

    public static void write(char x) throws Exception{
        if (x < 0 || x >= 256) throw new IllegalArgumentException("Illegal 8-bit char = " + x);
        writeByte(x);
    }

    public static void write(char x, int r) throws Exception{
        if (r == 8) {
            write(x);
            return;
        }
        if (r < 1 || r > 16) throw new IllegalArgumentException("Illegal value for r = " + r);
        if (x >= (1 << r))   throw new IllegalArgumentException("Illegal " + r + "-bit char = " + x);
        for (int i = 0; i < r; i++) {
            boolean bit = ((x >>> (r - i - 1)) & 1) == 1;
            writeBit(bit);
        }
    }

    public static void write(String s) throws Exception{
        for (int i = 0; i < s.length(); i++)
            write(s.charAt(i));
    }

    public static void write(String s, int r) throws Exception{
        for (int i = 0; i < s.length(); i++)
            write(s.charAt(i), r);
    }

}
