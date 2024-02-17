package lesson_24.printers;

public class PrintApp {
    public static void main(String[] args) {
        Book book =  new Book("Java","Smit");
        book.print();
        book.bookSayHello();

        Printable printableBook = new Book("Test","someone");
        printableBook.print();

       // printableBook.book.bookSayHello(); такой метод по тиау ссылки не доступен

        Printable presentationWB = new Presentation("Title",24,"java");
        ColorPrintable presentationColor = new Presentation("color",25,"java");
        presentationWB.print();

        presentationColor.colorPrint();

        Printable[]printables = new Printable[2];
        printables[0] = book;
        printables[1] = presentationColor;

        for (Printable printable :printables){
            printable.print();
            printable.sayHello("World");
        }

        Printable.staticMethod();
        System.out.println("===============================");
        Printer printer = new Printer();
        printer.makeCopy(book);
        printer.makeCopy(presentationWB);
        printer.makeCopy(presentationColor);



    }

}
