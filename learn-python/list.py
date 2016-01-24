# coding: utf-8
# init

l1=[1,2,3,4,5,6,7,8,9,10,11,12];

# output
print l1[0];
print l1[-1];

print len(l1);
# add
l1.append('a');
l1.insert(1,'0');
print l1;

# delete
l1.pop(-1);
l1.pop(1);
l1.insert(0,0);
print l1;

# add list in list
l11=[1,2,3,4,5];
l1.append(l11);
print l1;
l1[-1].pop(-1);
print l1;
