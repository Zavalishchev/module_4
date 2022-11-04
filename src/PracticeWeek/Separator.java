package PracticeWeek;

//методы even() и odd(), должны возвращать массив четных или нечетных чисел, отобранных из array

public class Separator {
    public int[] array;

    public Separator(int[] array) {
        this.array = array;
    }
    public int[] even() {
        int k = 0;
        int n = 0;
        for (int i : array) {
            if(i % 2 == 0) k++;
        }
        int[] evenArr = new int[k];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArr[n] = array[i];
                n++;
            }
        }
        return evenArr;
    }
    public int[] odd() {
        int k = 0;
        int n = 0;
        for (int i : array) {
            if (i % 2 != 0) k++;
        }
        int[]oddArr = new int[k];
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                oddArr[n] = array[i];
                n++;
            }
        }
        return oddArr;
    }
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }



    public static void main(String[] args) {
        Separator sep = new Separator(new int[] {5, 0, 1, 2, 3, 4, 5});
        sep.printArr(sep.odd());
    }
}
