package br.com.zup.modelo;

public class Facebook extends RedeSocial{
	
   private int numerosCutucadas;
   
   public Facebook(String nomeUsuario, int numerosCurtidas, int numerosCompartilhamentos) {
		super(nomeUsuario, numerosCurtidas, numerosCompartilhamentos);
		
	}

    public int getNumerosCutucadas() {
	return numerosCutucadas;
}

    public void setNumerosCutucadas(int numerosCutucadas) {
	this.numerosCutucadas = numerosCutucadas;
}
    
    @Override
    public String darLike() {
    	
    	String darLike = "Curtido...";
    	return darLike;
    }
    
    
    @Override
    public String compartilhar() {
    	
    	String compartilhar = "Compartilhado...";
    	return compartilhar;
    }
    
   
    public String cutucar() {
    	
    	String cutucada = "Cutucado...";
    	return cutucada;
    }
    
    @Override
    	public String toString() {
    	
    		String modelo = "";
    		
        	modelo += " ->" + super.() + "\n";
        	modelo += " ->" + super.() + "\n";
        	modelo += " ->" + super.();
    		
    		
    		return modelo;
    	}
   
}
