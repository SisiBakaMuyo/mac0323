JFLAGS = -g
JC = javac
JAVA = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $<

.java:
	$(JC) $(JFLAGS) $<
	
run: Link.class Vertex.class Grafos.class Graph.class Queue.class Ep3.class
	$(JAVA) Ep3 grafo1.txt
	
link: Link.java
	$(JC) $(JFLAGS) Link.java	
	
vertex: Vertex.java
	$(JC) $(JFLAGS) Vertex.java
	
grafos: Grafos.java
	$(JC) $(JFLAGS) Grafos.java
	
graph: Graph.java
	$(JC) $(JFLAGS) Graph.java
	
queue: Queue.java
	$(JC) $(JFLAGS) Queue.java
	
ep3: Ep3.java
	$(JC) $(JFLAGS) Ep3.java

erdos: ErdosRenyi.java
	$(JC) $(JFLAGS) ErdosRenyi.java	

clean:
	rm -rf  *.class *~
