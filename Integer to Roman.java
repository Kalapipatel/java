/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= num <= 3999
*/

------------------------------------------------my code -------------------------------------
class Solution {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();

        int i=1;
        while(num>0){
            int a = num % 10;

            a  = a * i;
            s.insert(0,roman(a));

            num /= 10;
            i = i*10;
        }
        return s.toString();
    }

    public String roman(int n){
        if(n == 1) return "I";
        else if(n == 2) return "II";
        else if(n == 3) return "III";
        else if(n == 4) return "IV";
        else if(n == 5) return "V";
        else if(n == 6) return "VI";
        else if(n == 7) return "VII";
        else if(n == 8) return "VIII";
        else if(n == 9) return "IX";
        else if(n == 10) return "X";      //--
        else if(n == 20) return "XX";
        else if(n == 30) return "XXX";
        else if(n == 40) return "XL";
        else if(n == 50) return "L";
        else if(n == 60) return "LX";
        else if(n == 70) return "LXX";
        else if(n == 80) return "LXXX";
        else if(n == 90) return "XC";
        else if(n == 100) return "C";      //--
        else if(n == 200) return "CC";
        else if(n == 300) return "CCC";
        else if(n == 400) return "CD";
        else if(n == 500) return "D";
        else if(n == 600) return "DC";
        else if(n == 700) return "DCC";
        else if(n == 800) return "DCCC";
        else if(n == 900) return "CM";
        else if(n == 1000) return "M";
        else if(n == 2000) return "MM";
        else if(n == 3000) return "MMM";
        else return "";
    }
}

---------------------------------------------------------------------------------------

class Solution {
    private int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        // loop through each symbol, stopping if num becomes 0
        for(int i = 0; i < val.length && num > 0; i++) {
            // repeat while the current symbol still fits into num
            while(val[i] <= num) {
                num -= val[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
        
    }
}

// time: O(1)
// space: O(1)


---------------------------------------------------------------------------------------

class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        while (num >= 1000) {
            roman.append("M");
            num -= 1000;
        }

        if (num >= 900) {
            roman.append("CM");
            num -= 900;
        }

        while (num >= 500) {
            roman.append("D");
            num -= 500;
        }

        if (num >= 400) {
            roman.append("CD");
            num -= 400;
        }

        while (num >= 100) {
            roman.append("C");
            num -= 100;
        }

        if (num >= 90) {
            roman.append("XC");
            num -= 90;
        }

        while (num >= 50) {
            roman.append("L");
            num -= 50;
        }

        if (num >= 40) {
            roman.append("XL");
            num -= 40;
        }

        while (num >= 10) {
            roman.append("X");
            num -= 10;
        }

        if (num >= 9) {
            roman.append("IX");
            num -= 9;
        }

        while (num >= 5) {
            roman.append("V");
            num -= 5;
        }

        if (num >= 4) {
            roman.append("IV");
            num -= 4;
        }

        while (num > 0) {
            roman.append("I");
            num--;
        }

        return roman.toString();
    }
}


---------------------------------------------------------------------------------------

class Solution {
    public static String intToRoman(int num) {
    String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
}
}
