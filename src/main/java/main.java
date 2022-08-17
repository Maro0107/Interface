public class main {
    public static void main(String[] args) {
        Printer printer = new Printer();
//        Printer printer1 = new Printer();
//        PrintBlack printBlack = new PrintBlack();

//        System.out.println("udało się "+printer.Print(printBlack));
//
//        System.out.println(printer.hashCode());
//        System.out.println(printer1.hashCode());
//
//        System.out.println( printer.equals(printer1));
//        System.out.println( printer.equals(printer));



        System.out.println(printer.Print(new PrintBlack()));
        System.out.println(printer.Print(new PrintColour()));
    }
}
