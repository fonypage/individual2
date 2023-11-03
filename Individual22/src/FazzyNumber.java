public class FazzyNumber implements Pair{
    int x;
    int e1;
    int e2;
    FazzyNumber(int x,int e1,int e2){
        this.x = x;
        this.e1 = e1;
        this.e2 = e2;
    }
    int getA1(){
        return x-e1;
    }
    int getB1(){
        return x+e2;
    }
    int getA(){
        return x;
    }
    public void plus(Pair other){
        if (other instanceof FazzyNumber){
            FazzyNumber number = (FazzyNumber) other;
            int a1 = getA() + number.getA() - getA1() - getB1();
            int c = getA()+ number.getA();
            int b1 = getA()+ number.getA() + number.getA1() + number.getB1();
            System.out.println("Сумма - New FazzyNumber: " + "(" + a1 + "," + c + "," + b1 + ")");
        }
    }
    public void minus(Pair other){
        if (other instanceof FazzyNumber){
            FazzyNumber number = (FazzyNumber) other;
            int a1 = getA() - number.getA() - getA1() - getB1();
            int c = getA() - number.getA();
            int b1 = getA() - number.getA() + number.getA1() + number.getB1();
            System.out.println("Вычитание - New FazzyNumber: " + "(" + a1 + "," + c + "," + b1 + ")");
        }
    }
    public void ymnoj(Pair other){
        if (other instanceof FazzyNumber){
            FazzyNumber number = (FazzyNumber) other;
            int a1 = (getA() * number.getA())-(number.getA()*getA1())-(getA()*getB1()) + (getA1()*getB1());
            int c = (getA()* number.getA());
            int b1 = (getA()* number.getA())+(number.getA()* number.getA1())+(getA()+number.getB1())+ number.getA1()* number.getB1();
            System.out.println("Умножение - New FazzyNumber: " + "(" + a1 + "," + c + "," + b1 + ")");
        }
    }
    public void delen(Pair other){
        if (other instanceof FazzyNumber){
            FazzyNumber number = (FazzyNumber) other;
            int a1 = (getA()-getA1())/(number.getA()+ number.getB1());
            int c = getA()/ number.getA();
            int b1 = (getA()+ number.getA1())/(number.getA()-getB1());
            System.out.println("Деление - New FazzyNumber: " + "(" + a1 + "," + c + "," + b1 + ")");
        }
    }
}