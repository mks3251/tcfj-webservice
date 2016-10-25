package hello.db;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by MK on 10/25/2016.
 */
public class DonorJDBCTemplate implements databaseDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String name, String date) {
        String SQL = "insert into Donor (name, date) values (?, ?)";

        jdbcTemplateObject.update( SQL, name, date);
        System.out.println("Created Record Name = " + name + " Date Started = " + date);
        return;
    }

    public Donor getDonor(Integer id) {
        String SQL = "select * from Donor where id = ?";
        Donor donor = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new DonorMapper());
        return donor;
    }

    public List<Donor> listDonors() {
        String SQL = "select * from Donor";
        List <Donor> donors = jdbcTemplateObject.query(SQL,
                new DonorMapper());
        return donors;
    }

    public void delete(Integer id){
        String SQL = "delete from Donor where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    public void update(Integer id, String name, String date){
        String SQL = "update Donor set name = ?, date = ? where id = ?";
        jdbcTemplateObject.update(SQL, name, date, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }




}
