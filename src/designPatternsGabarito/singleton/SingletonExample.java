package designPatternsGabarito.singleton;


public class SingletonExample {
	
	private volatile SingletonExample INSTANCE;
	  
    private SingletonExample(){}
 
    public SingletonExample getInstance(){
        if(INSTANCE == null){
           synchronized(SingletonExample.class){
               //double checking Singleton instance
               if(INSTANCE == null){
                   INSTANCE = new SingletonExample();
               }
           }
        }
        return INSTANCE;
    }


	public static void main(String[] args) {
		SingletonExample singleton = new SingletonExample();
		System.out.println("Hora Inicio:"+System.currentTimeMillis());
		for(int i=0;i<100000000;i++)
			singleton.getInstance();
		System.out.println("Hora Fim:"+System.currentTimeMillis());
	}

}
