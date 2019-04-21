public class SortingStrategies {

    public static SortingStrategy BUBBLE_SORT = (data) -> {
            for (int i = data.length; --i>=0; ) {
                boolean flipped = false;
                for (int j = 0; j<i; j++) {
                    if (data[j] > data[j+1]) {
                        int T = data[j];
                        data[j] = data[j+1];
                        data[j+1] = T;
                        flipped = true;
                    }
                }
                if (!flipped) {
                    return;
                }
            }
        };

    public static SortingStrategy INSERTION_SORT = (data) -> {
            for (int i = 1; i < data.length; i++) {
                int key = data[i];
                int j = i - 1;
                while (j >= 0 && data[j] > key) {
                    data[j + 1] = data[j];
                    j = j - 1;
                }
                data[j + 1] = key;
            }
        };

    public static SortingStrategy SELECTION_SORT = (data) -> {
            int n = data.length;
            for (int i = 0; i < n-1; i++)
            {
                int minElem = i;
                for (int j = i+1; j < n; j++) {
                    if (data[j] < data[minElem])
                        minElem = j;
                }

                int temp = data[minElem];
                data[minElem] = data[i];
                data[i] = temp;
            }
        };

}