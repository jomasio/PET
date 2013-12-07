package br.com.pet.util;

public enum Animais {
	
	 
	Akita_Americano("Cachorro"),   
	Akita_Inu("Cachorro") ,
	American_Pitbull("Cachorro"),
	Basset_Hound("Cachorro"),
	Beagle("Cachorro") , 
	Bichon_Frisé("Cachorro"),
	Boxer("Cachorro") , 
	Bulldog("Cachorro"), 
	Bullmastiff ("Cachorro"),
	Bull_Terrier("Cachorro") ,
	Chihuahua("Cachorro"),  
	Chow_Chow("Cachorro"),  
	Cocker_Americano("Cachorro"), 
	Cocker_ingles("Cachorro"), 
	Collie ("Cachorro"),
	Dálmata("Cachorro"),
	Dobermann ("Cachorro"), 
	Dogue_Alemão("Cachorro"),
	Fila_Brasileiro ("Cachorro"),
	Foxhound_Inglês ("Cachorro"),
	Fox_Terrier_Pelo_Duro("Cachorro") , 
	Fox_Terrier_Pelo_Liso ("Cachorro"),
	Golden_Retriever("Cachorro"), 
	Husky_Siberiano ("Cachorro"), 
	Lavrador("Cachorro"),  
	Lhasa_Apso("Cachorro"),  
	Lulu_da_Pomerânia("Cachorro"), 
	Maltês("Cachorro"), 
	Mastiff("Cachorro"), 
	Mastino_Napoletano("Cachorro"),  
	O_E_Sheepdog("Cachorro"),       
	Pastor_Alemão("Cachorro"),     
	Pequinês("Cachorro"),         
	Perdigueiro("Cachorro"),     
	Pinscher("Cachorro"),     
	Pointer_Inglês("Cachorro"),  
	Poodle ("Cachorro"),       
	Rottweiler("Cachorro"),  
	São_Bernardo("Cachorro"), 
	Schunauzer_Gigante("Cachorro"), 
	Schunauzer_Miniatura("Cachorro"),  
	Schunauzer_Standard ("Cachorro"), 
	Setter_Inglês ("Cachorro"),  
	Setter_Irlandês("Cachorro"),  
	Shar_Pei("Cachorro"),   
	Shih_Tzu("Cachorro"), 
	Spitz_Alemão ("Cachorro"),
	Staff_Bull_Terrier("Cachorro"),   
	Teckel ("Cachorro"),     
	Terrier_Brasileiro ("Cachorro"),
	Yorkshire_Terrier("Cachorro");
	
	private String Animais;
	
	private Animais(String Animais )
	{
		this.Animais = Animais;
	}
	
	public String getAnimais() {
		return Animais;
	}
	
	private static String[] names = null;
    
    /**
     * Método criado para criar um vetor de Strings e preencher
     * com os nome dos enums da classe em questão.
     * 
     * @return Retorna uma String dos nome dos Enums.
     */
    public static String[] names() {
    	
    	if(names != null)
    		return names;
    	
    	Animais[] animais = values();
        names = new String[animais.length];

        for (int i = 0; i < animais.length; i++) {
            names[i] = animais[i].toString();
        }

        return names;
    }
    
    /**
     * Foi necessário criar o métodos getValueOf para pegar um enum a partir de uma String.
     * O Enum possui um método valueOf que retorna um enum a partir do nome do Enum, por exemplo,
     * Generos.valueOf(COMEDIA_ROMANTICA)
     * Retorna o Enum que define o gênero COMEDIA_ROMANTICA
     * Como eu não quero mostrar para o usuário COMEDIA_ROMANTICA no combobox, 
     * pois fica feio. Eu defino um nome para cada enum
     * COMEDIA_ROMANTICA("COMÉDIA ROMÂNTICA"),
     *  desta forma posso mostrar um nome COMÉDIA ROMÂNTICA no combobox 
     *  usando uma chamada para toString. Veja que você tem que criar 
     *  um construtor, definir um nome (private String genero) e retornar esse nome no toString.
     *  Esse nome não é obrigatório, o enum poderia existir apenas com COMEDIA_ROMANTICA. 
     *  Porém, a tentativa de criar um nome mais aprazível para o usuário gera um problema. 
     *  Como vou pegar um enum a partir de do valor que o usuário seleciona no combobox?
     *  Uma vez que tenho apenas o método valueOf do enum que recebe o nome exato do enum. 
     *  Por exemplo, 
     *  Generos.valueOf(COMEDIA_ROMANTICA) //Retorna o Enum Generos.COMEDIA_ROMANTICA
     *  Generos.valueOf("COMÉDIA ROMÂNTICA") // Gera um erro pois essa string não faz parte do conjunto de enums definidos, ela é apenas um parâmetro passados para o construtor daquela Enum.
     *  Por isso, é necessário fazer um métodos que pegue o Enum também com o nome melhorado que definidos para aquela enum
     *  Generos.getValueOf("COMÉDIA ROMÂNTICA") // Agora sim, o enum é retornado com se fosse chamado o método Generos.valueOf(COMEDIA_ROMANTICA)
     *  
     * @param string que será usada para recuperar o Enum em questão.
     * @return O Genero correspondente à String passada como parâmetro.
     */
    public static Animais getValueOf(String string){
    	Animais[] animais = values();
    	Animais ret = null;
    	 for (int i = 0; i < animais.length; i++) {
    		 if(string.equalsIgnoreCase(animais[i].toString()))
    		{
    			 ret= animais[i];
    			 break;
    		}
    	 }
		return ret;
    }
	
	@Override  
    public String toString() {  
        return Animais;  
    }
	

}
