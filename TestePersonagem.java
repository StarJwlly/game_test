public class TestePersonagem{
    public static void main(String... args) throws Exception{
        Personagem p = new Personagem("Joao", 10, 0, 0);

        while(true){
            p.cacar();
            p.comer();
            p.dormir();
            p.cacar();
            p.cacar();
            p.cacar();
            System.out.println("======================");
            Thread.sleep(5000);
        }
    }
}