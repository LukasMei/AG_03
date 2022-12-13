package parseBookList;

import booktypes.AudioBook;
import booktypes.Book;
import booktypes.EBook;
import main.BookStore;

import java.util.ArrayList;
import java.util.List;

public class CreateBook {
    public static List<Book> getBookList() {

        BookStore bookStore = new BookStore();

        List<String> allBooks = bookStore.getSoldBooks();

        List<Book> bookList = new ArrayList<>();

        for (String x:allBooks){
            String[] split = x.split(";");
            if (split[1].equals("Buch")){
                Book book = new Book(split[0],split[1],Double.parseDouble(split[2]),Integer.parseInt(split[3]));
                bookList.add(book);
            }
            if(split[1].equals("Ebuch")){
                Book ebook = new EBook(split[0],split[1],Double.parseDouble(split[2]),Integer.parseInt(split[3]),split[4]);
                bookList.add(ebook);
            }
            if(split[1].equals("Hoerbuch")){
                Book audioBook = new AudioBook(split[0],split[1],Double.parseDouble(split[2]),Integer.parseInt(split[3]),split[4]);
                bookList.add(audioBook);
            }

        }
        return bookList;

    }

}
