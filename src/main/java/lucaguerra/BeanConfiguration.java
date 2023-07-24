package lucaguerra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	String getMessage() {
		return "Forza Roma";
	}

	@Bean
	public Pizza margheritaPizza() {
		Pizza pizza = new Pizza("Margherita", 8.99, "kcl 500");
		pizza.addTopping(new Topping("Pomodoro", 0.50));
		pizza.addTopping(new Topping("Mozzarella", 0.75));
		return pizza;
	}

	@Bean
	public Pizza hawaiianPizza() {
		Pizza pizza = new Pizza("Hawaiian", 10.99, "kcl 600");
		pizza.addTopping(new Topping("Pomodoro", 0.50));
		pizza.addTopping(new Topping("Mozzarella", 0.75));
		pizza.addTopping(new Topping("Prosciutto cotto", 1.00));
		pizza.addTopping(new Topping("Ananas", 1.00));
		return pizza;
	}

	@Bean
	public Drink colaDrink() {
		return new Drink("Coca-Cola", 1.99, "kcl 150");
	}

	@Bean
	public Drink fantaDrink() {
		return new Drink("Fanta", 1.99, "kcl 150");
	}

	@Bean
	public Drink chinottoDrink() {
		return new Drink("Chinotto", 1.99, "kcl 150");
	}
}
