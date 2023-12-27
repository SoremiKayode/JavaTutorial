public class JavaOperators {
/* 
Operators are use to perform operations on variable
and values

Java opertors are divided into the following
Arithemetic Opertaor
Assigment operator
Comparison Operator
Logical Operator
Bitwise operator

This are the Arithemetic operator we have
+	Addition	Adds together two values	x + y	
-	Subtraction	Subtracts one value from another	x - y	
*	Multiplication	Multiplies two values	x * y	
/	Division	Divides one value by another	x / y	
%	Modulus	Returns the division remainder	x % y	
++	Increment	Increases the value of a variable by 1	++x	
--	Decrement	Decreases the value of a variable by 1	--x
*/

static byte a = 10;
static byte b = 12;
static byte c = 40;

static void ArithemeticOperator(){
System.out.println("Addition: " + a + b + c);
System.out.println("Subtraction: " + (c - b));
System.out.println("Division: " + (c / b));
System.out.println("Multiplication: " + (a * b * c));
System.out.println("Modulus: " + (c % a));

// incrementing
for(int x = c; x <= 50; x++){
System.out.println("Incrementing x by 1: " + x);
}

// decrementing
for(int x = c; x >= 20; x--){
System.out.println("Decrementing x by 1: " + x);
}

}

// Method for Assigment operator
static void AssigmentOperator(){
/* 
List of Assigment Operators
=	x = 5	x = 5	
+=	x += 3	x = x + 3	
-=	x -= 3	x = x - 3	
*=	x *= 3	x = x * 3	
/=	x /= 3	x = x / 3	
%=	x %= 3	x = x % 3	
&=	x &= 3	x = x & 3	
|=	x |= 3	x = x | 3	
^=	x ^= 3	x = x ^ 3	
>>=	x >>= 3	x = x >> 3	
<<=	x <<= 3	x = x << 3
*/

// we assing 50 to d
int d = 50;
int f = 30;
int g = 30;
int h = 30;
int i = 30;
System.out.println("d = " + d);
System.out.println("f = " + f);
System.out.println("g = " + g);
System.out.println("h = " + h);
System.out.println("i = " + i);
System.out.println("we assign 50 to the variable d : " + d);
// we reassign d to be the value of d + 10
d+= 10;
System.out.println("we reassign d to be the value of d + 10 : " + d);
f-= 10;
System.out.println("we reassign f to be the value of f - 10 : " + f);
g*= 5;
System.out.println("we reassign g to be the value of g * 5 : " + g);
h/= 5;
System.out.println("we reassign h to be the value of h / 5 : " + h);
i%= 7;
System.out.println("we reassign i to be whatever the remainder of i divided by 7 : " + i);
}

static void ComparisonOperator(){
/* 
Comparison operators are used to compare two values (or variables). 
This is important in programming, because it helps us to find answers 
and make decisions.

The return value of a comparison is either true or false. 
These values are known as Boolean values, and you will learn 
more about them in the Booleans and If..Else chapter.

In the following example, we use the greater than operator (>) 
to find out if 5 is greater than 3:

List of
==	Equal to	x == y	
!=	Not equal	x != y	
>	Greater than	x > y	
<	Less than	x < y	
>=	Greater than or equal to	x >= y	
<=	Less than or equal to	x <= y
*/

int j = 10;
int k = 30;

System.out.println("Equal to : " + (j = k));
System.out.println("Not equal to : " + (j != k));
System.out.println("Greater than : " + (j < k));
System.out.println("Greater tahn or equals to : " + (j >= k));
System.out.println("Less than or equal to : " + (j <= k));

}

static void LogicalOperator (){
/* 
Logical operators are used to determine the logic 
between variables or values:

List of logical operators
*/

int a = 10;
int b = 20;
int c = 40;

System.out.println("Logical and : " + (a > b && c > b));
System.out.println("Logical or : " + (a > b || c > b));
System.out.println("Logical not : " + (!(a > b && c > b)));

}

public static void main(String[] args){
ArithemeticOperator();
AssigmentOperator();
ComparisonOperator();
LogicalOperator();
}
}
