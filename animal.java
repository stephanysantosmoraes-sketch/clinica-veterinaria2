public class animal {
    protected String Nome;
    protected String Especie;
    protected int Idade;

    public animal(String Nome, String Especie, int idade){
        this.Nome = Nome;
        this.Especie = Especie;
        this.Idade = Idade;
    }

    public void exibirInformacoes(){
        System.out.println("Nome:"+ Nome);
        System.out.println("Especie"+ Especie);
        System.out.println("Idade:"+ Idade);
    }

}