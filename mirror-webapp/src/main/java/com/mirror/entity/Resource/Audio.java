package com.mirror.entity.Resource;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mirror.entity.BaseEntity;

@Entity
@Table(name = "resource_audios")
public class Audio extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7768019540591898159L;

	// 音频存放路径
	@Column(name = "fileKey")
	private String fileKey;

	// //音频名称
	// @Column(name="filename")
	// private String filename;
	//
	// //音频大小
	// @Column(name="fileSize")
	// private Long size;

	// 归属作品wid
	@Column(name = "wid")
	private Long workid;

	// 上传用户uid
	@Column(name = "uid")
	private Long uid;

	// 上传时间
	@Column(name = "commentTime", insertable = true)
	private Timestamp uploadTime;

	// 音频状态
	@Column(name = "status")
	private int status;

	@Column(name = "placeHolder1")
	private String placeHolder1;

	@Column(name = "placeHolder2")
	private String placeHolder2;

	public Audio() {

	}

	public Audio(String fileKey, Long workid, Long uid, Timestamp uploadTime,
			int status) {
		super();
		this.fileKey = fileKey;
		this.workid = workid;
		this.uid = uid;
		this.uploadTime = uploadTime;
		this.status = status;
	}

	public String getFileKey() {
		return fileKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public Long getWorkid() {
		return workid;
	}

	public void setWorkid(Long workid) {
		this.workid = workid;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Timestamp getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Timestamp uploadTime) {
		this.uploadTime = uploadTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
