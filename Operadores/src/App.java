public class App {
    public static void main(String[] args) throws Exception {
        // classe Operadores.java
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
    }

    public static class ternario {
        public static void main(String[] args) {
            // classe Operadores.java
            int a, b;

            a = 5;
            b = 5;

            /*
             * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
             * if(a==b)
             * resultado = "verdadeiro";
             * else
             * resultado = "falso";
             */

            // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String resultado = (a == b) ? "verdadeiro" : "false";

            System.out.println(resultado);

        }

    }

    public static class logico {
        public static void main(String[] args) {
            // ComparacaoAvancada.java
            int numero1 = 1;
            int numero2 = 1;

            if (numero1 == 2 && numero2++ == 2)
                System.out.println("As 2 condições são verdadeiras");

            System.out.println("O numero 1 agora é " + numero1);
            System.out.println("O numero 2 agora é " + numero2);

            // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2
            // )

        }

    }
}
