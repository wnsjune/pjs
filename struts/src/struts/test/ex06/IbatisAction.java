package struts.test.ex06;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisAction {
	public String execute() throws Exception{
		//sqlMapConfig.xml  ���� read
		Reader reader=Resources.getResourceAsReader("sqlMapConfig.xml");
		
		//sqlMap.xml ���� ��ü �����
		SqlMapClient sqlMap=SqlMapClientBuilder.buildSqlMapClient(reader);  //����̹� �ε� connection ����
		reader.close();
		
		List list=sqlMap.queryForList("allMember","wnsjune");
		System.out.println("---->>>"+list.size());
		return "success";
	}

}
