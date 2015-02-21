
public class Planeta {
	String nombre;
	double diametro;
	double gravedad;

	Planeta(String nombre, double diametro, double gravedad)
	{
		this.nombre = nombre;
		this.diametro= diametro;
		this.gravedad= gravedad;
	}

	void setNombre(String nombre)
	{
		this.nombre= nombre;
	}

	String getNombre()
	{
		return nombre;
	}

	void setDiametro(double diametro)
	{
		this.diametro= diametro;
	}

	double getDiametro()
	{
		return diametro;
	}

	void setGravedad(double gravedad)
	{
		this.gravedad= gravedad;
	}

	double getGravedad()
	{
		return gravedad;
	}

}
