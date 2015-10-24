import java.util.Scanner;

public class bubbleSort{

  public static void main(String args[]){

     int i,a,b,swap;
     Scanner in = new Scanner(System.in);

     System.out.println("Enter number to sort");
     i = in.nextInt();
      int array[] = new int[i];
      System.out.println("You enter " + i + "integers");

      for(j =0;j< i;j++)
        array[j] = in.nextInt();

      for(j =0;j<(i - 1); j++){
        for(b =0;b<i-j-1;b++){
            if(array[b] > array[b+1]){
                swap =array[b];
                array[b] =array[b+1];
                array[b+1] = swap;
            }
          }
      }

      System.out.println("Sorted list of numbers");

       for(j=0;j<i;j++)
        System.out.println(array[j]);
          }
}
