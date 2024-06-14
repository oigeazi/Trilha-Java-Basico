public class MinhaClasse {

    public static void main(String[] args) {
        System.out.print("Olá Mundo, estou estudando java \n");

        String primeiroNome = "Geazi";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}
