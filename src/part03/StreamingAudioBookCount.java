package part03;

import booktypes.AudioBook;
import booktypes.Book;
import booktypes.EBook;
import parseBookList.CreateBook;

import java.util.List;

public class StreamingAudioBookCount {

    public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:
    Anzahl Hoerbuecher per Streaming: 5
     */

        List<Book> streamingList = CreateBook.getBookList();

        int count = 0;

        for(Book x : streamingList){
            if(x instanceof AudioBook){
                if (((AudioBook) x).getModus().equals("Streaming")){
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}
