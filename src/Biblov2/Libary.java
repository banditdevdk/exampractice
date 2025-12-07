package Biblov2;

import java.util.ArrayList;

public class Libary {
    private ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Libary l = new Libary();

        Book b1 = new Book("J", "Rowling", 15);
        Book b2 = new Book("Kotao", "Rowling", 25);
        Book b3 = new Book("Vien Italy", "Hendriz", 115);

        l.books.add(b1);
        l.books.add(b3);
        l.books.add(b2);

        System.out.println(l.getTotalPages());

        System.out.println(l.getBooksByAuthor("Rowling"));
    }

    public int getTotalPages() {
        int sum = 0;
        for (Book b: books) {
            sum += b.getNumberOfPages();
        }
        return sum;
    }

    public ArrayList<Book> getBooksByAuthor(String author) {
        ArrayList<Book> authorList = new ArrayList<>();

        for (Book b: books) {
            if (author.equalsIgnoreCase(b.getAuthor())) {
                authorList.add(b);
            }
        }
        return authorList;
    }

}
