package com.geowarin.mvc.base.dto;

import org.hibernate.validator.constraints.NotEmpty;

/* commentaire de pépé */
public class FormDTO {

	@NotEmpty
	private String messageFromUser;
/**
 * a other branch develop1107bis
 * a other branch develop1107 from develop
 * return the message from user
 * a other comment test for develop branch
 * just creating a new one dev1207bis from remote origin/develop
 * @return
 */
	public String getMessageFromUser() {
		return messageFromUser;
	}
/**
 * set the message
 * @param messageFromUser
 */
	public void setMessageFromUser(String messageFromUser) {
		this.messageFromUser = messageFromUser;
	}

	@Override
	public String toString() {
		return "FormDTO [messageFromUser=" + messageFromUser + "]";
	}
}
