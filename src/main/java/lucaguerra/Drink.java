package lucaguerra;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Slf4j
public class Drink extends AbstractProdotti {

	private String valoreNutrizionale;

	public Drink(String nome, double prezzo, String valoreNutrizionale) {
		super(nome, prezzo);
		this.valoreNutrizionale = valoreNutrizionale;
	}

	@Override
	public String toString() {
		return getNome() + " " + getPrezzo() + " " + valoreNutrizionale + "]";
	}

}
