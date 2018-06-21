package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue
    private Long id;
	private Long userId;
	private String summary;
    private String status;
    private Integer priority;
	private Date timeEstimatedFinish;
    /*private Integer rank;*/
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
    public Date getTimeEstimatedFinish() {
		return timeEstimatedFinish;
	}
	public void setTimeEstimatedFinish(Date timeEstimatedFinish) {
		this.timeEstimatedFinish = timeEstimatedFinish;
	}
/*	public Integer getRank() {
		return rank;
	}
	public void calculateRank(Integer priority, Integer estimatedTimeInMinutes) {
		this.rank = priority*priority - priority + priority*estimatedTimeInMinutes/60;
	}*/
}
