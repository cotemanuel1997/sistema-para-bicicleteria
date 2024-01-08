package emanuel.sistemaBicicleteria;

import java.util.ArrayList;

public class TablaBicicletas {
	
	private ArrayList<Bicicleta> arrayBicicletas = new ArrayList<Bicicleta>();

	public void alta(Bicicleta bicicleta) {
		arrayBicicletas.add(bicicleta);
		

	}

	public ArrayList<Bicicleta> getArrayBicicletas() {
		return arrayBicicletas;
	}

	

}
