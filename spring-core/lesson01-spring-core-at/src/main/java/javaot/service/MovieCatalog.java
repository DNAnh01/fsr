package javaot.service;

import javaot.common.Catalog;

public class MovieCatalog {
	
	private Catalog catalog;
	
	public MovieCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
	public void showMovie() {
		switch (catalog) {
		case ACTION:
			System.out.println("We recommend You watching ACTION 123 movie");
			break;
		case ACVENTURE:
			System.out.println("We recommend You watching ACVENTURE 456 movie");
			break;
		default:
			System.out.println("Unknown catalog ... ");
			break;
		}
	}
}
