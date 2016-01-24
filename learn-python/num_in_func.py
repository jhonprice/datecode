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

