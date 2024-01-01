public class JavaForLoop {
public static void main(String[] args){
/*
When you know how many time you want to
loop through a block of code, use the for loop

for (statement 1; statement 2; statement 3) {
  // code block to be executed
}

Statement 1 is executed (one time) before the execution of the code block.
Statement 2 defines the condition for executing the code block.
Statement 3 is executed (every time) after the code block has been executed.

printing out 12 multiplication table
*/

for(int i = 1; i < 13; i++) {
System.out.println("12 * " + i + " = " + (12 * i));
}

/* 
Nested for loop : You can put a for loop inside another for loop

The loop below will run the first iteration of the firt loop
then run all iteration of the inner loop, before running the next iteration 
of the first loop
*/

//first loop
for(int i = 2; i < 13; i++) {
System.out.println(i + " Times multiplication");
// inner loop (second loop)
for(int x = 1; x < 13; x++) {
System.out.println(i + " * " + x + " = " + (i * x));
}
System.out.println("  ");

}

/* 
Another variant of the for loop is the for each loop
it is use to specifically loop through elements of an array

*/

String daysOfWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
for(String i : daysOfWeek){
System.out.println(i);    
}

/* 
The break statement is use to jump out of a loop
The continue statement is used to skip a particular iteration of a loop

The fifth iteration will not run
while the code will end at the seventh iteration
*/

for(int i = 0; i < 10; i++){
if(i == 5){ 
continue; 
};

System.out.println(i);


if(i == 8){ 
break;


}


}
}
}