package org.jrue.designpatterns.composite;

import org.jrue.designpatterns.composite.composite.Menu;
import org.jrue.designpatterns.composite.component.MenuComponent;
import org.jrue.designpatterns.composite.leaf.MenuItem;

public class Main {

	public static void main(String[] args) {
		MenuComponent allMenu = new Menu("HPS Menu", "All Accessible Menus");
		
		MenuComponent imageProcessingMenus = new Menu("Image Processing", "Image Checking");
		MenuComponent applicationProcessingMenus = new Menu("Application Processing", "Encoding and Verification");

		allMenu.addMenu(imageProcessingMenus);
		allMenu.addMenu(applicationProcessingMenus);
		
		imageProcessingMenus.addMenu(new MenuItem("Indexing (Fax)", "Processing of Fax"));
		imageProcessingMenus.addMenu(new MenuItem("Indexing (Scanner)", "Processing of Scanned Applications"));
		imageProcessingMenus.addMenu(new MenuItem("Image Screening", "Checking of Documents Submitted"));
		
		applicationProcessingMenus.addMenu(new MenuItem("Data Entry","Encoding of Application"));
		
		MenuComponent creditVerification = new Menu("Credit Verification", "Application Verifiation");
		creditVerification.addMenu(new MenuItem("TVR", "Telephone Verification"));
		creditVerification.addMenu(new MenuItem("CIBIL", "Credit Beaurue"));
		creditVerification.addMenu(new MenuItem("FCU", "Fraud Check Unit"));
		applicationProcessingMenus.addMenu(creditVerification);
		
		MenuComponent creditAssessment = new Menu("Credit Assessment", "Judgement");
		applicationProcessingMenus.addMenu(creditAssessment);
		creditAssessment.addMenu(new MenuItem("Credit Assessment", "Judgement of Application"));
		creditAssessment.addMenu(new MenuItem("Assessor Management", "Assessor Management"));		
		allMenu.print();
	}
}
