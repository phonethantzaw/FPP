package Assignment4;

public class Porg3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumofArr(arr, arr.length));

    }

    public static int sumofArr(int[] arr, int len) {
        if (len == 0) {
            System.out.println("Base Case");
            return 0;
        } else {
            return arr[len - 1] + sumofArr(arr, len - 1);
        }
    }
}

/**
        sumofArr([1,2,3,4],0)
        sumofArr([1,2,3,4],1)		1+sumofArr([1,2,3,4],0)
        sumofArr([1,2,3,4],2)		2+sumofArr([1,2,3,4],1)
        sumofArr([1,2,3,4],3)		3+sumofArr([1,2,3,4],2)
        sumofArr([1,2,3,4],4)		4+sumofArr([1,2,3,4],3)
        main()

        Runtime Stack

        Console
        Base Case
        10
 **/


