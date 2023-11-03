public class Complex implements Pair{
    int a,b;
    Complex(int a,int b){
        this.a = a;
        this.b = b;
    }
    int getA(){
        return a;
    }
    int getB(){
        return b;
    }
    public void plus(Pair other){
        if(other instanceof Complex){
            Complex number = (Complex) other;
            int a3 = (getA()+ number.getA());
            int b3 = (getB()+ number.getB());
            System.out.println("Сумма - Complex: (" + a3 + "+" + b3 + "i)");
        }
    }
    public void minus(Pair other){
        if(other instanceof Complex){
            Complex number = (Complex) other;
            int a3 = (getA()- number.getA());
            int b3 = (getB()- number.getB());
            System.out.println("Разность - Complex: (" + a3 + "+" + b3 + "i)");
        }
    }
    public void ymnoj(Pair other){
        if(other instanceof Complex){
            Complex number = (Complex) other;
            int a3 = ( (getA() * number.getA()) - (getB() * number.getB()) );
            int b3 = ( (getA() * number.getB()) + (number.getA()*getB()) );
            System.out.println("Умножение - Complex: (" + a3 + "+" + b3 + "i)");
        }
    }
    public void delen(Pair other){
        if(other instanceof Complex){
            Complex number =(Complex) other;
            int a3 = ( (getA() * number.getA()) + (getB() * number.getB()) ) / ( (number.getA() * number.getA()) + (number.getB() * number.getB()) );
            int b3 = ( (getB() * number.getA()) - (getA() * number.getB()) ) / ( (number.getA() * number.getA()) + (number.getB() * number.getB()) );
            System.out.println("Деление - Complex: (" + a3 + "+" + b3 +"i)");
        }
    }
}
