import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;


public final class BinaryStdIn {
    private static final int EOF = -1;      // fim do arquivo

    private static FileInputStream in;      // entrada por arquivo
    private static int buffer;              // buffer 1 caracter
    private static int n;                   // bits q ainda tem no buffer
    private static boolean isInitialized;   // ja foi inicializado
    private static String file;             // arquivo de entrada

    private BinaryStdIn() { }

    public static void setArquivo (String arquivo){
        file = arquivo;
    }

    private static void initialize() throws Exception{
        try{
            in = new FileInputStream(new File(file));
            buffer = 0;
            n = 0;
            fillBuffer();
            isInitialized = true;
        }catch (Exception e) {
            throw new Exception(e);
        }     
    }

    private static void fillBuffer() {
        try {
            buffer = in.read();
            n = 8;
        }
        catch (IOException e) {
            System.out.println("EOF");
            buffer = EOF;
            n = -1;
        }
    }

    public static void close() throws Exception{
        if (!isInitialized) initialize();
        try {
            in.close();
            isInitialized = false;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Could not close BinaryStdIn", ioe);
        }
    }

    public static boolean isEmpty() throws Exception{
        if (!isInitialized) initialize();
        return buffer == EOF;
    }


    public static boolean readBoolean() throws Exception{
        if (isEmpty()) throw new NoSuchElementException("Reading from empty input stream");
        n--;
        boolean bit = ((buffer >> n) & 1) == 1;
        if (n == 0) fillBuffer();
        return bit;
    }

    public static char readChar() throws Exception{
        if (isEmpty()) throw new NoSuchElementException("Reading from empty input stream");

        if (n == 8) {
            int x = buffer;
            fillBuffer();
            return (char) (x & 0xff);
        }

        // merge
        int x = buffer;
        x <<= (8 - n);
        int oldN = n;
        fillBuffer();
        if (isEmpty()) throw new NoSuchElementException("Reading from empty input stream");
        n = oldN;
        x |= (buffer >>> n);
        return (char) (x & 0xff);

    }

    public static char readChar(int r) throws Exception{
        if (r < 1 || r > 16) throw new IllegalArgumentException("Illegal value of r = " + r);

        // otimizacao
        if (r == 8) return readChar();

        char x = 0;
        for (int i = 0; i < r; i++) {
            x <<= 1;
            boolean bit = readBoolean();
            if (bit) x |= 1;
        }
        return x;
    }


    public static String readString() throws Exception{
        if (isEmpty()) throw new NoSuchElementException("Reading from empty input stream");

        StringBuilder sb = new StringBuilder();
        while (!isEmpty()) {
            char c = readChar();
            sb.append(c);
        }
        return sb.toString();
    }

    public static short readShort() throws Exception{
        short x = 0;
        for (int i = 0; i < 2; i++) {
            char c = readChar();
            x <<= 8;
            x |= c;
        }
        return x;
    }

    public static int readInt() throws Exception{
        int x = 0;
        for (int i = 0; i < 4; i++) {
            char c = readChar();
            x <<= 8;
            x |= c;
        }
        return x;
    }

    public static int readInt(int r) throws Exception{
        if (r < 1 || r > 32) throw new IllegalArgumentException("Illegal value of r = " + r);

        // optimize r = 32 case
        if (r == 32) return readInt();

        int x = 0;
        for (int i = 0; i < r; i++) {
            x <<= 1;
            boolean bit = readBoolean();
            if (bit) x |= 1;
        }
        return x;
    }

    public static long readLong() throws Exception{
        long x = 0;
        for (int i = 0; i < 8; i++) {
            char c = readChar();
            x <<= 8;
            x |= c;
        }
        return x;
    }


    public static double readDouble() throws Exception{
        return Double.longBitsToDouble(readLong());
    }


    public static float readFloat() throws Exception{
        return Float.intBitsToFloat(readInt());
    }


    public static byte readByte() throws Exception{
        char c = readChar();
        return (byte) (c & 0xff);
    }
    
}