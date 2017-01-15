package Sartr;

/**
 * Created by jiangli on 2017/1/15.
 */

import java.util.*;

public class dfs {
    public static void main(String[] args) {
        int arr[] = new int[6];
        for (int x = 0; x < 6; x++) {
            int a = myarray.myarr();
            for (int i = 0; i < 6; i++) {
                if (arr[i] == a || a == -1||a==5) {
                    a = myarray.myarr();
                    i = -1;
                }
            }
            arr[x] = a;
        }
        int b = 3;
        Arrays.sort(arr);
        System.err.print("######################################");
        System.out.print("\n");
        for (int a : arr) {
            System.out.print(" " + a);
        }
    }

    static class myarray {
        public static int myarr() {
            Random rand = new Random();
            int a = rand.nextInt(34);
            return a;
        }
    }

}

