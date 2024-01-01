public class JavaArray {
public static void main(String[] args){
/* 
Arrays are use to store multiple values in a single variable

These item of the array can be manipulated
*/

String daysOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
// To access an item in an array
System.out.println(daysOfWeek[1]);

// To change an item in the array
daysOfWeek[1] = "Sunday";
System.out.println(daysOfWeek[1]);

// to find how many item in an array
System.out.println("length of the array " + daysOfWeek.length);
System.out.println(" ");
// looping through an array using for loop
System.out.println("Looping through an array...");
for(int x=1; x < daysOfWeek.length; x++){
System.out.println(daysOfWeek[x]);    
}
System.out.println(" ");

// looping through an array using for each loop
System.out.println("looping through an array using for each loop");
for(String x : daysOfWeek){
System.out.println(x);
}

/* 
Multidimensional array 

multidimensional array are useful if you want to store data in tabular form
like table with rows and columns
*/

int myNumbers[][] = {{4, 5, 6, 7}, {4, 5, 6, 7}};
/*
Acessing element of multidimensional array

To access the elements of the myNumbers array, specify two indexes:
one for the array, and one for the element inside that array.
This example accesses the first array (0) in the second array (1) 
of myNumbers:
*/
System.out.println(myNumbers[0][2]);

/* 
Looping through a multidimensional array
*/

for (int i = 0; i < myNumbers.length; ++i) {
    for(int j = 0; j < myNumbers[i].length; ++j) {
      System.out.println(myNumbers[i][j]);
    }
  }
  
}
}