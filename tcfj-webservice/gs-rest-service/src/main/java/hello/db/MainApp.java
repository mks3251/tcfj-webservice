package hello.db;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import hello.db.DonorJDBCTemplate;
/**
 * Created by MK on 10/25/2016.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        DonorJDBCTemplate donorJDBCTemplate =
                (DonorJDBCTemplate)context.getBean("donorJDBCTemplate");

        System.out.println("------Records Creation--------" );
        donorJDBCTemplate.create("Seward Co-Op Friendship Store", "2016-10-25");
        donorJDBCTemplate.create("Test Co-Op Store", "2016-10-25");
        donorJDBCTemplate.create("MN Food Store", "2016-10-25");

        System.out.println("------Listing Multiple Records--------" );
        List<Donor> donors = donorJDBCTemplate.listDtudents();
        for (Donor record : donors) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Date Started : " + record.getDate());
        }

        System.out.println("----Updating Record with ID = 3 -----" );
        donorJDBCTemplate.update(3, "MN Bakery", "2016-10-24");

        System.out.println("----Listing Record with ID = 3 -----" );
        Donor donor = donorJDBCTemplate.getDonor(3);
        System.out.print("ID : " + donor.getId() );
        System.out.print(", Name : " + donor.getName() );
        System.out.println(", Age : " + donor.getDate());

    }


}
