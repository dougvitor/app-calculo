module app.calculo {
	
	requires transitive app.logging;
	
	exports br.com.home.app.calculo;
	
	exports br.com.home.app.calculo.interno to app.financeiro, app.logging;
	
	opens  br.com.home.app.calculo to app.logging, app.financeiro;
	
}