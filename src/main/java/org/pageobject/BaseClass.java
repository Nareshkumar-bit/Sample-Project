package org.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println("master");
		System.out.println("2nd update");
		System.out.println("3rd update");
		System.out.println("Rammohan98$");
		System.out.println("Master final update");

	}

}
