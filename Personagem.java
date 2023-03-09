public class Personagem{
    private String nome;
    private int energia, fome, sono;

    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome;
        setEnergia(energia);
        setFome(fome);
        setSono(sono);
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
        System.out.println(obterEstado());
    }

    void comer(){
        if(fome >= 1){
            System.out.print(nome + " comendo\n");
            setEnergia(energia + 1);
            setFome(fome - 1);
        }else
            System.out.print(nome + " sem fome\n");
        System.out.println(obterEstado());
    }
     
    void dormir(){
        if(sono >= 1){
            System.out.printf("%s dormindo%n", nome);
            setEnergia(energia + 1);
            setSono(sono - 1);
        }else 
            System.out.printf("%s sem sono%n", nome);
        System.out.println(obterEstado());
    }

    private void setFome(int fome) {
        if(fome > 10){
            System.out.println(nome + " morrendo de fome");
            this.fome = 10;
        }else
            this.fome = fome;
    }

    private void setSono(int sono) {
        if(sono > 10){
            System.out.println(nome + " morrendo de sono");
            this.sono = 10;
        }else
            this.sono = sono;
    }

    private void setEnergia(int energia){
        if(energia > 10)
            this.energia = 10;
        else
            this.energia = energia;
    }

    String obterEstado(){
        return String.format("e(%d) s(%d) f(%d)", energia, sono, fome);
    }

}