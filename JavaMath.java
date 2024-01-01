public class JavaMath {
public static void main(String[] args) {
/* Following are some of the java math method */

// getting the minimum and maximum values
int MinNumber = Math.min(10, 30);
int MaxNumber = Math.max(10, 30);
// square root
double SquatRoot = Math.sqrt(16);
// absolute value
int AbsoluteValue = Math.abs(-450);
// .random return number between 0.0 (inclusive) and 1.0 (exclusive),
double randomNumber = Math.random(); 
// exponential E^x
double exponential = Math.exp(5);
// floor : retrun the value of x rounded down to the nearest integer
double Floor = Math.floor(302.5664);
// return the natural logarithm
double naturalLog = Math.log(6);
// return log base 10
double logBase10 = Math.log10(14);
// return the value of x rounded to the nearest interger
long roundedToInterger = Math.round(4.5678);

System.out.println("Minimum number " + MinNumber);
System.out.println("Maximum number " + MaxNumber);
System.out.println("SquatRoot " + SquatRoot);
System.out.println("Absolute value " + AbsoluteValue);
System.out.println("Random Number " + randomNumber);
System.out.println("Exponent " + exponential);
System.out.println("Floor " + Floor);
System.out.println("Natural logarithm " + naturalLog);
System.out.println("Log base 10 " + logBase10);
System.out.println("Rounded to neares interger " + roundedToInterger);

}
}
