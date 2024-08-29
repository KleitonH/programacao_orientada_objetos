package conteudo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Fogo pokemon=  new Fogo("Charmander",4,4,"fogo");
        Eletricos eletrico= new Eletricos("Pikachu",6,6,"Eletrico");
        pokemon.atacar(eletrico);
        eletrico.atacar(pokemon);
        eletrico.defender();
        pokemon.defender();
        eletrico.evoluir();
        eletrico.apresentar();

    }
}

