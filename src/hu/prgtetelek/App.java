package hu.prgtetelek;

import java.util.Arrays;
import java.util.Random;

import hu.prgtetelek.model.Initialization;
import hu.prgtetelek.model.ProgramFacade;

public class App {

	private final ProgramFacade facade;

	public App() {
		facade = new ProgramFacade();
	}

	public static void main(String[] args) {
		App app = new App();
		app.runApp();
	}
	private void runApp() {


		System.out.println(facade.getSum());
		System.out.println(facade.hasValue(97));
		System.out.println(facade.select(37));
		System.out.println(facade.search(101));
		System.out.println(facade.count(37));
		System.out.println(facade.max());
		System.out.println(facade.sort());
			}
}
