
import BookTypes.AudioBook;
import BookTypes.Book;
import BookTypes.EBook;

import java.util.ArrayList;
import java.util.List;

public class createBook {
    public static void main(String[] args) {

        BookStore bookStore = new BookStore();

        List<String> allBooks = bookStore.getSoldBooks();

        List<Book> testList = new ArrayList<>();

        for (String x:allBooks){
            String[] split = x.split(";");
            if (split[1].equals("Buch")){
                Book book = new Book(split[0],split[1],Double.parseDouble(split[2]),Integer.parseInt(split[3]));
                testList.add(book);
            }
            if(split[1].equals("Ebuch")){
                Book ebook = new EBook(split[0],split[1],Double.parseDouble(split[2]),Integer.parseInt(split[3]),split[4]);
                testList.add(ebook);
            }
            if(split[1].equals("Hoerbuch")){
                Book audioBook = new AudioBook(split[0],split[1],Double.parseDouble(split[2]),Integer.parseInt(split[3]),split[4]);
            }

        }
        System.out.println(testList);

    }

}
