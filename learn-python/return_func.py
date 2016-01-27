#coding:utf-8
def lazy_sum(*args):
	def sum():
		ax=0;
		for i in args:
			ax+=i;
		return ax;
	return sum;

l=[1,2,3,4,5]

f=lazy_sum(*l);
print f;
print f();
print u'返回函数中的内部函数是，返回一个等到调用时再执行的函数'
print u'内部函数使用外部参数的局部变量，返回时所有的变量都保存在返回的内部函数中，此内部函数称为闭包'
print u'每一个闭包都是不同的，局部变量不断的被新函数使用'
print u'返回闭包时牢记的一点就是：返回函数不要引用任何循环变量，或者后续会发生变化的变量。'
print u'如果需要循环，则在闭包外再套一层闭包'


def count():
	fs = [];
	for i in range(1, 4):
		def g(i):
			def f():
				return i*i;
			return f;
		fs.append(g(i));
	return fs;

f1,f2,f3=count();

print f1();
print f2();
print f3();

