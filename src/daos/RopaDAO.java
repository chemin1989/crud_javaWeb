package daos;

import java.util.List;

import modelo.Cliente;
import modelo.Ropa;

public interface RopaDAO {

	List<Ropa> obtenerRopa();

	void registrarRopa(Ropa registroRopa);

	Ropa obtenerRopaPorID(int id);

	void guardarCambiosRopa(Ropa ropa);

	Ropa borrarRopaPorID(int id);

	
	
}
