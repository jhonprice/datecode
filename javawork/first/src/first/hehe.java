package first;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class hehe {

	/**
	 * @param args
	 */
	//驱动程序就是之前在classpath中配置的JDBC的驱动程序的JAR 包中
	public static final String DBDRIVER = "org.postgresql.Driver";
	//连接地址是由各个数据库生产商单独提供的，所以需要单独记住
	public static final String DBURL = "jdbc:postgresql://localhost:5432/book";
	//连接数据库的用户名
	public static final String DBUSER = "postgres";
	//连接数据库的密码
	public static final String DBPASS = "dzxxxy";
	
	
	public static void main(String[] args) throws Exception {
		Connection con = null; //表示数据库的连接对象
		Statement stmt = null; 
		Class.forName(DBDRIVER); //1、使用CLASS 类加载驱动程序
		con = DriverManager.getConnection(DBURL,DBUSER,DBPASS); //2、连接数据库
		stmt = con.createStatement(); //3、Statement 接口需要通过Connection 接口进行实例化操作
		stmt.executeUpdate("insert into stu_info values(1,'ad')");  //执行SQL 语句，插入、更新、删除数据
		//stmt.executeUpdate("update java_study.person set name='Jery' where age = 20");
		//stmt.executeUpdate("delete from java_study.person where age = 20");
		con.close(); // 4、关闭数据库
	}

}

