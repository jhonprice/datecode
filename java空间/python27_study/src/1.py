# usr/bin/env python
# -*- coding: utf-8 -*-

#from collections import Iterable

l=[0,1];

for i in range(2,100):
    l.append(l[i-1]+l[i-2]);
    
print l;