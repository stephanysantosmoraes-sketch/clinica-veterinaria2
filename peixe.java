public class peixe extends animal{
    private String escama;
    private String cor;
    private String Habitat;
    private int tamanho;

    public peixe(String Nome, String Especie, int Idade, String escama, String cor, String habitat, int tamanho){ 
        super(Nome, Especie, Idade);
        this.escama = escama;
        this.cor = cor;
        this.Habitat = habitat;
        this.tamanho = tamanho;
    }
    @Override
    public void exibirInformacoes(){
        System.out.println("====Peixe====");
        System.out.println("Nome:"+Nome);
        System.out.println("Especie:"+Especie);
        System.out.println("Idade:"+Idade);
        System.out.println("Escama:"+escama);
        System.out.println("Cor:"+ cor);
        System.out.println("Habitat:"+ Habitat);
        System.out.println("Tamanho:"+ tamanho);
    }
}