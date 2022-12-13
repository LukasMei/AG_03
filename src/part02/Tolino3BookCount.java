package part02;

import booktypes.Book;
import booktypes.EBook;
import parseBookList.CreateBook;

import java.util.List;

public class Tolino3BookCount {

    public static void main(String[] args) {

    /* Das Ergebnis der Berechnungen sollte sein:
    Anzahl Ebuecher bei Tolino 3: 9
     */
        int count = 0;

        List<Book> tolino3List = CreateBook.getBookList();

        for(Book x : tolino3List){
            if(x instanceof EBook){
                count += Integer.parseInt(((EBook) x).getVersion());

            }
            System.out.println(count);
        }
    }
}
