public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Антон", "Чехов");
        Author author3 = new Author("Антон", "Чехов");
        Author author2 = new Author("Роберт", "Мартин");
        Book book1 = new Book("Три сестры", author1, 1901);
        Book book2 = new Book("Чистый код", author2, 2019);
        Book book3 = new Book("Три сестры", author1, 1901);
        book2.setYearOfPublication(2020);
        System.out.println("book1 = " + book1);
        System.out.println("author1 = " + author1);
        System.out.println(author1.equals(author3));
        System.out.println(book1.equals(book3));
    }
}