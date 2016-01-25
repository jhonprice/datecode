#coding:utf-8

print u'生成器可以理解为一个特殊的函数';

# 第一种创建方法
g1=(x for x in range(11));
print g1;

#第二种创建方式
def fib(max):
	a=0;b=1;c=0;
	for n in range(1,max):
		yield b;
		a,b=b,a+b;
			

for i in fib(10):
	print i;
