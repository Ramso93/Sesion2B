package clase;


public class Empleado {
	float salario_base;
	float prima;
	float hora_extra;
	public enum TipoEmpleado{Vendedor,Encargado};
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		if(tipo == TipoEmpleado.Vendedor) {
			salario_base = 2000;
		}else if(tipo == TipoEmpleado.Encargado) {
			salario_base = 2500;
		}
		if(ventasMes>=1500) {
			prima = 200;
		}else if(ventasMes>=1000 && ventasMes<1500) {
			prima = 100;
		}
		hora_extra = horasExtra*30;
		return salario_base+prima+hora_extra;
	}
	public float calculoNominaNeta(float nominaBruta) {
		int retencion=0;
		if(nominaBruta<2100) {
			return nominaBruta;
		}else {
			if(nominaBruta<2500) {
				retencion = 15;
			}else {
				retencion = 18;
			}
			return nominaBruta*(1-retencion);
		}
	}
}
