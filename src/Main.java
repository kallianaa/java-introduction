import java.util.ArrayList;

public class Main {

    String nome;

    protected int salary;

//    static String nome2;

    public static void main(String[] args) {
        // System.out.println(nome2);

    }

    private void atualizaSalary() {
        this.salary = 1000;
    }
    
    public int getSalary() {
        this.atualizaSalary();
        return this.salary;
    }    
        // void declaraNome(){
        //     nome = "Kalliana";
        // }

        // String getNome() {
        //     return nome;
        // }


        byte b = 100;
        short s = 10000;
        int j = 100000;
        long l = 10000000000L;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        String str = "Hello, Java!";
        boolean bool = true;


        // int [] idade = new int[10];
        // String [] nomes = new String[10];
        // boolean [] saoBrasileiros = new boolean[10];

        // ArrayList<Integer> idades = new ArrayList<Integer>();
        // int[] idades1 = new int[10];
        // idades1.length
        // idades.add(22);
        // idades.add(30);
        // idades.remove(0);
        // idades.get(1);
        // idades.size();


        // int idade = 10;
        // for (var i = 0; i < idade; i++) {
        // System.out.println("oi");
        // }

        // int i = 0;
        // while (i < idade) {
        //     i++;
        //     System.out.println("oi");
        // }


        // int idade1 = 30;
        // double idade2 = idade1;

        // idade1 = (int) idade2;

        // char letra = 'A';
        // String nome = String.valueOf(letra);
        // letra = nome.charAt(0);
        // String nome2 = String.valueOf(idade1);
        // idade1 = Integer.parseInt(nome2);


//        public Main(String nome) {
//            this.nome = nome;
//        }
//        public Main(String nome, int idade) {
//            this.nome = nome;
//            this.idade = idade;
//        }
}

