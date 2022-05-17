/*Fazer um program para ler um numero inteiro N  e os dados (nome e preço) de N produtos
Armazena os N produtos em um vetor .Em seguida , mostrar o preço médio dos produtos.

  input  3- Tv 900.00 - Freyer 400.00 - Stove 800.00]
  output AVERAGE PRICE = 700.00*/
public class Produto {
    //Atributos
    private String name;
    private double price;

    //Construtor
    public Produto(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Get para retornar o atributo

    public String getName(){
        return name;
    }
    //para modificar
    public void setName(String name){
        this.name = name;
    }
    //Lembrando se eu tiver um atributo que nunca pode ser mudado - tbm chado de primerayKey como cpf

    //Eu não vou ter o set dele

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
