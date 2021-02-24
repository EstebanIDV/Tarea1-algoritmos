public class merge {
    static void merging(int array[], int start, int half, int end)
    {
        int index1 = half - start + 1;
        int index2 = end - half;

        int[] left= new int[index1];
        int[] right= new int[index2];

        for (int i = 0; i < index1; i++)
            left[i] = array[start + i];
        for (int j = 0; j < index2; j++)
            right[j] = array[half + 1 + j];


        int i = 0;
        int j = 0;
        int k = start;

        while (i < index1 && j < index2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < index1) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < index2) {
            array[k] = right[j];
            j++;
            k++;
        }

    }

    static void mergeSort(int[] array, int start, int end)
    {
        if(start<end){
            int half = start+((end-start)/2);
            mergeSort(array, start,half);
            mergeSort(array, half+1, end);
            merging(array, start, half, end);
        }else{
            return;
        }


    }

    public static void main(String[] args) {
        int n = 10000;
        sortArray arr = new sortArray(n);

        arr.printArray();
        long startTime = System.nanoTime();
        mergeSort(arr.getArray(), 0,  arr.getArray().length-1);
        long endTime = System.nanoTime();
        System.out.println("Runtime: " + (endTime - startTime) / 1e6);
        System.out.println("Sorted array");
        arr.printArray();
    }
}
