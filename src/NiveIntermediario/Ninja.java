public class Ninja {
    String nome;
    String aldeia;
    int idade;
    int idadeMinima;

    //criar um metodo publico personalizado para mostrar as informações do ninja
    /*
    O metodo void não retorna nada, ele apenas executa uma ação
     */
    public void SharinganAtivado() {
        System.out.println("Sharingan Ativado");

    }

    /*
    O metodo que retorna um valor, pode ser String ou qualquer outro tipo de dados
     */
    public String EuSouUmNinja() {
        return "Olá, eu sou num Ninja";
    }

    public int AnosParaSeTronarHokage(int idadeMinima) {
        return idadeMinima - idade;
    }
}
