package examples.springmvc.dto;

import java.sql.Date;

public class Board {
    Long id;
    String userId;
    String title;
    String content;
    Integer readCount;
    Date writeDate;
	Date updateDate;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public Integer getReadCount() {
		return readCount;
	}
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "Board [id=" + id + ", userId=" + userId + ", title=" + title + ", content=" + content + ", readCount="
				+ readCount + ", writeDate=" + writeDate + ", updateDate=" + updateDate + "]";
	}
}
