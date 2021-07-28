import java.util.Locale;

class Printer {
    public void printing(){
        System.out.println("Printing...");
    }
}

class BlackWhitePrinter extends Printer {
    @Override
    public void printing(){
        System.out.println("Printing on Black and White Printer with black ink");
    }
}

class ColoredPrinter{
    public void printing1(String color) {
        System.out.println("Printing on Colored Printer with " + color + " ink");
    }
    public void printing1(String color1, String color2) {
        System.out.println("Printing on Colored Printer with different ink colors");
    }
}

public class Main {
    public static void main(String[] args) {
        Printer print = new Printer();
        print.printing();
        Printer print1 = new BlackWhitePrinter();
        print1.printing();
        ColoredPrinter print2 = new ColoredPrinter();
        print2.printing1("red", "blue");
    }
}
