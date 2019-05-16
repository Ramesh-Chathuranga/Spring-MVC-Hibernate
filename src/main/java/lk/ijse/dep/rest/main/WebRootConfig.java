package lk.ijse.dep.rest.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(HibernateConfig.class)
public class WebRootConfig {
}
