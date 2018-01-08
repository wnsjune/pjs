package struts.test.ex03;

import java.sql.*;


public class MemberDAO {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");  //1단계 드라이버 로드 
		String url="jdbc:oracle:thin:@nullmaster.iptime.org:1521:orcl";
		conn=DriverManager.getConnection(url,"am19","am19"); //2단계 DB연결(dB 로그인)
	    return conn;
	}
	
	public boolean loginCheck(MemberDTO dto) {
		boolean result =false;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select *from test where id=? and pw=?");
			pstmt.setString(1,dto.getId());
			pstmt.setString(2,dto.getPw());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				result=true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) {try{rs.close();}catch(SQLException s) {}}
			if(pstmt !=null) {try{pstmt.close();}catch(SQLException s) {}}
			if(conn !=null) {try{conn.close();}catch(SQLException s) {}}
		}
		return result;
	}
	
	public void insertMember(MemberDTO dto) {
		try {
			conn=getConnection();
			String sql="insert into test values(?,?,?,?,sysdate,?)";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setInt(3, dto.getAge());
			pstmt.setString(4, dto.getName());
			pstmt.setString(5, dto.getImage());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) {try{rs.close();}catch(SQLException e) {}}
			if(pstmt !=null) {try{pstmt.close();}catch(SQLException e) {}}
			if(conn !=null) {try{conn.close();}catch(SQLException e) {}}
		}
	}

}
