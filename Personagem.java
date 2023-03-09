public class Personagem{
    String nome;
    int energia, fome, sono;

    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome;
        this.energia = energia;
        this.fome = fome;
        this.fome = fome;
    }

    void cacar(){
        System.out.println(nome + " cacando");
    }

    void comer(){
        System.out.print(nome + " comendo\n");
    }
     
    void dormir(){
        System.out.printf("%s dormindo%n", nome);
    }


}