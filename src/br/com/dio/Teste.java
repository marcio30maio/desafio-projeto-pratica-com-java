package br.com.dio;

import br.com.dio.facade.Facade;
import br.com.dio.singleton.SingletonEager;
import br.com.dio.singleton.SingletonLayze;
import br.com.dio.singleton.SingletonLazyHolder;
import br.com.dio.estrategia.*;

public class Test {

    public static <SingletonLayze> void main(String[] args) {

        // Singleton

        SingletonLayze layze = SingletonLayze.getIntancia();
        System.out.println(layze);
        layze = SingletonLayze.getInstancia();
        System.out.println(layze);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }

}