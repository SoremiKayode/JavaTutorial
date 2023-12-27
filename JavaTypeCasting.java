public class JavaTypeCasting {
/*
Type casting is when you assign a value of one 
primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to 
a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a 
smaller size type
double -> float -> long -> int -> char -> short -> byte

Widening casting is done automatically when passing a
smaller size type to a larger size type:
*/


static int myInt = 12;
static double myDouble = myInt;

/* 
Narrowing casting is done manually, it is when converting
to a larer sizeto a smaller size
 */
static double myDouble2 = 5.0d;
static int myInt2 = (int) myDouble2;
public static void main(String[] args){
System.out.println("Widening casting : from small to large " + myDouble);
System.out.println("Narrow casting : from large to small " + myDouble2);
}
}
