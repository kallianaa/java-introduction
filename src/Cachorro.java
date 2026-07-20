public class Cachorro extends Ser {
    String nomeDono;

    // Constructor
    public Cachorro(String nome, int idade, String nomeDono) {
        super(nome, idade);
        this.nomeDono = nomeDono;
    }

    @Override
    public String saudacao() {
        return "Au Au!";
    }
}
