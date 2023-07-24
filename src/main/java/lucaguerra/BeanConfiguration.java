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
		// Aggiungiamo una combinazione di topping (Hawaiian Pizza)
		Topping prosciuttoTopping = new Topping("Prosciutto", 1.50);
		Topping ananasTopping = new Topping("Ananas", 1.25);
		Topping hawaiianCombo = new Topping("Hawaiian Pizza", 0.0);
		hawaiianCombo.aggiungiCombinazioneTopping(prosciuttoTopping);
		hawaiianCombo.aggiungiCombinazioneTopping(ananasTopping);
		pizza.addTopping(hawaiianCombo);
		return pizza;
	}

	@Bean
	public Drink colaDrink() {
		return new Drink("Coca-Cola", 1.99, "kcl 150");
	}
}
