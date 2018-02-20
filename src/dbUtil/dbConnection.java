
package sample;
import dbUtil.dbconnection;

import java.sql.Connection;
import java.sql.SQLException;

public class loginModel {

            import dbUtil.dbconnection;

            import java.sql.Connection;
            import java.sql.SQLException;

    public class loginModel {
        Connection connection;
        public loginModel() throws SQLException
        {
            this.connection = dbconnection.getConnection();
            if (this.connection == null)
            {

            }
            System.exit(1);
        }
    }//loginModel
    public boolean isDatabaseConnection(){
            return this.connection != null;
}


}//loginModel

