import java.util.Random;

public class sortArray {
    int[] array;

    public sortArray(int n) {
        this.array = new int[n];
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = (new Random()).nextInt(n);
        }
    }

    void printArray()
    {
        for (int i=0; i<this.array.length; ++i)
            System.out.print(this.array[i] + " ");
        System.out.println();
    }

    public int[] getArray() {
        return array;
    }
}
