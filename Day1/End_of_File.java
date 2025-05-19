import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class End_of_File {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i=1;
        while(sc.hasNext()){
            String S = sc.nextLine();
            System.out.println(i+" "+S);
            i++;
            // StringBuilder sb = new StringBuilder(S);
            // //sb=sc.nextLine();
            // int k=sb.length()-1;
            // if(sb.charAt(k)!='.'){
            //     System.out.print(i++);
            //     System.out.print(" "+sb.toString());
            //     System.out.println();
            // }
            // else{
            //     System.out.print(i++);
            //     System.out.print(" "+sb.toString());
            //     System.out.println();
            //     break;
            // }
                       
        }
                    sc.close();
    }
}
