/*
IPS-23
You have been assigned to find the addition of similarities of the string with each of its suffixes. Note: Consider the input string is also one of the suffixes.

For example, if the input string is “pqpqpp” then the suffixes of the string are "pqpqpp", "qpqpp", “pqpp", "qpp", " pp" and "p". 
The similarities of these strings with the string "pqpqpp" are 6,0,3,0,1, & 1 respectively. Therefore, the output should be 6 + 0 + 3 + 0 + 1 + 1 = 11.

Note: For any two strings, S1 and S2, the similarity of the strings is calculated by the length of the longest prefix common to both the strings. 
For example, the similarity of strings "pqr" and "pqs" is 2, while the similarity of strings "ppp" and "pppq" is 3.

Write a PAC, Pseudocode/Algorithm and Java code to perform the above operation.

Input:
A string

Output:
Addition of similarities between a string and suffixes of string


Input
rajrajkumar
Expected output
15

*/

============================================================================================================================================================


import java.util.*;

class rough2{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        String s = "rajrajkumar";    // String s = sc.next();
        int l = s.length();
        char arr[] = new char[l];
        int count = 0;

        for(int i =0; i<l ;i++){
            arr[i] = s.charAt(i);
        }

        int n = 0;
        do{
            System.out.println();
            System.out.println("new iteration : ");
            char st[] = new char[l-n];

            int k = 0;
            for(int i=0; i<(l-n) ; i++){
                st[i] = arr[k+n];
                k++;
            }

            // print the new array ------------------------------
            for(int i=0; i<(l-n) ; i++){
                System.out.print(st[i]+" ");
            }
            System.out.println();
            System.out.println("***");
            // ---------------------------------------------------

            for(int i=0 ;i<(l-n) ;i++){
                if(s.charAt(i) == st[i]){
                    count++;
                }
                else{
                    break;
                }
                System.out.print(count+" ");
                
            }
            System.out.println("\n-----");

            n++;
        }while(n<l);
        System.out.println(count);
    }
}



// ------------------------------------------------  updated function  --------------------------------------------
// gives output as 18 because there is 3 more similarities in the substrings
// r in jkumar
// r in umar
// a in mar
// these 3 extra similarites not found in the above code
// and actually at the time, sir is also wrong hahaa.....

public static int count(String s) {
        int sum = s.length();
        int len = s.length();

        for (int i = 1; i < s.length(); i++) {
            String temp = s.substring(i, len);

            for (int j = 0; j < len - i; j++) {
                // System.out.println(s.charAt(j) + " " + temp.charAt(j));
                if (s.charAt(j) == temp.charAt(j)) {
                    sum += 1;
                }

            }
            System.out.println(s);
            System.out.println(temp);
            System.out.println(sum);
            System.out.println();

        }

        return sum;
    }
