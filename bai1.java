import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i;
        int j;
        int temp;
        System.out.print("Nhap n: ");
        n = scanner.nextInt();
        int[] a = new int[n];
        //nhap cac phan tu vao mang
        System.out.println("Nhap cac phan tu: ");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        //in cac phan tu trong mang ra
        System.out.print("cac phan tu gom: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        //sap xep lai cac phan tu co trong mang va in ra
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("\ncac phan tu sau sap xep gom: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
