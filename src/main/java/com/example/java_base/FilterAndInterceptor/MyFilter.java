package com.example.java_base.FilterAndInterceptor;


import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

/**
 * @author zzq 2019/8/1 17:28
 * @description
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("=====开始filter1======");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {
        System.out.println("=====销毁filter1======");
    }
}
