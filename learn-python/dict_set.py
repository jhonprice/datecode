# coding: utf-8
#dict
d={1 : 'a',2 : 'b',3 : 'c'};
print d;


for i in [1,2,3]:
	print d[i];

d[4]='d';
print d;

if 100 in d:
	print True;
else:
	print False

print d.get(4,-1);
print d.get(100,-1);

d.pop(1);
print d;

#set

a=[1,2,3]
s=set(a);
print s;

s.add(4);
s.add(3);
print s;
print '';

# set u'运算'
s1=set([1,2,3,4]);
s2=set([3,4,5,6]);

print s1&s2;
print s1|s2;
