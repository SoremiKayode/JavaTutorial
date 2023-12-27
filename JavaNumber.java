public class JavaNumber {
public static void main(String[] args){
/*
Primitive number types are divided into two groups:

Integer types stores whole numbers, positive or negative 
(such as 123 or -456), without decimals. Valid types are byte, 
short, int and long. Which type you should use, depends on the 
numeric value.

Floating point types represents numbers with a fractional part, 
containing one or more decimals. There are two types: float and double.
*/

// byte store between -128 to 127
byte myByte = 126;
System.out.println("Byte : " + myByte);
// The short data type can store whole numbers from -32768 to 32767
short myShort = -32768;
System.out.println("Short : " + myShort);
/*
 The int data type can store whole numbers from -2147483648 
 to 2147483647. In general, and in our tutorial, 
 the int data type is the preferred data type when we create 
 variables with a numeric value.
 */
int myInt = 2000000000;
System.out.println("Integer: " + myInt);

/*
 The long data type can store whole numbers from 
 -9223372036854775808 to 9223372036854775807. 
 This is used when int is not large enough to store the value. 
 Note that you should end the value with an "L":
*/
long myLong = 4000000000000L;
System.out.println("Long: " + myLong);

/* Float stores decimals number with up to six decimals, 
you should end a float with an f
*/

float myFloat = 3.85444f;
System.out.println("Float: " + myFloat);

/* 
double store fraction with up to 15 decimals
 */
double myDouble = 2.555666777345d;
System.out.println("Double: " + myDouble);

// scientific number are number with an e to indicate the power of 10
float scientificNumber = 35e3f;
double scientificNumber2 = 12E9d;

System.out.println("Float Scientific number: " + scientificNumber);
System.out.println("Double Scientific number: " + scientificNumber2);


}
}