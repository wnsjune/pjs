package struts.test.ex04;
import java.io.File;

import org.apache.commons.io.FileUtils;

public class UploadAction {
	private File save;				// 업로드 파일의 원본이 저장될 변수
	private File copyFile;
	private String saveFileName;	// 업로드 파일의 파일명이 저장될 변수
	private String saveContentType;	// 업로드 파일의 파일종류 저장될 변수 
	
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
		
		System.out.println(saveContentType);  // 파일의 타입(MIME type - image/png  ) 확인 
		String [] types = saveContentType.split("/");  //    문자열을    /   기준으로 나눠준다. 
		if(types[0].equals("image")) {
			copyFile = new File("d://AM//save//"+saveFileName);
			FileUtils.copyFile(save, copyFile);  // 원본파일을 사본에 복사.. (즉 업로드 실행)
		}
		return "success"; 
	}

}







