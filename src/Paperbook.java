import java.util.Date;

public class Paperbook extends Book
{
    private String month;
    private String series;
    public Paperbook(){}
    public Paperbook(int seiten, Date date, String Titel, String isbnum, String month, String series)
    {
        super(seiten, date, Titel, isbnum);
        setMonth(month);
        setSeries(series);
    }
    @Override
    public String getIsbn()
    {
        return "00000-000000-0000";
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public String getMonth()
    {
        return month;
    }

    public void setSeries(String series)
    {
        this.series = series;
    }

    public String getSeries()
    {
        return series;
    }
}
