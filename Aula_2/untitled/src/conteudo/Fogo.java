package conteudo;

public class Fogo extends Pokemon {
    String fraqueza;

    @Override
    public void defender() {
        //bem simples
        System.out.println("Defendeu");
    }

    public Fogo(String n, double t, int nivel, String tipo) {
        super(n, t, nivel, tipo);
        fraqueza= "Agua";
    }
}
