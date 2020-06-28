module app.calculo {
	
	requires transitive app.logging;
	
	exports br.com.home.app.calculo;
	
	//exports br.com.home.app.calculo.interno to app.financeiro, app.logging;
	
	opens  br.com.home.app.calculo to app.logging, app.financeiro;
	
	requires app.api.publica;
	
	provides br.com.home.app.ICalculadora with br.com.home.app.calculo.CalculadoraImpl;
	
	
}