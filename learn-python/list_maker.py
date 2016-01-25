#coding: utf-8
l=[x*x for x in range(11,55)];
print l;

l1=[m + n for m in 'ABC' for n in 'XYZ'];
print "[m + n for m in 'ABC' for n in 'XYZ']->>>>>",l1;

d={1:'a',2:'b',3:'c'};

for a,b in d.iteritems():
	print a,"-->",b;

import os;
l2=[d for d in os.listdir('.')]
print l2;
