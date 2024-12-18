import java.util.Scanner;
public class ArrayImp{
    public static void main(String[]args){
        int[]arr = new int[7];
        int size = 5;

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter data:");

       //getting input to the array
        for(int j = 0 ; j< arr.length; j++){
            arr[j] = userIn.nextInt();
        }
        //output the array
        for(int k= 0; k< arr.length ; k++){
            System.out.println(arr[k]);
        }


        System.out.println("Enter the index that uou want to change:");
        int index = userIn.nextInt();

        System.out.println("Enter the value you need to add there:");
        int value = userIn.nextInt();

        size++;

        for(int i = size ; i>=index ; i--){
            arr[i] = arr[i-1];
        }
    }
}