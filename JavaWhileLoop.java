public class JavaWhileLoop {
public static void main(String[] args){
/*
loops are use to repeatedly run a block of code until
certain condition is met.

int the code below, the code block will run over andover until 
i is greater than 13
*/

int i = 1;
while (i < 13){
System.out.println("2 * " + i + " = " + (2 * i));
i++;
}

/*
Another variant of th while loop, is the do while loop,
the do will run once, then the while will run as long as a certain con
dition is met 
*/
byte x = 1;
do {
System.out.println("3 * " + x + " = " + (3 * x));
x++;
} while(x < 13);
}
}
