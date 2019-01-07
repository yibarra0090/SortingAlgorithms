public class BubbleSortRunner{
    public static void main(String [] args){
        //Create a random array of int
        int [] testArr =  SortingAlgorithm.randIntArr(10);
        int [] oriTestArr = testArr;

        System.out.print("Before: ");

        //Print is out before you sort
        for (int num:testArr){
            System.out.print(num+" ");
        }

        System.out.println();

        //Sort is using bubbleSort
        SortingAlgorithm.bubbleSort(testArr);

        int [] finTestArray = testArr;
        //Print it out after you sort
        System.out.print("After: ");
        for (int num:testArr){
            System.out.print(num+" ");
        }
        System.out.println();


        if( SortingAlgorithm.checkSort(testArr) && SortingAlgorithm.checkSum(oriTestArr,finTestArray)){
            System.out.print("The Algorithm is successful!");
        }

        System.out.println();
        long time = System.nanoTime();
        SortingAlgorithm.bubbleSort(SortingAlgorithm.randIntArr(10));
        time = System.nanoTime() - time;

    System.out.println("Time Taken: " + time);
    }
}


