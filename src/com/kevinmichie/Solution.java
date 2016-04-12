package com.kevinmichie;

import java.util.Scanner;

/**
 * Created by kevinmichie on 4/11/16.
 */
public class Solution {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String emptyString = "";
    int maxLength = 0;
    int tempLength = 0;

    public String newString() {
        while (n > 0) {
            if (n % 2 == 0) {
                emptyString += "0";
                n = n / 2;
            }
            if (n % 2 == 1) {
                emptyString += "1";
                n = n - 1;
                n = n / 2;
            }
        }
        return emptyString;
    }



    public void printVariable(){
        System.out.println(countingConsectutives(newString()));
    }

    int j = 1;
    int k = 0;
    int l;
    public int countingConsectutives(String values) {
        for (int i = 0; j <=values.length(); i++) {
            if (values.substring(i,j) == "0") {
                k+=1;
                j++;
            }
            else{
                k++;
                j++;
                if (k > l){
                    l = k;
                }
            }

        }
        return l;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printVariable();
    }
}
