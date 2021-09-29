package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
        System.out.println("how many side does your dice have:");
        int diceSides = input.nextInt();
        System.out.println("how many rolls do you want:");
        int noRolls = input.nextInt();
        int[] tallyCount = new int[diceSides];
        for (int i=0;i<diceSides;i++){
            tallyCount[i] = 0;
        }
        Random random = new Random();


        while (noRolls>0) {
            noRolls--;
            int roll = (random.nextInt(diceSides+1));
            tallyCount[roll]++;
        }
        System.out.println(Arrays.toString(tallyCount));



    }
}
