public class TestePersonagem{
    public static void main(String... args){
        Personagem p = new Personagem("Joao", 100, 0, 0);

        p.cacar();
        p.comer();
        p.dormir();
    }
}