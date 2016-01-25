#coding: utf-8
def fibb(n):
	if n==0 or n==1:
		return 1;
	else:
		return fibb(n-1)+fibb(n-2);

for i in range(101):
	print fibb(i);
