package RecursiveSearch;

public class Recursion {

    public static void main(String[] args){
        reduceByOne(20);
        System.out.println(recursiveLinearSearch(new int[] {4, 48, 4, 28, 34, 76, 9, 3}, 0, 28));
        System.out.println(recursiveBinarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 0, 7, 4));
    }

    public static void reduceByOne(int n) {
        if (n >= 0) {
            reduceByOne(n - 1);
        }
        System.out.println(n);
    }

    public static int recursiveLinearSearch(int[] arr, int i, int x){
        //if i > n, then return -1
        if (i > arr.length - i){
            return -1;
            //else if A[i] == x return i
        } else if (arr[i] == x){
            return i;
            //else return recursion(A, i + 1, x)
        } else {
            System.out.println("index at: " + i);
            recursiveLinearSearch(arr, i + 1, x);
        }
        return i;
    }


    public static int recursiveBinarySearch(int[] arr, int p, int r, int x){
        //if p > r return -1
        if (p > r){
            return -1;
            //else

        } else {
            //set q to p + r / 2
            int q = (p + r) / 2;
            //if arr[q] ==x return q
            if (arr[q] == x) {
                return q;
            } else if (arr[q] > x){
                return recursiveBinarySearch(arr, p, q-1, x);
            } else {
                return recursiveBinarySearch(arr, q+1, r, x);
            }
        }

        //else
            //set q to p + r / 2
            //if arr[q] ==x return q

            //else if A[q] > x return recursiveBinarySearch(A, p, q-1, x)
            //else return recursiveBinarySearch(A, q+1, r, x)

        //
    }

}
