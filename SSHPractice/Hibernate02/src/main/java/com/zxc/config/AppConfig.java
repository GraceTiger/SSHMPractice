package com.zxc.config;

        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.FilterType;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;
        import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//子容器扫描Controller
@ComponentScan(value = "com.zxc",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
},useDefaultFilters = false)
//开启自定义MVC配置
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

    //配置视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/pages/",".jsp");
    }

    //静态资源访问
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
