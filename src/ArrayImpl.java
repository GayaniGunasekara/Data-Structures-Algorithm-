import java.util.Scanner;
public class ArrayImpl{
    public static void main(String[]args){
        int[]arr = new int[7];
        int size = 5;


// insert data to array
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


// insert data to middle of the array
        System.out.println("Enter the index that uou want to insert:");
        int index = userIn.nextInt();

        System.out.println("Enter the value you need to add there:");
        int value = userIn.nextInt();

        size++;

        for(int i = size ; i>=index ; i--){
            arr[i] = arr[i-1];
        }
        arr[index]= value;
        //output the array
        for(int k= 0; k< arr.length ; k++){
            System.out.println(arr[k]);
        }


// Delete operator
        System.out.println("Enter the index that you want to delete:");
        int indexdel = userIn.nextInt();

        for(int s = indexdel; s<size; s++){
            arr[s] = arr[s+1];
        }
        //output the array
        for(int k= 0; k< arr.length ; k++){
            System.out.println(arr[k]);
        }
        size --;



        // search data in an array
        System.out.println("ENter data you need to search:");
        int data = userIn.nextInt();

        int d;
        for(  d =0; d< arr.length; d++){
            if (arr[d]==data){
                break;
            }
        }
        System.out.println("The index of the data :"+ d);




        //update array

        System.out.println("Enter the index you need to update:");
        int indexUpdate = userIn.nextInt();
        System.out.println("Enter the data you need to update");
        int element = userIn.nextInt();
        arr[indexUpdate] = element;
        //output the array
        for(int k= 0; k< arr.length ; k++){
            System.out.println(arr[k]);
        }

    }
}
