import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        String str;
        str = "elo";
        str += " mordo";
        if ("elo mordo".equals(str))
            System.out.println("It works!");
        else
            System.out.println("It doesn't work...");

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj imie i nazwisko:");
        String name = in.nextLine();
        System.out.println("Podaj wiek:");
        int a = in.nextInt();
        System.out.println(name + " " +  a + "\n");
        //wczytanie najpierw inta potem linii nie dziala, pewnie
        //trzeba sflushowac bufor
    }
}
