public class DataType {
public static void main(String[] args) {
/*
Following are the dataytpe we have in java
Primitive Datatype : Bytes, short, long, int, float, double,
boolean and char

Non primitive data type : Strings, Arrays and Classes

Data    Type   Size	    Description
byte	1      byte	    Stores whole numbers from -128 to 127
short	2      bytes	Stores whole numbers from -32,768 to 32,767
int	    4      bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8      bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4      bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8      bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1      bit	    Stores true or false values
char	2      bytes	Stores a single character/letter or ASCII values

*/

// byte
byte MyByteVariable = 125;
short MyShortVariable = 30000;
int MyInttVariable = 20000000;
long MyLongVariable = 900000000;
float MyFloatVariable = 7.8989f; // float must end with an f
double  MyDoubleVariable = 8.00999965d; // doube must end with a d
boolean MyBooleanVariable = false;
char MyCharVariable = 'C';
String MyStringVariable = "Hellow world";

System.out.println("byte : " + MyByteVariable);
System.out.println("short : " + MyShortVariable);
System.out.println("int : " + MyInttVariable);
System.out.println("long : " + MyLongVariable);
System.out.println("Float : " + MyFloatVariable);
System.out.println("Double : " + MyDoubleVariable);
System.out.println("Boolean : " + MyBooleanVariable);
System.out.println("char : " + MyCharVariable);
System.out.println("String : " + MyStringVariable);

} 
}
