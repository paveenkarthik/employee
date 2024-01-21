import java.sql.*;
public class empimp implements empdao{
 Connection con;
    @Override
    public void byid(int id) {
        // TODO Auto-generated method stub
        con=dbconnection.DB();
        String query="select * from emp where id ="+id;
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.printf("%d\t%s\t%d\t%d",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));

            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    @Override
    public void createemp(employee emp) {
        // TODO Auto-generated method stub
        con=dbconnection.DB();
        String query ="insert into emp values(?,?,?,?);";
        try {
            PreparedStatement pr=con.prepareStatement(query);
            pr.setInt(1,emp.getId());
            pr.setString(2,emp.getName());
            pr.setInt(3, emp.getSalary());
            pr.setInt(4, emp.getAge());          
        
        System.out.println("inserted successfully");  
        } catch (Exception ex) {
            // TODO: handle exception
            ex.printStackTrace();
        }
        
    }

    @Override
    public void deleteemp(int id) {
        // TODO Auto-generated method stub
        con=dbconnection.DB();
        String query="delete from  emp where id=?";
        try {
            PreparedStatement pr=con.prepareStatement(query);
            pr.setInt(1,id);
            int c=pr.executeUpdate();
           if(c!=0)
           System.out.println("DELETED SUCCESFULLY");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }

    @Override
    public void showemp() {
        con=dbconnection.DB();
        // TODO Auto-generated method stub
        String query ="select * FROM emp";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.printf("%d\t%s\t%d\t%d",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
 
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }

    @Override
    public void upemp(int id, String name) {
        // TODO Auto-generated method stub
        con=dbconnection.DB();
        String query="update emp set name=? where id=?";
        try {
            PreparedStatement pre=con.prepareStatement(query);
            pre.setString(1,name);
            pre.setInt(2,id);
            int c=pre.executeUpdate();
           if(c!=0)
           System.out.println("UPDATED SUCCESFULLY");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
   
    
}
