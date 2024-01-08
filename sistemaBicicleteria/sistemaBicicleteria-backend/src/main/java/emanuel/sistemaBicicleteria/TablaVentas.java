package emanuel.sistemaBicicleteria;

import java.util.ArrayList;

public class TablaVentas {
	private ArrayList<Venta> arrayVentas = new ArrayList<Venta>();

		public void alta(Venta venta) {
			arrayVentas.add(venta);
			

		}

		public ArrayList<Venta> getArrayVentas() {
			return arrayVentas;
		}

		public void setArrayVentas(ArrayList<Venta> arrayVentas) {
			this.arrayVentas = arrayVentas;
		}
}
