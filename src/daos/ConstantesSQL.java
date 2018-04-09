package daos;

public class ConstantesSQL {

	public static final String INSERTAR_ROPA = "insert into tabla_ropa(marca, modelo, pais, coste, talla, color, descripcion) "
			+ "VALUES(?,?,?,?,?,?,?)";
	public static final String IDENTIFICAR_ADMIN = "select id from tabla_admin where usuario = ? and contraseña = ?";
	public static final String LISTAR_ROPA = "select * from tabla_ropa";
	public static final String OBTENER_ROPA_POR_ID = "select * from tabla_ropa where id = ?";
	public static final String GUARDAR_CAMIOS_ROPA = "update tabla_ropa set marca = ?, modelo = ?, pais = ?, coste = ?, talla = ?, color = ?, descripcion = ? where id= ?";
	public static final String BORRAR_ROPA_POR_ID = "delete from tabla_ropa where id = ?";
	public static final String REGISTRAR_CLIENTE = "insert into tabla_clientes(nombre, apellidos, direccion, numero, poblacion, cp, email, ep) "
			+ "VALUES(?,?,?,?,?,?,?,?)";
	public static final String LISTAR_CLIENTES = "select * from tabla_clientes";
	public static final String OBTENER_CLIENTE_POR_ID = "select * from tabla_clientes where id = ?";
	public static final String GUARDAR_CAMBIOS_CLIENTE_POR_ID = "update tabla_clientes set nombre = ?, apellidos = ?, direccion = ?, numero = ?, poblacion = ?, cp = ?, email = ?, ep= ? where id = ?";
	public static final String BORRAR_CLIENTE_POR_ID = "delete from tabla_clientes where id = ?";
	public static final String SQL_REGISTRO_USUARIO = "insert into tabla_usuario(nombre, email,comentario) VALUES(?,?,?)";
	public static final String SQL_LISTAR_USUARIO = "select * from tabla_usuario";	
}
