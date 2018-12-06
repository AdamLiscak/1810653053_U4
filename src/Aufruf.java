import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        List myList<Book> = new ArrayList<>();
        
    }
}
