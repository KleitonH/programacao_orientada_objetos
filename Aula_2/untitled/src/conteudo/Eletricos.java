package conteudo;

public class Eletricos extends Pokemon implements  Evolucao{

    String fraqueza;


    @Override
    public void atacar(Pokemon adversario){
        super.atacar(adversario);

        System.out.println("Esse ataque foi eletrico e causo.");
    }

    @Override
    public void defender() {
        System.out.println("Eletrico se defendeu!");
    }


    public Eletricos(String n, double t, int nivel, String tipo) {
        super(n, t, nivel, tipo);
        fraqueza="Terra";
    }

    public Eletricos(String n, double t, int nivel, String tipo,String fra) {
        super(n, t, nivel, tipo);
        fraqueza=fra;
    }

    @Override
    public void evoluir() {
        this.nome="Raichu";
        this.hp=200;
        this.tamanho=100;
    }
}

