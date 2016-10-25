package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.FeedObjects;

/**
 * Created by MK on 10/24/2016.
 * Create a dao(Data Access Object) method GetFeeds with Arraylist datatype,
 * using select statement getting results from website table. Binding results into feedData object
 */
public class Project {

    public ArrayList<feedobjects> GetFeeds(Connection connection) throws Exception
    {
        ArrayList<feedobjects> feedData = new ArrayList<feedobjects>();
        try
        {
            PreparedStatement ps = connection.prepareStatement("SELECT title, description, url FROM " +
                    "website ORDER BY id DESC");
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                FeedObjects feedObject = new FeedObjects();
                feedObject.setTitle(rs.getString("title"));
                feedObject.setDescription(rs.getString("description"));
                feedObject.setUrl(rs.getString("url"));
                feedData.add(feedObject);
            }
            return feedData;
        }
        catch(Exceptin e)
        {
            throw e;
        }
    }
}
