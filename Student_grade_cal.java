import java.util.*;
 
public class Task_2_Student_Grade_Calculator {
    public static void main(String[] args) 
    {
        int count , i;
        float totalMarks = 0; 
        float percentage , average;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++)
        {
            totalMarks += scanner.nextInt();
        }
         
        System.out.println("TOTAL MARKS =  : " + totalMarks);
    
        percentage = (totalMarks / (count * 100)) * 100;
 
        switch ((int) percentage / 10) 
        {
        case 9:
            {
                System.out.println("Grade : A+");
            break;
            }
        case 8:
            {
                System.out.println("Grade : A-")

            }
        case 7:
            {
                System.out.println("Grade : A");
            break;
            }
        case 6:
            {
                System.out.println("Grade : B");
            break;
            }
        case 5:
            {
                System.out.println("Grade : C");
            break;
            }
        default:
            {
                System.out.println("Grade : D");
            break;
            }
        }
    }
}