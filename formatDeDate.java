import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;
import java.util.*;
import java.lang.*;

public class formatDeDate{
    public static void main(String[] args)
	throws SQLException, ClassNotFoundException{
	OracleDataSource ods=new OracleDataSource();
	ods.setUser("ialouani");
	ods.setPassword("ialouani");
	ods.setURL("jdbc:oracle:thin:@localhost:1521/oracle");
	Connection conn=null;
	Statement stmt=null;
	try{
	    conn=ods.getConnection();
	    stmt=conn.createStatement();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Entrez le format date annee/mois/jour ici: ");
	    System.out.println("L'annee:");
	    int year=Integer.parseInt(scanner.nextLine());
	    System.out.println("Le mois:");
	    int month=Integer.parseInt(scanner.nextLine());
	    System.out.println("Le jour:");
	    int day=Integer.parseInt(scanner.nextLine());
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Entrez le nom svp: ");
	    String nom=sc.nextLine();
	    System.out.println("Entrez le prenom svp: ");
	    String prenom=sc.nextLine();
	    String dateDeNaissance=year+"/"+month+"/"+day;
            String sql="insert into IDENTITEE " +
		"VALUES ('alouani',  'ismail',  '07/10/1999')" ;
            stmt.executeUpdate(sql);
	}
	finally{
	    if(stmt!=null){
		stmt.close();
	    }
	    if(conn!=null){
		conn.close();
	    }
	}
    }
}
