package conteudo;

public abstract class Pokemon {
    String nome;
    String tipo;
    int nivel;
    double tamanho;
    double hp;



    public void atacar(Pokemon adversario){
        double dano=(Math.random()*10);
        adversario.hp -= dano;
        System.out.println(dano);
        //adversario.hp=adversario.hp-dano;
    }

    public void atacar(Pokemon adversario, int dano){
        adversario.hp -= dano;
        //adversario.hp=adversario.hp-dano;
    }
    abstract public void defender();

    public void apresentar(){
        System.out.println(this.nome);
        System.out.println(this.nivel);
        System.out.println(this.tamanho);
        System.out.println(this.tipo);
        System.out.println(this.hp);
    }



    public Pokemon(String n, double t, int nivel,String tipo){
        this.nome= n;
        this.tamanho=t;
        this.tipo=tipo;
        this.nivel=nivel;
        this.hp=100;
    }

}
