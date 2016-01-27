#coding: utf-8

def prod(l):
	def xxx(x,y):
		return x*y;
	return reduce(xxx,l);

l1=[1,2,3,4];

print prod(l1);

l2=['assadasdas','sadasdsa','sadsda'];

def f(s):
	s=s.title();
	return s;

def func(l):
	return map(f,l);

print func(l2);
