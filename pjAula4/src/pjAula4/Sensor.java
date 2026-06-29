package pjAula4;

import java.util.Date;

public class Sensor {
	int codigo;
	float medida;
	Date dataMedicao;
	
	public Sensor() {
		
	}
	
	public Sensor(int codigo, float medida) {
		this.codigo = codigo;
		this.medida = medida;
	}
	
	public Sensor(int codigo, float medida, Date dataMedicao) {
		this(codigo, medida);
		if(dataMedicao != null) {
			this.dataMedicao = dataMedicao;
		}else {
			dataMedicao = new Date();
		}
	}
}
