package pjAula4;

import java.util.Date;

public class SensorEspecial extends Sensor{
	float valorMinino;
	float valorMaximo;
	
	public SensorEspecial(int codigo, float medida, Date dataMedicao,
			float valorMinimo, float valorMaximo) {
		//Invocando o construtor da classe Pai
		super(codigo, medida, dataMedicao);
		this.valorMinino = valorMinimo;
		this.valorMaximo = valorMaximo;
	}

}
