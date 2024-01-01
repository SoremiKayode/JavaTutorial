import java.util.Scanner;
public class JavaIfElse {
/*
Java Conditions and If Statements
You already know that Java supports the usual logical 
conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for 
different decisions.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a 
specified condition is true
Use else to specify a block of code to be executed, 
if the same condition is false
Use else if to specify a new condition to test, 
if the first condition is false
Use switch to specify many alternative blocks of 
code to be executed
 */

public static void main(String[] args){
/*
we were task to write a code for movie website, which only allow
people above 18 years to sign up, if the person is 18 and above
we want to tell them they have successfully signed up, else we tell
they are not eligible that the website is restricted to people
above eighteen years

we use the scanner class to get input from the user
we create an object of the class and we use the nextInt method
to get an interger input from the user
 */
Scanner registrationObject = new Scanner(System.in);

System.out.println("Input your age in number");
int registrationAge = registrationObject.nextInt();

if(registrationAge > 18){
System.out.println("Congratulations you have been successfully registeered");
} else {
// we use the else when there are no more condition
System.err.println("Sorry registration is for people above eighteen years");
}

/*
Another case study : depending on the time of the day, 
we want to tell the user either good afternoon, good evening, or good night
we will be making use of the scanner method, user can input the
current time in their locality
 */
System.out.println("What time is it? time in 24 hours");
int timeOfTheDay = registrationObject.nextInt();

if(timeOfTheDay < 12){
System.out.println("Good morning Friend!");
} else if(timeOfTheDay >= 12 && timeOfTheDay < 18){
System.out.println("Good afternoon Friend!");
} else {
System.out.println("Good Evening Friend!");
}

/* 
There is also a short-hand if else, which is known as 
the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, 
and is most often used to replace simple if else statements:

let's rewrite our registration age to use ternary operator
*/
int yourAge = registrationObject.nextInt();
String result = (yourAge > 18) ? "Congratulations you have been successfully registeered" : "Sorry registration is for people above eighteen years";
System.out.println(result);
}
}