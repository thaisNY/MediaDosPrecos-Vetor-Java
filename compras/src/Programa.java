import java.util.Scanner;
import java.util.Locale;
public class Programa {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        //Ler N- numeros de produtos a ser digitados
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //instanciando o vetor
        Produto [] vect = new Produto[N];
        //Percorrendo o vetor para ler cada posição

        //Vou inserir cada elemento do vetor
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();   //só para consumir a quebra de linha
            String name = sc.nextLine();
            double price = sc.nextDouble();
            //instanciando cada elemento do vetor
            vect [i] = new Produto(name, price);
        }
        //soma do preço de todos os produtos
        double sum = 0.0;
        //Percorrendo o vetor para adicionar a soma o preço de cada produto
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        //calculo da media dos produtos
        double avg = sum / vect.length;
        System.out.printf("Average price = %.2f %n",avg);
        sc.close();
    }
}
