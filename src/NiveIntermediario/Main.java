public class Main {
    public static void main(String[] args) {

        //criar o ninja sasuke - inicializando um objeto (classe)
        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke";
        Sasuke.aldeia = "Konoha";
        Sasuke.idade = 16;

        System.out.println(Sasuke.nome);
        System.out.println(Sasuke.aldeia);
        System.out.println(Sasuke.idade);

        //criando ninja Naruto
        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        System.out.println(Naruto.nome);
        System.out.println(Naruto.aldeia);
        System.out.println(Naruto.idade);

    }
}