public class Printer {
    public void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Цей текст буде виведений в звичайному кольорі.");

        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print("Цей текст буде виведений кольором.", "red");
    }
}

class ColorPrinter extends Printer {
    public void print(String value, String color) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m";

        switch (color) {
            case "red":
                System.out.println(ANSI_RED + value + ANSI_RESET);
                break;
            case "green":
                System.out.println(ANSI_GREEN + value + ANSI_RESET);
                break;
            case "blue":
                System.out.println(ANSI_BLUE + value + ANSI_RESET);
                break;
            default:
                System.out.println(value);
                break;
        }
    }
}
