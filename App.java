/*3) Leia o valor de N e mostre a série de Fibonacci até o termo N. 
A referida série funciona da seguinte forma:
Os dois primeiros termos são iguais a 1
O terceiro termo em diante é igual à soma dos dois termos anteriores
Exemplo até o 7º termo da referida série: 1 1 2 3 5 8 13 COM WHILE*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N:");
        int n = sc.nextInt();
        int anterior = 1;
        int posterior = 1;
        int atual = 0;
        while (anterior < n){ 
            System.out.println(atual + " ");
            anterior = posterior;
            posterior = atual;
            atual = anterior + posterior;
        }
    }
}