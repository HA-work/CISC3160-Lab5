
/**


* @author Hassan Akbar


* @since 02-13-2019


* @version 1.0


*


* Description: ATM program and Euro Writing Program


*/






//package atm;



import java.util.Scanner;



import java.io.PrintStream;



public class ATM{



public static void main(String[] args) throws Exception {




Scanner in = new Scanner(System.in);




System.out.println("*************************************************");


System.out.println(" This program takes a value in Dollars and tells you the least number of bills you need to get it");


System.out.println("*************************************************");



System.out.println("Enter a dollar value without the dollar sign.");


double moneyRequested =in.nextDouble();





int remainder = (int) moneyRequested;



double centsLeft = Math.round( ((moneyRequested % 1) * 100)); //* had to round answer because of .01 giving 0


int numberOf20s = (remainder / 20);


remainder = (remainder % 20);



int numberOf10s = (remainder / 10);


remainder = (remainder % 10);



int numberOf5s = (remainder / 5);



int numberOf1s = (remainder % 5);



System.out.println("*************************************************");


System.out.println(" to make $ " + moneyRequested + " you would receive");



System.out.println( " the number of $20 bills you would receive is " + numberOf20s + " and that is equal to $" + (20 * numberOf20s));



System.out.println(" the number of $10 bills you would receive is " + numberOf10s + " and that is equal to $" + (10 * numberOf10s));



System.out.println( " the number of $5 bills you would receive is " + numberOf5s + " and that is equal to $" + (5 * numberOf5s));



System.out.println( " the number of $1 bills you would receive is " + numberOf1s + " and that is equal to $" + (1 * numberOf1s));



System.out.println( "and the number of cents left over is " + centsLeft);



System.out.println("*************************************************");





PrintStream ps = new PrintStream("Euro.txt");




final double DOLLARS_PER_EURO = 1.13;



double euroRequested = Math.round(((moneyRequested/DOLLARS_PER_EURO)*100)/100);// had to round because of certain cent values




int euroRemainder = (int) euroRequested;



double euroCentsLeft = Math.round( ((euroRequested % 1) * 100)); //* needed to round because of certain cent values


int euroNumberOf20s = (euroRemainder / 20);


euroRemainder = (euroRemainder % 20);



int euroNumberOf10s = (euroRemainder / 10);


euroRemainder = (euroRemainder % 10);



int euroNumberOf5s = (euroRemainder / 5);



int euroNumberOf1s = (euroRemainder % 5);





ps.println("*************************************************");



ps.println( "$" + moneyRequested + " = " + "\u20AC" + euroRequested);



ps.println(" to make " + "\u20AC" + euroRequested + " you will receive");



ps.println( " the number of \u20AC 20 bills you would receive is " + euroNumberOf20s + " and that is equal to \u20AC" + (20 * euroNumberOf20s));



ps.println(" the number of \u20AC 10 bills you would receive is " + euroNumberOf10s + " and that is equal to \u20AC" + (10 * euroNumberOf10s));



ps.println( " the number of \u20AC 5 bills you would receive is " + euroNumberOf5s + " and that is equal to \u20AC" + (5 * euroNumberOf5s));



ps.println( " the number of \u20AC 1 bills you would receive is " + euroNumberOf1s + " and that is equal to \u20AC" + (1 * euroNumberOf1s));



ps.println( "and the number of cents left over is " + euroCentsLeft);



ps.println("*************************************************");






/**


* Output


*************************************************


to make $ 11.3 you would receive


the number of $20 bills you would receive is 0 and that is equal to $0


the number of $10 bills you would receive is 1 and that is equal to $10


the number of $5 bills you would receive is 0 and that is equal to $0


the number of $1 bills you would receive is 1 and that is equal to $1


and the number of cents left over is 30.0


*************************************************


*/









/**


* Output sent to file


* *************************************************


$11.3 = €10.0


to make €10.0 you will receive


the number of € 20 bills you would receive is 0 and that is equal to €0


the number of € 10 bills you would receive is 1 and that is equal to €10


the number of € 5 bills you would receive is 0 and that is equal to €0


the number of € 1 bills you would receive is 0 and that is equal to €0


and the number of cents left over is 0.0


*************************************************


*


*/





}






}

