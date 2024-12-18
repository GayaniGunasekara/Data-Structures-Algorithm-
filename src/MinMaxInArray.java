public class MinMaxInArray {

        public static void findMaxMin(int[]arr){
            int max = arr[0];
            int min = arr[0];
            for( int i=1 ; i < arr.length ; i++){
                if( max < arr[i]){
                    max = arr[i];
                }
                if (min > arr[i]){
                    min = arr[i];
                }
            }
            System.out.println("Maximum of the array " + max);
            System.out.println("Minimum of the array " + min);
        }
        public static void main (String []args){

            int []arr = {35,56,78,98,76,43,23};
            findMaxMin(arr);
        }
    }



