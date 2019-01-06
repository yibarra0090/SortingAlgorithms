public class SortingAlgorithm {
    public static void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] randIntArr(int count){
        int[] num = new int[count];
        for(int i = 0; i < count; i++){
            num[i] = (int)(Math.random()*10001);
        }
        return num;
    }
    public static void bubbleSort(int[] arr){
        int swapCount = 1;
        while (swapCount != 0){
            swapCount = 0;
            for(int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    swapCount ++;
                }
            }
    }
}
}

