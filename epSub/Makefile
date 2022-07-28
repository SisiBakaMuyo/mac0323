JFLAGS = -g
JC = javac
JAVA = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $<

.java:
	$(JC) $(JFLAGS) $<
	
epsub: BinaryStdIn.class BinaryStdOut.class MinPQ.class Epsub.class
	$(JAVA) Epsub teste1.txt
	
huffman: Epsub.java
	$(JC) $(JFLAGS) Epsub.java

in: BinaryStdIn.java
	$(JC) $(JFLAGS) BinaryStdIn.java	
	
out: BinaryStdOut.java
	$(JC) $(JFLAGS) BinaryStdOut.java
	
minpq: MinPQ.java
	$(JC) $(JFLAGS) MinPQ.java

clean:
	rm -rf  *.class *~
