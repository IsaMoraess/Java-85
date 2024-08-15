/*3) Leia o valor de N e mostre a série de Fibonacci até o termo N. 
A referida série funciona da seguinte forma:
Os dois primeiros termos são iguais a 1
O terceiro termo em diante é igual à soma dos dois termos anteriores
Exemplo até o 7º termo da referida série: 1 1 2 3 5 8 13 */
import java.util.Scanner;
public class atvd03For {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N");
        int n = sc.nextInt();
        System.out.println("------------------------");
        int anterior = 1;
        int posterior = 1;
        int atual = 0;
        for (int i = 0; i < n; i++){
            System.out.println(anterior);
            atual = anterior + posterior;
            anterior = posterior;
            posterior = atual;
        }
    }
}