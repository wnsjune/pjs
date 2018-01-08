package struts.test.ex05;

import java.io.FileInputStream;
import java.io.InputStream;

public class DownloadAction {
	private String fileName;
	private InputStream inputStream;
	
	public String getFileName() {return fileName;}
	public void setFileName(String fileName) {this.fileName = fileName;}
	
	public String execute() throws Exception {
		inputStream = new FileInputStream("d://AM//save//"+fileName);
		return "success";
	}
	
	public InputStream getInputStream() {return inputStream;}

}
