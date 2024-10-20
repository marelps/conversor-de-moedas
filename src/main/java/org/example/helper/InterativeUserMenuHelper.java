package org.example.helper;

public class InterativeUserMenuHelper {
    public static void principalMenu() {
        System.out.print("================================\n\n" +
                "*Seja bem-vindo/a ao Conversor de Moeda =] \n" +
                "(1) Dólar ==> Peso argentino \n" +
                "(2) Peso argentino ==> Dólar \n" +
                "(3) Dólar ==> Real brasileiro \n" +
                "(4) Real brasileiro ==> Dólar \n" +
                "(5) Dólar ==> Peso colombiano \n" +
                "(6) Peso colombiano ==> Dólar \n" +
                "(0) Sair \n" +
                "================================ \n" +
                "Escolha uma opção válida: ");
    }

    public static void secondaryMenu() {
        System.out.print("\n\nDigite o valor que deseja converter (Use vírgulas para valores decimais): ");
    }

    public static String[] getOptions(int option) {
        String valueIn = "";
        String valueOut = "";

        switch (option) {
            case 1:
                valueIn = "USD";
                valueOut = "ARS";
                break;
            case 2:
                valueIn = "ARS";
                valueOut = "USD";
                break;
            case 3:
                valueIn = "USD";
                valueOut = "BRL";
                break;
            case 4:
                valueIn = "BRL";
                valueOut = "USD";
                break;
            case 5:
                valueIn = "USD";
                valueOut = "COP";
                break;
            case 6:
                valueIn = "COP";
                valueOut = "USD";
                break;
            default:
                System.out.println("Opção inválida!");
        }
        return new String[]{valueIn, valueOut};
    }
}
