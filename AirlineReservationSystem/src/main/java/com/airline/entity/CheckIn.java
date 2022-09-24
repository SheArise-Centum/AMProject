package com.airline.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "checkin")
public class CheckIn {
	
	@Id
	@GeneratedValue
	private long checkinId;
	
	private String seatNumber;
	
	private String gateNumber;

	public long getCheckinId() {
		return checkinId;
	}

	public void setCheckinId(long checkinId) {
		this.checkinId = checkinId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(String gateNumber) {
		this.gateNumber = gateNumber;
	}
	
	public CheckIn() {
		
	}

	public CheckIn(String seatNumber, String gateNumber) {
		super();
		this.seatNumber = seatNumber;
		this.gateNumber = gateNumber;
	}

	@Override
	public String toString() {
		return "Checkin [checkinId=" + checkinId + ", seatNumber=" + seatNumber + ", gateNumber=" + gateNumber + "]";
	}

}