package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;
import dao.Project;
import dto.FeedObjects;

/**
 * Created by MK on 10/24/2016.
 * write the business logic and data validation
 */
public class ProjectManager {

    public ArrayList<feedobjects> GetFeeds()throws Exception {
        ArrayList<feedobjects> feeds = null;
        try{
            Database database = new Database();
            Connection connection = database.Get_Connection();
            Project project = new Project();
            feeds = project.GetFeeds(connection);

        }
        catch (Exception e) {
            throw e;
        }
        return feeds;
    }

}
