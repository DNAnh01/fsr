package javaot.service;

// Step 1: Joint Point class
public class MovieService {
	private String name;
	private String catalog;

	public MovieService() {
	}

	public MovieService(String name, String catalog) {
		this.name = name;
		this.catalog = catalog;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	// Joint Point method
	public void printName() {
		System.out.println("JOINT POINT MovieService#printName ----> " + name);
	}
	
	public void printCatalog() {
		System.out.println("JOINT POINT MovieService#printCatalog ----> " + catalog);
	}
}
