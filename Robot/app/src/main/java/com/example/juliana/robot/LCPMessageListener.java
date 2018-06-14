package com.example.juliana.robot;

public interface LCPMessageListener {
	
	public void messageReceived(byte inBox, String message);
}
