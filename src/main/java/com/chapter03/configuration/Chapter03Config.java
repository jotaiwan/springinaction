package com.chapter03.configuration;

import com.beans.Notepad;
import com.beans.dessert.Cake;
import com.beans.dessert.Cookies;
import com.beans.dessert.IceCream;
import com.beans.music.CDPlayer;
import com.beans.music.SgtPeppers;
import com.beans.shopping.ShoppingCart;
import com.interfaces.Dessert;
import com.interfaces.music.CompactDisc;
import com.interfaces.music.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;

@Configuration
//@Profile("chapter03")
//@ComponentScan(basePackages = {"com.beans"})
//@Import(CDPlayerConfig.class)
public class Chapter03Config {

//    @Autowired CDPlayerConfig cdPlayerConfig;


    /**
     * inject another config
     * */
    @Bean
    public DataSourceConfig dataSourceConfig() {
        return new DataSourceConfig();
    }

    /**
     * inject compact disc
     * */
    @Bean
    public CDPlayerConfig cdPlayerConfig() {
        return new CDPlayerConfig();
    }
//
//    @Bean
//    public CompactDisc sgtPeppers() {
//        return new SgtPeppers();
//    }
//
//    @Bean
//    public MediaPlayer mediaPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }

    @Bean
    @Primary        // or you can declare to IceCream Object after @Component
    public IceCream iceCream() {
        return new IceCream();
    }

    @Bean
    public Cake cake() {
        return new Cake();
    }

    @Bean
    public Cookies cookies() {
        return new Cookies();
    }

    /**
     * instance will be created each time when inject
     * */
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Notepad notepad() {
        return new Notepad();
    }

    @Bean
    @Scope(value= WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
    public ShoppingCart cart() {
        return new ShoppingCart();
    }

//    @Bean
//    public DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .addScript("com/data/schema/schema.sql")
//                .addScript("com/data/schema/test-data.sql")
//                .build();
//    }
//
//    @Bean
//    public DataSource dataSource2() {
//        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
//        jndiObjectFactoryBean.setJndiName("jdbc/myDS");;
//        jndiObjectFactoryBean.setResourceRef(true);
//        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
//        return (DataSource) jndiObjectFactoryBean.getObject();
//    }


}
