package padroes_gof;

import padroes_gof.singleton.SingletonEager;
import padroes_gof.singleton.SingletonLazy;
import padroes_gof.singleton.SingletonLazyHolder;
import padroes_gof.strategy.Comportamento;
import padroes_gof.strategy.ComportamentoAgressivo;
import padroes_gof.strategy.ComportamentoDefensivo;
import padroes_gof.strategy.ComportamentoNormal;
import padroes_gof.strategy.Robo;

public class Testes{
    
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        

    }
    
}
