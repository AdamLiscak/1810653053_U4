import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Aufruf {
    public static void main(String[] args) {
         Book scroll = new Book();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date= new Date(118,9,2,14,9,54);
         scroll.setReleased(date);
        scroll.setPages(200);
        scroll.setTitle("My Book");
        System.out.print("Das Buch hat "+scroll.getPages()+" Seiten, wurde am Tue ");
        System.out.print(scroll.getReleased()+ " veröffentlicht und hat den Titel "+scroll.getTitle());
        Book b1= new Book()
                b1.setPages(200);
        b1.setIsbn(String.valueOf(Random.nextInt(9000) + 100));

        Book b2=new Book()
        Book b3=new Book()
        Book b4=new Book()
        Book b5=new Book()
        List myList<Book> = new ArrayList<>(b1,b2,b3,b4,b5);

    }
}
