package com.example.webapp;

import com.example.webapp.filter.CustomerFilter;
import com.example.webapp.listener.CustomerListener;
import com.example.webapp.servlet.CustomerServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

@SpringBootApplication
@ServletComponentScan
public class WebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }

    /**
     * 通过代码注册自定义Servlet
     * @return
     */
//    @Bean
//    public ServletRegistrationBean MyServlet() {
//        return new ServletRegistrationBean(new CustomerServlet(), "/hello/*");
//
//    }

    /**
     * 通过代码注册自定义Filter
     * @return
     */
//    @Bean
//    public FilterRegistrationBean myFilter(){
//        CustomerFilter customerFilter = new CustomerFilter();
//        FilterRegistrationBean registrationBean =  new FilterRegistrationBean();
//        registrationBean.setFilter(customerFilter);
//        List<String> urlPatterns=new ArrayList<String>();
//        urlPatterns.add("/*");//拦截路径，可以添加多个
//        registrationBean.setUrlPatterns(urlPatterns);
//        registrationBean.setOrder(1);
//        return registrationBean;
//    }

    /**
     * 自定义ServletListen监听
     * @return
     */
//    @Bean
//    public ServletListenerRegistrationBean<EventListener> getDemoListener(){
//        ServletListenerRegistrationBean<EventListener> registrationBean =new ServletListenerRegistrationBean<>();
//        registrationBean.setListener(new CustomerListener());
//        return registrationBean;
//    }


}
