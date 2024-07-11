import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,21,.....
        Scanner input =new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int s1=0;//başlangıç 0 değeri
        int s2=1;//başlangıç 1 değeri
        int toplam=0;
        int sayi=input.nextInt();
        for(int i =1;i<=sayi;i++){
            System.out.print(s1+" , ");

            toplam=s1+s2;
            s1=s2;
            s2=toplam;
        }
    }
}
