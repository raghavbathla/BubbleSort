package bubleSort;

public class BubbleSort {
    public void bubbleSort(int arr[]){
        int length = arr.length;
        for (int i = 0; i < length-1; i++)
            for (int j = 0; j < length-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public void display(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();


    }

}
