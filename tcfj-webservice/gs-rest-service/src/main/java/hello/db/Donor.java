package hello.db;

/**
 * Created by MK on 10/25/2016.
 * Get and Set values for donor table
 */
public class Donor {

    private Integer id;
    private String name;
    private String date;

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

}
