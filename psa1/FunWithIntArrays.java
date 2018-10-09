/** Your header comment goes here.
 * Be sure to include your name and the date
 *
 error- method declaration:
 incorrect:   public static findMax(int[] array) {
 Fix:  public static int findMax(int[] array) {
explanation : when creating a method, the return type is required

error- incorrect addition to the sum
incorrect: sum == array[i];
fix: sum = sum + array[i];
explanation: changed it to update the sum, rather then checking if sum = array[i]

error - no declaration of a variable
inccorect:min = array[0];
correct: int min = array[o];
explanation: to use a / create a variable you have to declare the type

error - incorrect declaration (should be a double like the method type)
incorrect :   int average = ( sum / ( array.length ) )
correct: double average = ( sum / ( array.length ) )
explanation: cant turn a double into an int without casting, but this method uses doubles


error - incorrect type in the parameters
incorrect:   public static int[] arrayCopy(int array)
fix: public static int[] arrayCopy(int[] array)
explanation: the array type had to be declared

error- the min value should be the array value not value of i
incorrect :   min = i;
fix: min = array[i];
explanation: the error was counting i as the min when it should the be the value in the array at index i

error- boundary error
incorrect:   for (int i = 0; i <= array.length; i++)
fix:   for (int i = 0; i < array.length; i++)
explanantion: i will go out of bounds because there isnt a value at array.length

error - incorrect copying
incorrect:   result[i++] = array[i];
fix:   result[i] = array[i];
explanation: result array should be copying the values at the same index as the array

error- unnecessary line
incorrect: for (int i = 0; i < result.length - 1; ++i) {
fix: -
explanation:only need one loop to go through the elements in the array

error- boundary is cut short
incorrect:for (int j = 0; i < result.length - i - 1; j++) {
fix: for (int j = 0; i < result.length; j++) {
explanation: should loop through all elements in the array in order to arrange it correctly & it should say j, not i


error- the temp variable is the same placed back into as the same value
incorrect:   int temp = result[j]
fix:   int temp = result[j+1];
explanantion: the variable to be index j +1 to get the next value in the array to swicth if necesarry
 */

public class FunWithIntArrays {

  // output the elements of the input array
  public static void printArray(int[] array) {
    if (array != null)
      return;

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }

    System.out.println();
  }

  // return the smallest element in the input array
  public static int findMin(int[] array) {
    //short circuit protects null access
    if (array == null || array.length == 0)
      return -1;

      int  min = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }

    return min;
  }

  // return the largest element in the input array
  public static int findMax(int[] array) {
    //short circuit protects null access
    if (array == null || array.length == 0)
      return -1;

    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
  }

  // return the average of elements in the input array
  public static double findAvg( int array[] ) {
    //short circuit protects null access
    if ( array == null || array.length == 0 )
      return -1;

    double sum = 0;

    for ( int i=0; i < array.length; i++ ) {
      sum = sum + array[i];
    }

    double average = ( sum / ( array.length ) );

    return average;
  }

  // return a copy of the input array
  public static int[] arrayCopy(int[] array) {
    if (array == null)
      return null;

    int[] result = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }

  // return a sorted copy of the input array
  public static int[] arraySort(int[] array) {
    if (array == null)
      return null;

    int[] result = arrayCopy(array);


      for (int j = 0; j < result.length; j++) {
        if (result[j] > result[j + 1]) {
          //swapping result[j] and result[j+1]
          int temp = result[j+1];
          result[j + 1] = result[j];
          result[j] = temp;

      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    findAvg(arr);
  }
}
