package struts.test.ex04;
import java.io.File;

import org.apache.commons.io.FileUtils;

public class UploadAction {
	private File save;				// ���ε� ������ ������ ����� ����
	private File copyFile;
	private String saveFileName;	// ���ε� ������ ���ϸ��� ����� ����
	private String saveContentType;	// ���ε� ������ �������� ����� ���� 
	
	public void setSave(File save) {
		this.save = save;
	}
	public void setSaveFileName(String name) {
		this.saveFileName = name;
	}
	public void setSaveContentType(String type) {
		this.saveContentType = type;
	}
	public String form() { return "success"; }
	public String execute() throws Exception{
		
		System.out.println(saveContentType);  // ������ Ÿ��(MIME type - image/png  ) Ȯ�� 
		String [] types = saveContentType.split("/");  //    ���ڿ���    /   �������� �����ش�. 
		if(types[0].equals("image")) {
			copyFile = new File("d://AM//save//"+saveFileName);
			FileUtils.copyFile(save, copyFile);  // ���������� �纻�� ����.. (�� ���ε� ����)
		}
		return "success"; 
	}

}







