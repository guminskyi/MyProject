package Encapsulation;

public class Library {
    public static void main(String[] args) {

        System.out.println();

        Book book1 = new Book();
        book1.setTitle("Grit");

        System.out.println(book1.getTitle());

        book1.setAuthor("James Salinger");
        book1.setPages(281);

        System.out.println(book1.getAuthor());
        System.out.println(book1.getPages());

        System.out.println();

        Book javaBook = new Book();
        javaBook.setTitle("Headfirst Java");
        javaBook.setAuthor("Peter Pan");
        javaBook.setPages(789);

        System.out.println(javaBook.getTitle());
        System.out.println(javaBook.getAuthor());
        System.out.println(javaBook.getPages());

    }
}
