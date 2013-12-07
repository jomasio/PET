package br.com.pet.util;

public enum Animais {
	
	 
	Akita_Americano("Cachorro"),   
	Akita_Inu("Cachorro") ,
	American_Pitbull("Cachorro"),
	Basset_Hound("Cachorro"),
	Beagle("Cachorro") , 
	Bichon_Fris�("Cachorro"),
	Boxer("Cachorro") , 
	Bulldog("Cachorro"), 
	Bullmastiff ("Cachorro"),
	Bull_Terrier("Cachorro") ,
	Chihuahua("Cachorro"),  
	Chow_Chow("Cachorro"),  
	Cocker_Americano("Cachorro"), 
	Cocker_ingles("Cachorro"), 
	Collie ("Cachorro"),
	D�lmata("Cachorro"),
	Dobermann ("Cachorro"), 
	Dogue_Alem�o("Cachorro"),
	Fila_Brasileiro ("Cachorro"),
	Foxhound_Ingl�s ("Cachorro"),
	Fox_Terrier_Pelo_Duro("Cachorro") , 
	Fox_Terrier_Pelo_Liso ("Cachorro"),
	Golden_Retriever("Cachorro"), 
	Husky_Siberiano ("Cachorro"), 
	Lavrador("Cachorro"),  
	Lhasa_Apso("Cachorro"),  
	Lulu_da_Pomer�nia("Cachorro"), 
	Malt�s("Cachorro"), 
	Mastiff("Cachorro"), 
	Mastino_Napoletano("Cachorro"),  
	O_E_Sheepdog("Cachorro"),       
	Pastor_Alem�o("Cachorro"),     
	Pequin�s("Cachorro"),         
	Perdigueiro("Cachorro"),     
	Pinscher("Cachorro"),     
	Pointer_Ingl�s("Cachorro"),  
	Poodle ("Cachorro"),       
	Rottweiler("Cachorro"),  
	S�o_Bernardo("Cachorro"), 
	Schunauzer_Gigante("Cachorro"), 
	Schunauzer_Miniatura("Cachorro"),  
	Schunauzer_Standard ("Cachorro"), 
	Setter_Ingl�s ("Cachorro"),  
	Setter_Irland�s("Cachorro"),  
	Shar_Pei("Cachorro"),   
	Shih_Tzu("Cachorro"), 
	Spitz_Alem�o ("Cachorro"),
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
     * M�todo criado para criar um vetor de Strings e preencher
     * com os nome dos enums da classe em quest�o.
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
     * Foi necess�rio criar o m�todos getValueOf para pegar um enum a partir de uma String.
     * O Enum possui um m�todo valueOf que retorna um enum a partir do nome do Enum, por exemplo,
     * Generos.valueOf(COMEDIA_ROMANTICA)
     * Retorna o Enum que define o g�nero COMEDIA_ROMANTICA
     * Como eu n�o quero mostrar para o usu�rio COMEDIA_ROMANTICA no combobox, 
     * pois fica feio. Eu defino um nome para cada enum
     * COMEDIA_ROMANTICA("COM�DIA ROM�NTICA"),
     *  desta forma posso mostrar um nome COM�DIA ROM�NTICA no combobox 
     *  usando uma chamada para toString. Veja que voc� tem que criar 
     *  um construtor, definir um nome (private String genero) e retornar esse nome no toString.
     *  Esse nome n�o � obrigat�rio, o enum poderia existir apenas com COMEDIA_ROMANTICA. 
     *  Por�m, a tentativa de criar um nome mais apraz�vel para o usu�rio gera um problema. 
     *  Como vou pegar um enum a partir de do valor que o usu�rio seleciona no combobox?
     *  Uma vez que tenho apenas o m�todo valueOf do enum que recebe o nome exato do enum. 
     *  Por exemplo, 
     *  Generos.valueOf(COMEDIA_ROMANTICA) //Retorna o Enum Generos.COMEDIA_ROMANTICA
     *  Generos.valueOf("COM�DIA ROM�NTICA") // Gera um erro pois essa string n�o faz parte do conjunto de enums definidos, ela � apenas um par�metro passados para o construtor daquela Enum.
     *  Por isso, � necess�rio fazer um m�todos que pegue o Enum tamb�m com o nome melhorado que definidos para aquela enum
     *  Generos.getValueOf("COM�DIA ROM�NTICA") // Agora sim, o enum � retornado com se fosse chamado o m�todo Generos.valueOf(COMEDIA_ROMANTICA)
     *  
     * @param string que ser� usada para recuperar o Enum em quest�o.
     * @return O Genero correspondente � String passada como par�metro.
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
