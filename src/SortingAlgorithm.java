public class SortingAlgorithm {
    public static void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] randIntArr(int count){
        int[] num = new int[count];
        for(int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random()*10001);
        }
        return num;
    }
    public static void bubbleSort(int[] arr){
        int swapCount = 0;
        while (swapCount > 0){
            for(int i = 0; i < arr.length; i++){
                if (arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                    swapCount ++;
                }
            }
    }
}}

