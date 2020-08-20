/*
 Fill in the blanks so that the program prints out every element, in order.
class CountArray{
  public static void main ( String[] args ){
    int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };
    for ( int index = 0 ;index < egArray.length ;index++ ){
      System.out.println(egArray[index]);
    }
  }
}
2.  Fill in the blanks below so that the elements of egArray are visited in reverse order, starting with the last element and counting down to element 0. (Copy and paste strings from anywhere on this page, if you want.)
            for ( int index= egArray.length - 1;index >= 0 ;index-- ){
     		 System.out.println(egArray[index]);
    	 }
3.  Fill in the blanks so that the program works as described. You may wish to copy and paste some of the following phrases. (Hint: you will need to use most phrases twice.)
import java.util.Scanner;

class InputArray{
public static void main (String[] args){
int[] array = new int[5];
int data;
Scanner scan = new Scanner(System.in);

// input the data
for(int index = 0; index < array.length; index++){
System.out.println("enter an integer: ");
data = scan.nextInt();
array[index] = data;
}

// write out the data
for (int index = 0; index < array.length; index++){
System.out.println("array[ " + index + " ] = " + array[index]);
}
}
}         

4. When an array is constructed it’s size can be variable. Fill in the blank.
    import java.util.Scanner ;

class InputArray
{

  public static void main ( String[] args )
  {

    int[] array;
    int   data;
    Scanner scan = new Scanner( System.in );

    // determine the size and construct the array
    System.out.print( "What length is the array? " );
    int size = scan.nextInt();

    array = new int[size]; 

    // input the data
    for ( int index=0; index < array.length; index++)
    {
      System.out.print( "enter an integer: " );
      array[ index ] = scan.nextInt();
    }
      
    // write out the data
    for ( int index=0; index < array.length; index++ )
    {
      System.out.println( "array[ " + index + " ] = " + array[ index ] );
    }

  }
}    
5.  Examine the following collection of integers:
-20, 19, 1, 27, 5, -1, 27, 19, 5


What is the maximum of the collection? 
27
How did you figure this out? 
looked at it
6. Fill in the blank so that max is initialized to a value that is guaranteed to be no larger than the maximum element of the array, no matter what values are in the initializer list.
class MaxAlgorithm
{

  public static void main ( String[] args ) 
  {

    int[] array =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
    int   max;

    // initialize the current maximum
 
    max = array[0];

    // scan the array
    for ( int index=0; index < array.length; index++ )
    {
     
        <more stuff goes here>


    }
      
    System.out.println("The maximum of this array is: " + max );
  }
}     


7. Open BlueJ and run the following code:
class MaxAlgorithm
{
  public static void main ( String[] args ) 
  {
    int[] array =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
    int   max;

    // initialize the current maximum
    max = array[0];

    // scan the array
    for ( int index=0; index < array.length; index++ )
    { 
      if ( array[ index ] > max )    // examine the current element
        max = array[ index ];        // if it is the largest so far, change max
    }     
    System.out.println("The maximum of this array is: " + max );
  }
}     
****Change the test part of the for to
index < array.length-1


Now run the program again on the above test cases.
Will the program (with the changed loop) find the correct maximum of the data that is given in the original initializer list? 
yes
When will the program not work correctly? 
when the max is the last value in the array
Is it obvious that there is a bug? 
yes
8. What happens when the following code is run?
int[] myWeeklyPay = {769, 588, 1245, 309, 388, 902};
int sum = 0;

for ( int j=0; j<=6; j++ ) sum += myWeeklyPay[j];

error; index 6 of myWeeklyPay does not exist


9.  Flll in the blanks to find the minimum in the array: 
class MinAlgorithm
{

  public static void main ( String[] args ) 
  {

    int[] array =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
    int   min;

    // initialize the current minimum
    min = array[0];


    // scan the array
    for ( int index=0; index < array.length; index++ )
    { 
     if(array[index] < min){
min = array[index];
}
    }
      
    System.out.println("The minimum of this array is: " + min );
    
     10.  Write a small program which computes the average of an array.

	//assuming int[] array has been initialized and filled with values

double sum = 0;
double average = 0;
for(int index = 0; index < array.length; index++){
sum += array[index];
}
average = sum / array.length;
*/