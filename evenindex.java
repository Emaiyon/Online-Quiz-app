
    import java.util.Scanner;

public class evenindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at even indices:");
        for (int i = 0; i < n; i += 2) {
            System.out.println(arr[i]);
        }
    }
}

