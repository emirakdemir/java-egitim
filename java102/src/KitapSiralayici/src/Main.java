import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // İsimlere göre sıralama
        Set<Book> bookSetByTitle = new TreeSet<>();
        bookSetByTitle.add(new Book("Vakıf ve İmparatorluk", 284, "Isaac Asimov", "1952"));
        bookSetByTitle.add(new Book("Aptalı Tanımak", 208, "Celal Şengör", "2015"));
        bookSetByTitle.add(new Book("Yeraltından Notlar", 160, "Fyodor Dostoyevski", "1864"));
        bookSetByTitle.add(new Book("Beyin", 265, "David Eagleman", "2015"));
        bookSetByTitle.add(new Book("Yabancı", 112, "Albert Camus", "1942"));

        System.out.println("-Kitapların İsme Göre Sıralanması(A'dan Z'ye)-");
        for (Book book : bookSetByTitle) {
            System.out.println(book);
        }

        // Sayfa sayısına göre sıralama
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByTitle);

        System.out.println("\n-Kitapların Sayfa Sayısına Göre Sıralanması(Az'dan Çok'a)-");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}