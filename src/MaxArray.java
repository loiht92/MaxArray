import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:"); //kiem tra kich thuoc mang//
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];  //nhap gia tri cho cac phan tu cua mang//
        int i =0 ;
        while (i < array.length){
            System.out.println("Enter element" + (i +1) + ":");
            array[i] = scanner.nextInt();
            i++ ;
        }
        System.out.println("List :"); // in ra danh sach da nhap//
        for (int j =0 ; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }

        int max = array[0]; //tim max cua cac phan tu//
        int index = 1;
        for (int j =0 ; j <array.length; j++){
            if (max < array[j] ){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Max List is" + " " +max + " " +"at position " + " " +index);
    }

}
