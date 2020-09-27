package com.sanlian.boot;

import com.sanlian.boot.properties.TmriClientConfiguration;
import com.sanlian.boot.selector.TmriClientSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @ClassName TmriClientConfig
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/23
 **/
@Configuration
//@ComponentScan("com.sanlian.core.impl") // 指定路径
@Import(TmriClientSelector.class)
public class TmriClientConfig {
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Bean
    //@Order(1)
    public TmriClientConfiguration regristerShardingConfiguration() {
        System.out.println("初始化配置");
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TmriClientConfiguration.class);
        String id = "tmriClientConfiguration";

        beanDefinitionBuilder
                .setLazyInit(false)
                .setFactoryMethod("configuration");

        // BeanDefinition interceptorFactoryBeanDefinition = registerInterceptorFactoryBean();
        // beanDefinitionBuilder.addPropertyValue("interceptorFactory", interceptorFactoryBeanDefinition);


        BeanDefinition beanDefinition = beanDefinitionBuilder.getRawBeanDefinition();
        //beanDefinition.getPropertyValues().addPropertyValue("sslKeyStores", sslKeystoreMap);

        BeanDefinitionRegistry beanFactory = (BeanDefinitionRegistry) applicationContext.getBeanFactory();
        beanFactory.registerBeanDefinition(id, beanDefinition);
        TmriClientConfiguration configuration = applicationContext.getBean(id, TmriClientConfiguration.class);
        return configuration;
    }

}
