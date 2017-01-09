import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        p[0]=0;
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt()+p[p_i];
        }
        int y=n*c*m;
        int x=p[n-1];
        int z=c*m;
        if(x>y){
            for(int p_i=0; p_i < n; p_i++){
            if(p[p_i]>z){
            System.out.println("No");
                break;
            }
            }
        }else{
            System.out.println("Yes");
        }
    }
}
