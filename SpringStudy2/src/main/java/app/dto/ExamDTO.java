package app.dto;

import java.util.Date;

public class ExamDTO {
	
	private int id;
	private String title;
	private String content;
	private boolean flag;
	private Date createdate;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	@Override
	public String toString() {
		return "ExamDTO [id=" + id + ", title=" + title + ", content=" + content + ", flag=" + flag + ", createdate="
				+ createdate + "]";
	}
	
	
}
