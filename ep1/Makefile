JFLAGS = -g
JC = javac
JAVA = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $<

.java:
	$(JC) $(JFLAGS) $<
	
ep1: Stack.class Input.class Pentamino.class
	$(JAVA) Pentamino entrada1.txt	
	
pentamino: Pentamino.java
	$(JC) $(JFLAGS) Pentamino.java	

stack: Stack.java
	$(JC) $(JFLAGS) Stack.java

input: Input.java
	$(JC) $(JFLAGS) Input.java

clean:
	rm -rf  *.class *~
