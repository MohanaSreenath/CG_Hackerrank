import java.util.Scanner;

public class Output_Formatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int a = s1.length();
                System.out.print(s1);
                //loop just sapces
                for(int j=0;j<15-a;j++)
                System.out.print(" ");
                //kjs bksgfskj fbskhfskfgs
                System.out.printf("%03d",x);
                System.out.println();
            }
            System.out.println("================================");
            sc.close();

    }
}



