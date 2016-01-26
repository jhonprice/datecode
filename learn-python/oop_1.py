#coding: utf-8
class Student(object):

	def __init__(self):
		self.name = '1';
		self.score = '2';
	
	def print_score(self):
		print "%s"%self.name;
		return;

a=Student();

a.print_score();
