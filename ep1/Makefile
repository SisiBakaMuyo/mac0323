# ***************************************************************
#
# Makefile genérico para compilar programas em Java (Algs4th)
#
# ***************************************************************

JFLAGS = -g
JC = javac
JAVA = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $<

.java:
	$(JC) $(JFLAGS) $<

clean:
	$(RM) *.class *~
