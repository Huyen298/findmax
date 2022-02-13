import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("Enter the size");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Too long");
            }
        }while (size>20);
        array= new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Element"+(i+1)+" : ");
            array[i]= scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max= array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max){
                max=array[j];
            }
        }
        System.out.println("Phần tử lớn nhất là: "+max);
    }
}
