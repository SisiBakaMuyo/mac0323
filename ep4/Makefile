JFLAGS = -g
JC = javac
JAVA = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $<

.java:
	$(JC) $(JFLAGS) $<
	
ep4: Graph.class DFS.class Automato.class Stack.class Ep4.class
	$(JAVA) Ep4 entrada1.txt	
	
digraph: Graph.java
	$(JC) $(JFLAGS) Graph.java
	
dfs: DFS.java
	$(JC) $(JFLAGS) DFS.java
	
automato: Automato.java
	$(JC) $(JFLAGS) NFA.java
	
stack: Stack.java
	$(JC) $(JFLAGS) Stack.java

clean:
	rm -rf  *.class *~
