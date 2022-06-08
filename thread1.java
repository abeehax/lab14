package lab7;
import java.util.*;
import java.util.stream.*;
public class thread1
{
    public static void main(String[] args) {
    Integer[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
    Double[] doubleArray = { 1.1, 1.2, 2.1, 2.2, 3.1, 3.2, 4.1, 4.2 };
    Character[] characterArray = { 'P', 'A', 'K','I'};
     
  //print array starting from first element
    System.out.println("INTEGER ARRAY:");
    for(int i=0;i<intArray.length;i++)
         System.out.print(intArray[i] + "  ");
    
    System.out.println("");
    System.out.println( "DOUBLE ARRAY:");
    for(int i=0;i<doubleArray.length;i++)
         System.out.print(doubleArray[i] + "  ");
    
    System.out.println("");
    System.out.println("CHARACTER ARRAY:");
    for(int i=0;i<characterArray.length;i++)
         System.out.print(characterArray[i] + "  ");
     
    System.out.println();
     
    //print array starting from last element
    System.out.println("Original Array printed in reverse order:");
         for(int i=intArray.length-1;i>=0;i--)
         System.out.print(intArray[i] + "  ");
         
         System.out.println("");
         System.out.println("Original Array printed in reverse order:");
         for(int i=doubleArray.length-1;i>=0;i--)
         System.out.print(doubleArray[i] + "  ");
         
         System.out.println("");
         System.out.println("Original Array printed in reverse order:");
         for(int i=characterArray.length-1;i>=0;i--)
         System.out.print(characterArray[i] + "  ");
    }
}