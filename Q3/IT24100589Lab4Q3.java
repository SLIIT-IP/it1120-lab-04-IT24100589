import java.util.*;
public class IT24100589Lab4Q3{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter a number:");
int num=input.nextInt();
String result=(num>0)?"positive number":(num<0)?"negative number":"zero";
System.out.print(result);
}
}