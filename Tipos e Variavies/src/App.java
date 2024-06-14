public class App {
    public static void main(String[] args) throws Exception {
        int idade = 30; // Exemplo: atribuindo um valor à variável "idade"
        int anoFabricacao = 2021;
        double salarioMinimo = 2.500;

        System.out.println("Idade: " + idade);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Salário Mínimo: " + salarioMinimo);
    }

    public static class TipoDados {
        public static void main(String[] args) {
            byte idade = 123;
            short ano = 2021;
            int cep = 21070333;
            long cpf = 98765432109L;
            float pi = 3.14F;
            double salario = 1275.33;

            System.out.println("Idade: " + idade);
            System.out.println("Ano: " + ano);
            System.out.println("CEP: " + cep);
            System.out.println("CPF: " + cpf);
            System.out.println("Pi: " + pi);
            System.out.println("Salário: " + salario);
        }
    }
}
