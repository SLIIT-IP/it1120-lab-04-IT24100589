import java.util.*;
public class IT24100589Lab4Q2{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
System.out.print("Please enter the exam marks(out of 100):");
double exam_marks=input.nextDouble();
System.out.print("Please enter the lab submission marks(out of 100):");
double labsubmission_marks=input.nextDouble();
if (((0>exam_marks)||(exam_marks>100))||((0>labsubmission_marks)||(labsubmission_marks>100))){
System.out.println("Invalid input for marks");
}
else{
System.out.print("please enter the percentage for the exam:");
double percentage_exam=input.nextDouble();
System.out.print("please enter the percentage for the lab submission:");
double percentage_labsubmission=input.nextDouble();
double Final_marks=((labsubmission_marks)*(percentage_labsubmission)/100)+((exam_marks)*(percentage_exam)/100);
System.out.println("Final marks is"+" "+Final_marks);
}
}
}