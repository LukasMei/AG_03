package part04;

import booktypes.AudioBook;
import booktypes.Book;
import booktypes.EBook;
import main.BookStore;
import parseBookList.CreateBook;

import java.util.Collections;
import java.util.List;

public class GroupByBookType {

    public static void main(String[] args) {
    /* Zwei Bücher sind gleich, wenn der Titel und die Auflage gleich sind.
       Z.B. sind die folgenden zwei Bücher unterschiedlich:

        Ohne Schuld (2016)  != Ohne Schuld (2020)


        Das Ergebnis der Berechnungen sollte sein:
    Buecher Anzahl: 6
        Buch: 7 Minuten am Tag (2016)
        Buch: Der Heimweg (2016)
        Buch: Ohne Schuld (2020)
        Buch: Escape Room (2020)
        Buch: Der Heimweg (2020)
        Buch: Ohne Schuld (2016)
    Ebuecher Anzahl: 4
        Ebuch: Ohne Schuld (2020)
        Ebuch: Der Heimweg (2020)
        Ebuch: Zwei Handvoll Leben (2020)
        Ebuch: Kingsbridge - Der Morgen einer neuen Zeit (2020)
    Hoerbuecher Anzahl: 5
        Hoerbuch: QualityLand 2.0 (2019)
        Hoerbuch: Funken Mord (2018)
        Hoerbuch: QualityLand 2.0 (2018)
        Hoerbuch: Funken Mord (2019)
        Hoerbuch: Harry Potter - alle 7 Baende (2018)
         */

        List<Book> groupList = CreateBook.getBookList();




        System.out.println("-----------");
        Collections.sort(groupList);

        for (Book x :groupList) {
            if (x instanceof EBook) {
                System.out.println("Ebuch: " + x.getTitel() +" " + x.getAuflage());
            }
        }



    }
}
