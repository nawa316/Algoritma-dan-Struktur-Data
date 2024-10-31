public class Main {
    public static void main(String[] args) {
        int[] before = {
          5, -4, 3, 2, 1, 10
        };

        for (int i = 0; i < before.length; i++){
            System.out.print(before[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < before.length; i++){
            System.out.print(bubbleSort(before)[i] + ", ");
        }
    }

    public static int[] selectionSort(int[] before){
        int[] after = null;
        int minimumIndex;

        for (int i = 0; i < before.length-1; i++){
            minimumIndex = i;
            for (int j = i+1; j < before.length; j++){
                if (before[j] < before[minimumIndex]){
                    minimumIndex = j;
                }
            }

            int temp = before[i];
            before[i] = before[minimumIndex];
            before[minimumIndex] = temp;
        }

        after = before;
        return after;
    }

    public static int[] bubbleSort(int[] before){
        boolean flag = false;

        do {
            flag = false;
            for(int i = 0; i < before.length-1; i++) {
                if (before[i] > before[i + 1]) {
                    int temp = before[i];
                    before[i] = before[i + 1];
                    before[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);

        return before;
    }
}