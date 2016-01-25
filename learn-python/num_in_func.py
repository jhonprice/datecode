#coding: utf-8

print u'基本参数';
def func1(x):
	return x;

print u'默认参数';
def func2(x,y=1):
	return x,y;

print u'坑，默认参数必须指向不变对象！别问理由！！！';
def func3(L=[]):
	L.append('end');
	return L;

print func3([1,2,3]);
print func3();
print func3();
print func3([1]);

print u'可变参数';
print u'可变参数将参数封装成一个tuple';

def func4(numbers):
	sum=0;
	for i in numbers:
		sum+=i;
	return sum;

l1=[1,2,3,4,5,6,7]
print func4(l1);
