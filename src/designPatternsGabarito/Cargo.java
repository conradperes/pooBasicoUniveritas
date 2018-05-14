package designPatternsGabarito;

import java.util.HashMap;
import java.util.Map;

public enum Cargo {
	
	ATENDENTE(1, "ATENDENTE" ),
	VENDEDOR(2,"VENDEDOR"),
	GERENTE(3,"GERENTE"),
	DBA(4,"DBA"),
	ARQUITETO_SOLUCOES(5,"ARQUITETO_SOLUCOES"),
	ARQUITETO_CORPORATIVO(6,"ARQUITETO_CORPORATIVO"),
	PROGRAMADOR(7,"PROGRAMADOR"),
	ANALISTA_SISTEMAS(8,"ANALISTA_SISTEMAS"),
	PROJETISTA_SISTEMAS(9,"PROJETISTA_SISTEMAS");

	/** 
     * Guarda as relacoes entre a descricao e o valor 
     * de um elemento da enum 
     */  
    private static Map<String, Cargo> relations;  
	private String descricao;
	private int id;

	public String getDescricao() {
		return descricao;
	}


	private Cargo(int id, String descricao ) {
		this.descricao = descricao;
		this.setId(id);
	}
	
	 /** 
     * Recupera um elemento da enum a partir de uma string 
     * @param descr A string de descricao do elemento 
     * @return Um elemento da enum ou null caso nenhum elemento 
     * seja encontrado para a descricao pesquisada. 
     */  
    public static Cargo getCargoPorDescr(String descr) {  
      return relations.get(descr);  
    }
    /** 
     * Recupera um elemento da enum a partir de uma string 
     * @param id A string de descricao do elemento 
     * @return Um elemento da enum ou null caso nenhum elemento 
     * seja encontrado para a descricao pesquisada. 
     */  
    public static Cargo getCargoPorDescr(int id) {  
      return relations.get(id);  
    }  
      
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	/** 
     * Bloco estatico que popula o hashmap com as relacoes entre 
     * descricao e elementos da enum 
     */  
    static {  
      relations = new HashMap<String, Cargo>();  
      for(Cargo s : values()) relations.put(s.getDescricao(), s);      
    }  

}
