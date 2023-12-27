public class JavaString {
/* 
A String variable contains a collection of characters 
surrounded by double quotes:
*/
public static void main(String[] args){
String Greeting  = "Hello world";
System.out.println(Greeting);

// string length
System.out.println("The lenght of the string is " + Greeting.length());
// Converting to uppercase
System.out.println("String converted to upper case " + Greeting.toUpperCase());
// string converted to lower case
System.out.println("String converted to lower case " + Greeting.toLowerCase());
/* 
Finding a Character in a String
The indexOf() method returns the index (the position) of 
the first occurrence of a specified text in a string 
(including whitespace):
*/
System.out.println("return the first occuremce of H in the string : " + Greeting.indexOf("world"));
// returning the character at a specified index
System.out.println("returning the character at a specified index : " +
 Greeting.charAt(3));

// Returns the Unicode of the character at the specified index
System.out.println("Returns the Unicode of the character at the specified index : " +
Greeting.codePointAt(3));

// Compares two strings lexicographically
System.out.println("Compares two strings lexicographically return 0 if they are the same: " +
Greeting.compareTo("Hello world"));

// Checks whether a string contains a sequence of characters
System.out.println("Checks whether a string contains a sequence of characters: " +
Greeting.contains("Hello"));

// Checks whether a string ends with the specified character(s)
System.out.println("Checks whether a string ends with the specified character(s): " +
Greeting.endsWith("world"));

// Compares two strings. Returns true if the strings are equal, and false if not
System.out.println("Compares two strings. Returns true if the strings are equal, and false if not: " +
Greeting.equals("Hello world"));

// Compares two strings, ignoring case considerations
System.out.println("Compares two strings, ignoring case considerations: " +
Greeting.equalsIgnoreCase("Hello world"));

// Checks whether a string is empty or not
System.out.println("Checks whether a string is empty or not: " +
Greeting.isEmpty());

/*
 Searches a string for a match against a regular expression, 
 and returns the matches
 */
System.out.println("Searches a string for a match against a regular expression, and returns the matches: " +
Greeting.matches("/*.world"));

/*
 Searches a string for a match against a regular expression, 
 and returns the matches
 */
System.out.println("Searches a string for a specified value, and returns a new string where the specified values are replaced: " +
Greeting.replace("world", "universe"));

/*
Replaces each substring of this string that matches the given 
regular expression with the given replacement
 */
System.out.println("Replaces each substring of this string that matches the given regular expression with the given replacement: " +
Greeting.replaceAll("world", "universe"));

/* 
Checks whether a string starts with specified characters
you can also specify the offset
 */
System.out.println("Checks whether a string starts with specified characters: " +
Greeting.startsWith("Hello"));

/* 
Splits a string into an array of substrings
 */
System.out.println("Splits a string into an array of substrings: " +
Greeting.split(" ")[0]);

/* 
Removes whitespace from both ends of a string
 */
System.out.println("Removes whitespace from both ends of a string: " +
"   This is Great   ".trim());

//
}
}
