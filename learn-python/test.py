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
