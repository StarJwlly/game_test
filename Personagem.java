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
        if(energia >= 2){
            System.out.println(nome + " cacando");
            setEnergia(energia - 2);
        }else{
            System.out.println(nome + " sem enegia para cacar");
        }
        setFome(fome + 1);
        setSono(sono + 1);
    }

    void comer(){
        if(fome >= 1){
            System.out.print(nome + " comendo\n");
            setEnergia(energia + 1);
            setFome(fome - 1);
        }else
            System.out.print(nome + " sem fome\n");
    }
     
    void dormir(){
        if(sono >= 1){
            System.out.printf("%s dormindo%n", nome);
            setEnergia(energia + 1);
            setSono(sono - 1);
        }else 
            System.out.printf("%s sem sono%n", nome);
    }

    void setFome(int fome) {
        if(fome > 10){
            System.out.println(nome + " esta morrendo de fome");
            this.fome = 10;
        }else
            this.fome = fome;
    }

    void setSono(int sono) {
        if(sono > 10){
            System.out.println(nome + " esta morrendo de sono");
            this.sono = 10;
        }else
            this.sono = sono;
    }

    void setEnergia(int energia){
        if(energia > 10)
            this.energia = 10;
        else
            this.energia = energia;
    }

}