package padroes_gof.singleton;

/*Singleton preguiçoso
 * Implementa o padrão Singleton de forma que a instância é criada apenas quando é realmente necessária.
 * Isso é útil para economizar recursos, especialmente se a instância é pesada ou rara de ser usada.
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    
    
}
