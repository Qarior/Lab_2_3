import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Podaj wysokość choinki:");
        int wysokosc = o.nextInt();
  
  
        for (int i = 1; i<=wysokosc; i++)
        {
            for(int j=0;j<wysokosc-i;j++)System.out.print(" ");
            for (int j = 0; j<(i*2)-1; j++)System.out.print("*");
            System.out.println(" ");
        }
  
    }
}