public class JavaVariable {
public static void main(String[] args){
/*

Variable are like container tahat stores a value

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

To declare a variable first declare the type, 
follow by the name of the variable, then the =, then the value of the variable
that correspond to the type you declared.

type variableName = value;

 */
// variable as string
String studentName = "Frank Blohoop";
System.out.println("This is the student name");
System.out.println(studentName);

// variable as a interger
int studentAge = 18;
System.out.println("This is the student age");
System.out.println(studentAge);

// You can just declare a variabel and assign value later;
String studentClass;

studentClass = "Level 3";
System.out.println("This is the student class");
System.out.println(studentClass);

// when you reaasign a value to a variable, it will overwrite the pr
// previous one eg.tThe last declared overwrite what is above it, add f after he float

float studentHeight = 13.7f;
studentHeight = 14.5f;

System.out.println(studentHeight);

// To aboid overwriting use final at the beginning of the variable
final  String greetingsText = "I have a wonderful week, what about you?";
System.out.println(greetingsText);

// You can declare multiple variable and print them out 
int x = 6;
int y = 10;
int z = 12;

System.out.println(x + y + z);

// Or you can declare them in one line 
int f = 6, g = 10,  h = 30;
System.out.println(f + g + h);

//You can assign one value to multiple variables
int a, b, c;
a = b = c = 30;
System.out.println(a + b + c);
}
}
