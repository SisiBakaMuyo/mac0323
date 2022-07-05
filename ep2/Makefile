JFLAGS = -g -Xlint
JC = javac
JAVA = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $<

.java:
	$(JC) $(JFLAGS) $<
	
run: TSVetor.class TSBinaria.class TSTreaps.class TS23.class TSRubro.class Ep2.class
	time $(JAVA) Ep2 teste2.txt
	
ep2: Ep2.java
	$(JC) $(JFLAGS) Ep2.java	
	
vetor: TSVetor.java
	$(JC) $(JFLAGS) TSVetor.java	

binaria: TSBinaria.java
	$(JC) $(JFLAGS) TSBinaria.java

treaps: TSTreaps.java
	$(JC) $(JFLAGS) TSTreaps.java
	
23: TS23.java
	$(JC) $(JFLAGS) TS23.java	
	
rubro: TSRubro.java
	$(JC) $(JFLAGS) TSRubro.java

clean:
	rm -rf  *.class *~
