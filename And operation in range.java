/*

Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.

 

Example 1:

Input: left = 5, right = 7
Output: 4
Example 2:

Input: left = 0, right = 0
Output: 0
Example 3:

Input: left = 1, right = 2147483647
Output: 0
*/

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shiftCount = 0;

        while(left != right){
            left = (left >> 1);
            right = (right >> 1);
            shiftCount++;
        }

        return (left << shiftCount);
        
    }
}

// --------------------------------------------------------------------------------------------
// my solution
  
class rough2 {
    public static int[] bin(int a) {
        int arr[] = new int[32];
        int n = a;
        int c = 0;
        while (n > 0) {
            int temp = n % 2;
            arr[c] = temp;
            n = n / 2;
            c++;
        }

        return arr;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String artgs[]) {
        int l = 1;
        int r = 102421;
        int n = r - l + 1;

        int fin[] = new int[32];

        for (int i = 0; i < n; i++) {
            int temp = 0;
            int[] arr = bin(i + l);
            for (int j = 0; j < 32; j++) {
                if (arr[j] == 1) {
                    fin[j] += arr[j];
                } else {
                    temp = j;
                    fin[j] = 0;
                }
            }
            fin[temp] = 0;
        }
        print(fin);

        for (int i = 0; i < 32; i++) {
            if (fin[i] != n) {
                fin[i] = 0;
            } else {
                fin[i] = 1;
            }
        }
        System.out.println();
        print(fin);

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans += Math.pow(2, i) * fin[i];
        }

        System.out.println();
        System.out.println("final ans is : " + ans);
    }

}
