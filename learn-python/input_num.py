# coding: utf-8
print u'因为输入语句输出的全都是字符串，所以输入数字时需要强制转换，方法同c';
a=int(raw_input());
if a>50:
    print a;
else:
    print 'a<=50';
