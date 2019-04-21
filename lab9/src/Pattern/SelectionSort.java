package strategy;

/*
    Source: https://www.geeksforgeeks.org/java-program-for-selection-sort/
 */

public class SelectionSort implements SortingStrategy {

    public void sort(int arr[]) throws Exception {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}



