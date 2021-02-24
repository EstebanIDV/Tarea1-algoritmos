

public class bubble {
    static void bubbleSort(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    //Intercambia pares de elementos no ordenados
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }


    public static void main(String args[])
    {

            int n = 10000;
            sortArray arr = new sortArray(n);

            arr.printArray();
            long startTime = System.nanoTime();
            bubbleSort(arr.getArray());
            long endTime = System.nanoTime();
            System.out.println("Runtime: " + (endTime - startTime) / 1e6);
            System.out.println("Sorted array");
            arr.printArray();
    }

}
