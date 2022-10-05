import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float peso;
        float altura;
        float imc;


        System.out.println("Digite Sua Altura: ");
        altura = teclado.nextFloat();
        System.out.println("Digite seu peso");
        peso = teclado.nextFloat();

        imc = peso/(altura*altura);

        if(imc <= 18.4){
            System.out.println("Abaixo do peso");
        } else if (imc >=18.5 && imc <= 24.9){
            System.out.println("peso normal");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 39.9){
            System.out.println("Obesidade");
        }
    }
}
