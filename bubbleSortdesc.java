import java.util.Scanner;

public class bubbleSortdesc{

  public static void main(String args[]){

     int a,b,c,swap;
     Scanner in = new Scanner(System.in);

     System.out.println("Enter number to sort");
     c = in.nextInt();
      int array[] = new int[c];
      System.out.println("You enter " + c + "integers");

      for(a =0;a< c;a++)
        array[a] = in.nextInt();

      for(a =0;a<(c - 1); a++){
        for(b =0;b<c-a-1;b++){
            if(array[b] < array[b+1]){
                swap =array[b];
                array[b] =array[b+1];
                array[b+1] = swap;
            }
        }
      }

      System.out.println("Sorted list of numbers");

       for(a=0;a<c;a++)
        System.out.println(array[a]);

  }

}
