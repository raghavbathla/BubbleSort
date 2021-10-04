package bubleSort;

public class main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {34,40,50,50,39};
        bubbleSort.bubbleSort(arr);
        System.out.println("Sorted array is");
        bubbleSort.display(arr);
    }
}
