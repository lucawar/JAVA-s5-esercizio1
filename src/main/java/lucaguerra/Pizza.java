package lucaguerra;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Getter
@Setter
@Slf4j
public class Pizza extends AbstractProdotti {

	private List<Topping> toppings = new ArrayList<>();
	private String valoreNutrizionale;

	public Pizza(String nome, double prezzo, String valoreNutrizionale) {
		super(nome, prezzo);
		this.valoreNutrizionale = valoreNutrizionale;
	}

	public void addTopping(Topping topping) {
		toppings.add(topping);
	}

	@Override
	public String toString() {
		return " " + getNome() + " " + getPrezzo() + " " + getToppings() + valoreNutrizionale + "]";
	}
}
