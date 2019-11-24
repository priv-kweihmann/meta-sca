# Copyright (C) 2000 Alan DeKok
# This Makefile is free software; Alan DeKok
# gives unlimited permission to copy and/or distribute it,
# with or without modifications, as long as this notice is preserved.

# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY, to the extent permitted by law; without
# even the implied warranty of MERCHANTABILITY or FITNESS FOR A
# PARTICULAR PURPOSE.
#

# These are what I use on Linux.  Your mileage may vary.
#CC=gcc -Wall -g
LEX=flex

pscan: scanner.yy.o pscan.o
	$(CC) scanner.yy.o pscan.o -o pscan

scanner.yy.o: scanner.yy.c
	$(CC) -c scanner.yy.c -o scanner.yy.o

scanner.yy.c: scanner.l
	$(LEX) -t scanner.l > scanner.yy.c

pscan.o: pscan.c pscan.h

clean:
	rm -f *.o *~ pscan scanner.yy.c core
