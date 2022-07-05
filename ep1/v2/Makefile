JFLAGS = -g
JC = javac
JAVA = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $<

.java:
	$(JC) $(JFLAGS) $<
	
ep1: Stack.class Input.class Queue.class Peca.class PecaEncaixe.class Posicao.class Pentamino.class 
	$(JAVA) Pentamino entrada2.txt	
	
pentamino: Pentamino.java
	$(JC) $(JFLAGS) Pentamino.java	

stack: Stack.java
	$(JC) $(JFLAGS) Stack.java

input: Input.java
	$(JC) $(JFLAGS) Input.java
	
queue: Queue.java
	$(JC) $(JFLAGS) Queue.java
	
peca: Peca.java
	$(JC) $(JFLAGS) Peca.java
	
pecaEncaixe: PecaEncaixe.java
	$(JC) $(JFLAGS) PecaEncaixe.java
	
posicao: Posicao.java
	$(JC) $(JFLAGS) Posicao.java

clean:
	rm -rf  *.class *~
