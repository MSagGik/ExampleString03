import java.util.Scanner;

public class ExampleString03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.nextLine();
        String p = in.nextLine();
        String c = in.nextLine();

        String[] wa = w.split(":");
        String[] pa = p.split(":");
        String[] ca = c.split(":");
        int[] arr1 = new int[2];
        for (int i = 0; i < wa.length; i++) {
            arr1[i] = Integer.parseInt(wa[i]);
        }

        int[] arr2 = new int[2];
        for (int i = 0; i < pa.length; i++) {
            arr2[i] = Integer.parseInt(pa[i]);
        }

        int[] arr3 = new int[2];
        for (int i = 0; i < ca.length; i++) {
            arr3[i] = Integer.parseInt(ca[i]);
        }
        int[] arr = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr2[i] - arr1[i] + arr3[i];
        }
        if (arr[1] < 10) {
            System.out.println(String.valueOf(arr[0]) + ":0" + String.valueOf(arr[1]));
        } else {
            System.out.println(String.valueOf(arr[0]) + ":" + String.valueOf(arr[1]));
        }
    }
}
