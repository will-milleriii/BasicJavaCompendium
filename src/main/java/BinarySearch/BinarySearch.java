package BinarySearch;

public class BinarySearch {

    public static void main(String[] args){
        System.out.println(BinSearch(new int[] {1, 3, 5, 7, 9, 11, 13}, 7));

    }

    public static int BinSearch(int[] arr, int x){
        int p = 0;
        int r = arr.length - 1;
        while(p <= r){
            int q = (p+r) / 2;
            if (x < arr[q]){
                r = q - 1;
            } else if (x > arr[q]){
                r = q + 1;
            } else {
                return q;
            }
        }
        return -1;
    }

}
