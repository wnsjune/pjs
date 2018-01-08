package struts.test.ex06;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisAction {
	public String execute() throws Exception{
		//sqlMapConfig.xml  파일 read
		Reader reader=Resources.getResourceAsReader("sqlMapConfig.xml");
		
		//sqlMap.xml 파일 전체 빌드업
		SqlMapClient sqlMap=SqlMapClientBuilder.buildSqlMapClient(reader);  //드라이버 로드 connection 연결
		reader.close();
		
		List list=sqlMap.queryForList("allMember","wnsjune");
		System.out.println("---->>>"+list.size());
		return "success";
	}

}
