package hello.db;

import java.util.List;
import javax.sql.DataSource;


/**
 * Created by MK on 10/25/2016.
 */
public interface databaseDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is a method to be used to create a record in the Donors table.
     */
    public void create(String name, String date );

    /**
     * This method lists down a record from the Donors table
     * corresponding to a passed donor id.
     */
    public Donor getDonor(Integer id);

    /**
     * This method lists down all the records
     * from the Donors table.
     */
    public List<Donor> listDonors();

    /**
     * This method will allow you to delete a record
     * from the Donor table corresponding to a passed
     * donor id.
     */
    public void delete(Integer id);

    /**
     * This method allows you to update
     * a record in the Donor table
     */
    public void update(Integer id, String name, String date);



}
