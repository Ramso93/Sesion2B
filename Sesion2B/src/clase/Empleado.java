package clase;


public class Empleado {
	
	public enum TipoEmpleado{Vendedor,Encargado};
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salario_base=0;
		float prima=0;
		float hora_extra;
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
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion=0;
		if(nominaBruta<2100) {
			return nominaBruta;
		}else {
			if(nominaBruta<2500) {
				retencion = (float)0.15;
			}else {
				retencion = (float)0.18;
			}
			return nominaBruta*(1-retencion);
		}
	}
}
