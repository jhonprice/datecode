package first;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class hehe {

	/**
	 * @param args
	 */
	//�����������֮ǰ��classpath�����õ�JDBC�����������JAR ����
	public static final String DBDRIVER = "org.postgresql.Driver";
	//���ӵ�ַ���ɸ������ݿ������̵����ṩ�ģ�������Ҫ������ס
	public static final String DBURL = "jdbc:postgresql://localhost:5432/book";
	//�������ݿ���û���
	public static final String DBUSER = "postgres";
	//�������ݿ������
	public static final String DBPASS = "dzxxxy";
	
	
	public static void main(String[] args) throws Exception {
		Connection con = null; //��ʾ���ݿ�����Ӷ���
		Statement stmt = null; 
		Class.forName(DBDRIVER); //1��ʹ��CLASS �������������
		con = DriverManager.getConnection(DBURL,DBUSER,DBPASS); //2���������ݿ�
		stmt = con.createStatement(); //3��Statement �ӿ���Ҫͨ��Connection �ӿڽ���ʵ��������
		stmt.executeUpdate("insert into stu_info values(1,'ad')");  //ִ��SQL ��䣬���롢���¡�ɾ������
		//stmt.executeUpdate("update java_study.person set name='Jery' where age = 20");
		//stmt.executeUpdate("delete from java_study.person where age = 20");
		con.close(); // 4���ر����ݿ�
	}

}

