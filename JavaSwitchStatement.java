public class JavaSwitchStatement {
/*
Instead of usin many if statements, one can use the switch statement
the switch statement select one of many block of code to run

This is how it works:

The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional, and will be described
later in this chapter
*/
public static void main(String[] args){
byte dayOfTheWeek = 7;
switch (dayOfTheWeek) {
    case 1 :
        System.out.println("Today is Sunday");
        break;
    case 2 :
        System.out.println("Today is Monday");
        break;
    case 3 :
        System.out.println("Today is Tuesday");
        break;
    case 4 :
        System.out.println("Today is Wednesday");
        break;
    case 5 :
        System.out.println("Today is Thursday");
        break;
    case 6 :
        System.out.println("Today is Friday");
        break;
    case 7 :
        System.out.println("Today is Saturday");
        break;
    default:
        System.out.println("What day of the week is today");
}
}
}
