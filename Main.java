import java.util.Scanner;
import java.math.MathContext;
public class Main {
    public static void main(String[] args){
        int a,b,c,hipotenus,u ;
        Scanner input = new Scanner(System.in);
        float alan,ucgeninCevresi;
        //Üçgenin hipotenüs uzunluğunu bulma
       // System.out.println("Üçgenin dik kenarlarını giriniz: ");
       // a = input.nextInt();
       // b = input.nextInt();
        //hipotenus= (a*a)+(b*b);
       // System.out.println("Hipotenüs uzunluğu: "+Math.sqrt(hipotenus));

        System.out.println("Üçgenin kenarlarını giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        u=(a+b+c)/2;
        System.out.println(u);
        ucgeninCevresi =u*2;
        System.out.println("Üçgenin çevresi: "+ucgeninCevresi);

        alan = u * (u-a) * (u-b) * (u-c);
        System.out.println("Üçgenin alanı: "+Math.sqrt(alan));


    }
}
