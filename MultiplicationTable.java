import java.util.Arrays;
import java.util.Scanner;
public class MultiplicationTable
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int table[][]; // initialization of the two dimensional array
      int x, y, a;
      
      System.out.println("Enter the starting value: ");
      x = in.nextInt();
      
      System.out.println("Enter the ending value: ");
      y = in.nextInt();
      a = (y - x) + 1;
      table = new int [a][a]; // variable a will set the value of the rows and columns, for example if a is 5, this array will be a 5x5 
      
      loadArray(table, x, y); // call a method that will load the array with values
   }
   
   public static void loadArray(int table[][], int x, int y)
   {
      int z;
      z = (y - x) + 1;
      int d = x;
      int c = x;
      for (int i = 0; i < z; i++){ // this for loop increments after the nested for loop is done loading values in the first row 
         int g = d;
         for (int j = 0; j < z; j++){ // this nested for loop loads each multiple of the starting value * the starting value + 1 after each iteration
            table[i][j] = c * g;
            g++;  
            }
            c++;
         }              
            
      printMultiplicationTable(table, x, y); // calls a method to print out the multiplication table 
   }         
              
   public static void printMultiplicationTable(int table[][], int x, int y)
   {            
      int z, c, g;
      c = x;
      g = x;
      z = (y - x) + 1;
      System.out.print("       "); 
      for (int q = 0; q < z; q++){ // this for loop prints out the top of the multiplication table with the starting value to the ending value
         System.out.printf("%3d", g);
         System.out.print(" ");
         g++;
      }
      
      System.out.println();
      
      for (int u = 0; u < z + 2; u++){ // prints out a line to separate the top of the multiplication table with the output from the following for loop
         System.out.print("- - ");
      }
      
      System.out.println();
      
      for (int i = 0; i < z; i++){ // this for loop prints out the side of the multiplication table with the starting value to the ending value
         System.out.printf("%3d", c);
         System.out.print("  | ");
         for (int j = 0; j < z; j++){ // this nested for loop prints out the values within the array in a multiplication table like format  
            System.out.printf("%3d", table[i][j]);
            System.out.print(" ");
            }
            System.out.println();
            c++;
         }          
   }
}