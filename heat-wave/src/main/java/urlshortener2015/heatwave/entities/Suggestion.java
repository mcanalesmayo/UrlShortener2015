package urlshortener2015.heatwave.entities;

public class Suggestion {
	
	private String recomendacion = "";
	
	public Suggestion(String nueva){
		this.recomendacion = nueva;
	}
	
	public String getRecomendacion() {
		return recomendacion;
	}
	
	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}
	
	@Override
	public String toString(){
		return recomendacion;
	}
}
