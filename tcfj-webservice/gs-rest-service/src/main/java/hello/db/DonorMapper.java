package hello.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by MK on 10/25/2016.
 */
public class DonorMapper implements RowMapper<donor> {

    public Donor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Donor donor = new Donor();
        donor.setId(rs.getInt("id"));
        donor.setName(rs.getString("name"));
        donor.setDate(rs.getString("date"));
        return donor;
    }


}
