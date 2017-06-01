import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        stairCase();
    }

    private static void stairCase() {
        Scanner kb=new Scanner(System.in);
        int size=kb.nextInt();

        for(int i=1;i<=size;i++){
            for(int j=0;j<=size;j++){
                if(size-i-1<j || j <=i)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}