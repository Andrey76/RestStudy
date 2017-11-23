package Utills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

import static org.hibernate.cfg.Environment.*;

@Configuration
@PropertySource("application.properties")
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("Dao"),
        @ComponentScan("Utills"),
        @ComponentScan("Model"),
        @ComponentScan("Service") })

public class AppConfig {
    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        Properties props = new Properties();
        // Setting JDBC properties
        props.put(DRIVER, env.getProperty("spring.datasource.driver-class-name"));
        props.put(URL, env.getProperty("spring.datasource.url"));
        props.put(USER, env.getProperty("spring.datasource.username"));
        props.put(PASS, env.getProperty("spring.datasource.password"));

        props.put(SHOW_SQL, env.getProperty("spring.jpa.properties.hibernate.format_sql"));
        props.put(DIALECT, env.getProperty("spring.jpa.properties.hibernate.dialect"));
        factoryBean.setHibernateProperties(props);
        factoryBean.setPackagesToScan("model");
        return factoryBean;

    }

    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/restapp1");
        dataSource.setUsername("root");
        dataSource.setPassword("andr1991");
        return dataSource;
    }
}
