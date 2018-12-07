
import java.util.Date;
import java.util.Random;

public class Book {
    private int pages;
    private Date released;
    private String title;
    private String isbn;

    public Book() {

    }

    public Book(int seiten, Date date, String Titel, String isbnum)
    {
        setPages(seiten);
        setReleased(date);
        setTitle(Titel);
        setIsbn(isbnum);

    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public Date getReleased() {
        return released;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

}
