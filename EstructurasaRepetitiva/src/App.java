import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        System.out.println("Que tabla de multiplicar desea ver?");
        byte n = lector.nextByte();
        byte x= 1;

        while(n <= 0){
            System.out.println("No puede ser menor o igual 0");
            System.out.println("Vuelva a ingresarlo");
            n = lector.nextByte();
        }


        while(x <= 10){
            {System.out.println(n + "x" + x + " = " + n*x);
            x ++;
        }
            
        }
    }
}