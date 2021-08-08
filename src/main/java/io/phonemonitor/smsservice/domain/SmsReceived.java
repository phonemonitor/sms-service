/**
 * 
 */
package io.phonemonitor.smsservice.domain;

import java.io.Serializable;

/**
 * @author ibmuser
 * {"contactName":"Fabi","message":"Waffes se Orinoo en tu ropa","dateTime":"August 07, 2021 at 07:43PM","phoneNumber":"5549342141"}
 */
public class Sms implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String contactName;
	private String message;
	private String dateTime;
	private String phoneNumber;
	
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Sms(String contactName, String message, String dateTime, String phoneNumber) {
		super();
		this.contactName = contactName;
		this.message = message;
		this.dateTime = dateTime;
		this.phoneNumber = phoneNumber;
	}
	
	public Sms() {
		super();
		this.contactName = "";
		this.message = "";
		this.dateTime = "";
		this.phoneNumber = "";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sms [getContactName()=");
		builder.append(getContactName());
		builder.append(", getMessage()=");
		builder.append(getMessage());
		builder.append(", getDateTime()=");
		builder.append(getDateTime());
		builder.append(", getPhoneNumber()=");
		builder.append(getPhoneNumber());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
