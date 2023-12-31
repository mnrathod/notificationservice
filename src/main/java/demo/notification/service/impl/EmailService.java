package demo.notification.service.impl;

import demo.notification.service.NotificationService;

public interface EmailService extends NotificationService {
	public void sendSimpleMessage(String to, String subject, String text);
	public void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment);
}
