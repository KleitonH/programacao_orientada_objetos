//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon pok1=  Pokemon.capturar("Pikachu",5,2,"Eletrico");
        Pokemon pok2=  Pokemon.capturar("Snorlax",30,5,"Normal");

        //reuso
        pok1.apresentar();
        pok2.apresentar();



        pok2.apresentar();


        pok1.atacar(pok2);
        pok1.atacar(pok2,50);
        pok2.apresentar();

        Pokemon p3= new Pokemon();

        if(pok1!=pok2){
            System.out.println("diferentes");
        }
    }
}