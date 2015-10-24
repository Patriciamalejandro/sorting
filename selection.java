 public class selection{

  public static int[] doSelectionSort(int[] srt) {

    for (int i = 0; i < srt.length - 1; i++) {

      int index = i;

      for (int j = i + 1; j < srt.length; j++) {

        if (srt[j] < srt[index]) {

          index = j;

        }

      }

      int smallerNumber = srt[index];
      srt[index] = srt[i];
      srt[i] = smallerNumber;

    }

    return srt;
  }

  public static void main(String a[]) {

    int[] srt1 = { 12, 94, 25, 6, 26, 5, 48, 54 };
    int[] srt2 = doSelectionSort(srt1);

    for (int i : srt2) {

      System.out.print(i);
      System.out.print(", ");

    }

  }
 }

