##2016/1/12 12:51:43 

### c语言的不确定参数 ###
c语言含有不确定数量的参数，如printf 原型为 int printf(char *,...);表第一个参数是字符串而其余参数不能确定

对参数个数不确定的函数 **stdarg.h**头文件提供了定义的标准方法

**Chapter 16待补充**

### 递归和反序问题 ###

在处理反序问题，递归比循环简单
>问题： 将整数转换成二进制（binary.c）

利用位操作也可以实现，**待补充 Chapter 15**

### 小心递归 ###

效率第一时小心递归，会导致参数的指数级增长

### 地址运算符& 间接运算符* ###

1. &取地址，%p表示
2. *取地址中的值
3. 指针声明 int *a
### 9.10 复习题 ###

#### 1 ####
-形式参数是一个变量，在被调用函数中进行定义，实际参数是函数调用中出现的值，它被赋值给形式参数可以把实际参数认为是函数被调用时来初始化形式参量的值

#### 2 ####

- void donut(int n)
- int gear(int a , int b)
- void stuff_it(doule a , double *b)

#### 3 ####

- char n_to_char(int a)
- int digits(double a, int b)
- int random(void)

#### 4 ####

	int sum(int a,int b)
	{
	
    	return a+b;
	}


#### 5 ####


	double sum(double a,double b)
	{
	
    	return a+b;
	}

#### 6 ####
error is on here

	void sum(int *a,int *b)
	{
		int d = *a + *b,c = *a - *b;
		a=&d;
		c=&c
	}

#### 8 ####
	int ma(int a,int b,int c)
	{
    	int max=(a>b ? a:b);
    	max=(max>c ? max:c);
    	return max;
	}
#### 9 ####


### const 只读 ###
 
const int a;

const int a[10];

**const指针是不可以赋值的**

### 指定初始化项目 c99 ###

	/*带方框的下标指定某个特定元素*/
	#include<stdio.h>
	#define MONTHS 13
	int main(void)
	{
    	int days[MONTHS]={0,31,28,[4]=31,30,31,[2]=29};
    	int i;
    	for(i=1;i<=MONTHS;i++)
    	{
        	printf("%2d %d\n",i+1,days[i]);
    	}
    	return 0;
	}

### 使用指针参数与指针的参数值 ###

sum_arr2.c中的start++就指向数组下一个元素

order.c中要区分执行顺序

	/*数组做参数*/
	#include<stdio.h>
	void add_array(int a[])
	{
    	a[1]++;
	}
	int main(void)
	{
    	int a[3]={0};
    	printf("%d%d%d\n",*a,*(a+1),a[2]);
    	add_array(a);
    	printf("%d%d%d\n",a[0],a[1],a[2]);
    	return 0;
	}
### **Warning：关于多维数组头部** ###
a[4][4]

请注意a并不是指向指针的指针，而是一个数组指针，也就是指向数组的指针，它的对象是一个某类型的数组，就像int *b，b的对象是一个整数一样。虽然说 *a的内容是数组的首地址，但并不妨碍，a指向的是一个数组而不是指针的事实，因为在内存中开辟的空间不同

函数调用