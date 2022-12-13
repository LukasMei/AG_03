package part01;

import parseBookList.CreateBook;
import booktypes.AudioBook;
import booktypes.Book;
import booktypes.EBook;

import java.util.List;

public class SumPrices {
    public static void main(String[] args) {


            List<Book> sumPriceList = CreateBook.getBookList();

            double sumBook = 0;
            double sumEBook = 0;
            double sumAudioBook = 0;
            double sumAllBooks = 0;

            /* Das Ergebnis der Berechnungen sollte sein:
            Summe Buch:     € 381.88
            Summe Ebuch:    € 255.82
            Summe Hoerbuch: € 344.58
            Summe Alle:     € 982.28
            */

            for (Book x : sumPriceList) {
                sumAllBooks += x.getPreis();
                if (x instanceof EBook) {
                    sumEBook += x.getPreis();
                }
                if(x instanceof AudioBook){
                    sumAudioBook += x.getPreis();
                }
                if(!(x instanceof EBook) && !(x instanceof AudioBook) ){
                    sumBook += x.getPreis();
                }
            }
        System.out.println(sumBook);
        System.out.println(sumEBook);
        System.out.println(sumAudioBook);
        System.out.println(sumAllBooks);


        }
    }






