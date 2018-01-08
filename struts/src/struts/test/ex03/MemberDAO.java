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
	
	public MemberDTO memberInfo(String id) {
		MemberDTO dto=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select *from test where id=?");
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setAge(rs.getInt("age"));
				dto.setName(rs.getString("name"));
				dto.setImage(rs.getString("image"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) {try{rs.close();}catch(SQLException s) {}}
			if(pstmt !=null) {try{pstmt.close();}catch(SQLException s) {}}
			if(conn !=null) {try{conn.close();}catch(SQLException s) {}}
		}
		return dto;
	}
	

	public void modifyMember(MemberDTO dto){
				
				
				try {
					conn = getConnection();
					
					pstmt = conn.prepareStatement(
							"update test set pw=?, age=?, name=?, image=? "+ "where id=?");
					
					pstmt.setString(1, dto.getPw());
					pstmt.setInt(2, dto.getAge());
					pstmt.setString(3, dto.getName());
					pstmt.setString(4, dto.getImage());
				    pstmt.setString(5, dto.getId());
					
					pstmt.executeUpdate();
					
				} catch(Exception e) {
					e.printStackTrace();
				} finally {
					if(rs !=null) {try{rs.close();}catch(SQLException e) {}}
					if(pstmt != null) try { pstmt.close(); } catch(SQLException e) {}
					if(conn != null) try { conn.close(); } catch(SQLException e) {}
					
				}
			}
	
	public String memberDelete(String id) {
		String image="";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement("select image from test where id=?");
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				image=rs.getString(1);
			    pstmt=conn.prepareStatement("delete from test where id=?");
			    pstmt.setString(1, id);
			    pstmt.executeUpdate();
		}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(pstmt != null) try { pstmt.close(); } catch(SQLException e) {}
			if(conn != null) try { conn.close(); } catch(SQLException e) {}
		}
		return image;
	}
	

}
