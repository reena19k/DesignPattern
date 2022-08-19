package com.aurionpro.model;

public interface INotifier {
	void sendNotification(Account acc, double amount, String transaction);
}