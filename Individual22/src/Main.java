import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pair[] p;
        System.out.println("Введите кол-во элементов");
        int k = sc.nextInt();
        p = new Pair[k];
        for (int i = 0; i < k; i++) {
            System.out.println("1 - Нечёткие числа, 2 - Комплексные");
            int an = sc.nextInt();
            if(an == 1){
                System.out.println("Введите x,e1 и e2");
                int x = sc.nextInt();
                int e1 = sc.nextInt();
                int e2 = sc.nextInt();
                FazzyNumber fz = new FazzyNumber(x,e1,e2);
                System.out.println("Введите x,e1,e2 для второго числа");
                int x2 = sc.nextInt();
                int e12 = sc.nextInt();
                int e22 = sc.nextInt();
                FazzyNumber fz2 = new FazzyNumber(x2,e12,e22);
                fz.plus(fz2);
                fz.minus(fz2);
                fz.ymnoj(fz2);
                fz.delen(fz2);
            }
            if(an == 2){
                System.out.println("Введите a и b");
                int a = sc.nextInt();
                int b = sc.nextInt();
                Complex cx = new Complex(a,b);
                System.out.println("Введите a и b для второго числа");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                Complex cx2 = new Complex(a2,b2);
                cx.plus(cx2);
                cx.minus(cx2);
                cx.ymnoj(cx2);
                cx.delen(cx2);
            }
        }
    }
}