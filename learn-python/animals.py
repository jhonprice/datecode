#coding: utf-8
class Animals(object):
	
	def run(self):
		print type(self),'is running';
	def what(self):
		print 'animals';

class Dog(Animals):
	def run(self):
		print type(self),'is running';
	def eat(self):
		print type(self),'is eatting';

Dog().what();
