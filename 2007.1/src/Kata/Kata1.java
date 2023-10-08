package Kata;

import java.util.Arrays;

public class Kata1 {
    public static boolean isSelfDivisor(int number){
        int common=number;
        int a;
        while (common>0){
            a=common;
            a%=10;
            if(a==0||number%a!=0) return false;
            common/=10;
        }
        return true;
    }
    public static int[] firstNumSelfDivisors (int start, int num){
        int count = num;
        int i=0;
        int[] myArray = new int[num];
        while(count>0){
            if (!isSelfDivisor(start)){
                start++;
            }
            else {
                myArray[i]=start;
                i++;
                start++;
                count--;
            }
        }
        return myArray;
    }
    public static void main(String[] args) {
        int b=11;
        int c=26;
        int num=7;
        System.out.print(isSelfDivisor(b));
        System.out.print("\n");
        System.out.print(isSelfDivisor(c));

        System.out.print("\n");
        System.out.print(Arrays.toString(firstNumSelfDivisors(b, num)));

    }
}
