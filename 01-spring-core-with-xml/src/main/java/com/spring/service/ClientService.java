package com.spring.service;

// Initial Bean via Factory method
public class ClientService {
	private static ClientService INSTANCE = null;
	private ClientService() {
	}

	public synchronized static ClientService getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ClientService();
		}
		return INSTANCE;
	}

	public static void clientInfo() {
		System.out.println(">> ClientService - clientInfo() method");
	}
}
