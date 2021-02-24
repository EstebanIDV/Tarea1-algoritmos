public class selection {

    static void selectionSort(int array[])
    {
        int aux;
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min]) {
                    //Intercambia pares de elementos no ordenados
                    min=j;
                }
            aux=array[i];
            array[i]=array[min];
            array[min]=aux;
        }

    }

    public static void main(String[] args) {
        int n = 10000;
        sortArray arr = new sortArray(n);

        arr.printArray();
        long startTime = System.nanoTime();
        selectionSort(arr.getArray());
        long endTime = System.nanoTime();
        System.out.println("Runtime: " + (endTime - startTime) / 1e6);
        System.out.println("Sorted array");
        arr.printArray();
    }
}
