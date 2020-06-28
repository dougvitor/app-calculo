package br.com.home.app.calculo;

import static br.com.home.app.logging.AppLogger.info;

import br.com.home.app.ICalculadora;
import br.com.home.app.calculo.interno.OperacoesAritmeticas;
import br.com.home.app.logging.AppLogger;

public class CalculadoraImpl implements ICalculadora {
	
	private String id = "abc";
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double somar(double... nums) {
		info("Somando... ");
		return opAritmeticas.soma(nums);
	}
	
	public Class<AppLogger> getLoggerClass(){
		return AppLogger.class;
	}
	
}
