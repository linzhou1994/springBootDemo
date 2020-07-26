package com.example.demo.mybatis.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Statement;
import java.util.Properties;


@Intercepts(@Signature(type = StatementHandler.class,
        method = "parameterize",args = Statement.class))
public class MyFirstPlugin implements Interceptor {

    /**
     *
     * 拦截目标方法的执行
     *
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        System.out.println("intercept................");

        Object proceed = invocation.proceed();


        return proceed;
    }

    @Override
    public Object plugin(Object target) {
        System.out.println("plugin................");
        return Plugin.wrap(target,this);
    }

    /**
     * 获取
     * @param properties
     */
    @Override
    public void setProperties(Properties properties) {
        System.out.println("setProperties................");

    }
}
