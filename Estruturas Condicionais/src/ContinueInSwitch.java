public class ContinueInSwitch {
    public static void main(String[] args) {
        // Loop de exemplo
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteração " + i);

            switch (i) {
                case 0:
                    System.out.println("i é zero");
                    break;
                case 1:
                    System.out.println("i é um");
                    break;
                case 2:
                    System.out.println("i é dois, continuando para a próxima iteração");
                    continue; // Pula para a próxima iteração do loop for
                case 3:
                    System.out.println("i é três");
                    break;
                default:
                    System.out.println("i é outro valor");
            }

            System.out.println("Isso será impresso exceto quando i for 2");
        }
    }
}
