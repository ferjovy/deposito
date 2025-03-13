package cuentas;

/**
 * Clase que nos permite ver los constructores, estado cuenta, ingresar, retirar, setters y getters
 * @author Roberto Hernandez
 */
public class CCuenta {

	/**
	 * ATRIBUTOS
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * CONSTRUCTOR VACIO
     */
    public CCuenta()
    {
    }
    /**
     * CONSTRUCTOR COMPLETO
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Estado de la cuenta
     * @return Saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Ingresa una cantidad en cuenta
     * @param cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
   	 * Retira una cantidad de la cuenta
   	 * @param Cantidad a retirar
   	 * @throws Exception si no hay saldo suficiente o es negativa la cantidad
   	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * GETTERS Y SETTERS
     * GET nombre
     * @return get nombre
   	 */
	public String getNombre() {
		return nombre;
	}
    /**
     * SET NOMBRE
     * @return  set nombre
   	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    /**
     * GET CUENTA
     * @return  get cuenta
   	 */
	public String getCuenta() {
		return cuenta;
	}
    /**
     * SET CUENTA
     * @return  set cuenta
   	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
    /** GET SALDO
    * @return  get saldo
  	 */
	public double getSaldo() {
		return saldo;
	}
    /**
     * SET SALDO
     * @return  set saldo
   	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    /** GET TIPO INTERES
    * @return  get TipoInterés
  	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
    /**
     * SET TIPO INTERES
     * @return  set TipoInterés
   	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    
}
