import java.util.*;
public class IT24100589Lab4Q1{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter a number:");
int num=input.nextInt();
if (num>0) {
  System.out.print("positive number");
}
  else if (num<0){
 System.out.print("negative number");
}
 else {
System.out.print("number is zero");
}
}
}

