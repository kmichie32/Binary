package com.kevinmichie;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    //This will print the binary backwards, but
    //I care about the number of consecutive 1's
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
        String emptyString = "";
    while(n > 0){
        if(n % 2 ==0){
            emptyString += "0";
            n = n / 2;
        }
        if (n % 2 ==1){
            emptyString +="1";
            n= n-1;
            n = n / 2;
        }
    }
        String[] strArray = new String[emptyString.length()];
        int j = 1;

        for(int i = 0; i < emptyString.length(); i++){
            strArray[i] = emptyString.substring(i,j);
            j++;
        }

        for (int q = 0; q < strArray.length; q++){
            System.out.println(strArray[q]);
        }

        int maxLength = 0;
        for(int z = 0; z < strArray.length; z++){
            int tempLength = 0;
                tempLength += 1;
            }

        }

    }

