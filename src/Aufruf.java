
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Aufruf {
    public static void main(String[] args) {
         Book scroll = new Book();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date= new Date(118,9,2,14,9,54);
         scroll.setReleased(date);
        scroll.setPages(200);
        scroll.setTitle("My Book");
       System.out.print("Das Buch hat "+scroll.getPages()+" Seiten, wurde am Tue ");
        System.out.print(scroll.getReleased()+ " veröffentlicht und hat den Titel "+scroll.getTitle()+"\n");
        Book b1= new Book(355,date,"A Brief Literary And Sociological Analysis on Why Game of Thrones is Gay", "7598089");
        Book b2= new Book(666,date,"Catch her in the Rye","9798875");
        Book b3=new Book(200,date,"Game of life", "232432543");
        Book b4=new Book(200,date,"Lorem Ipsum", "7344538089");
        Book b5=new Book(200,date,"Lorrain Ipseum", "759888695");
        Paperbook pb1=new Paperbook(355,date,"A Brief Literary And Sociological Analysis on Why Game of Thrones is Gay", "7598089","April","3");
        Paperbook pb2=new Paperbook(666,date,"Catch her in the Rye","9798875","April","3");
        Paperbook pb3=new Paperbook(200,date,"Game of life", "232432543","October","3");
        Paperbook pb4=new Paperbook(200,date,"Lorem Ipsum", "7344538089","September","3");
        Paperbook pb5=new Paperbook(200,date,"Lorrain Ipseum", "759888695","January","3");
        List<Book> list = new ArrayList<>(Arrays.asList(b1,b2,b3,b4,b5));
        List<Paperbook> paperList = new ArrayList<>(Arrays.asList(pb1,pb2,pb3,pb4,pb5));
        System.out.println("___________________________________________\n");
        for (int i=0;i<list.size();i++)
        {
            System.out.println("Das Buch "+list.get(i).getTitle() +" hat "+
                    list.get(i).getPages()+" Seiten und folgende ISBN:"+list.get(i).getIsbn());
        }
        System.out.println("___________________________________________\n");
        for (Paperbook pb:paperList)
        {
            System.out.println("Das Buch "+pb.getTitle() +" hat "+
                    pb.getPages()+" Seiten und folgende ISBN:"+pb.getIsbn()+" zusätzlich ist es im Monat "+pb.getMonth()+
                    " erschienen");

        }

    }

}