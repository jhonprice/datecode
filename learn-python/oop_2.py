#coding: utf-8
class Student(object):

	def __init__(self):
		self.__name = '1';
		self.__score = '2';
	
	def print_score(self):
		print self.__score;

a=Student();

print a._Student__name;
