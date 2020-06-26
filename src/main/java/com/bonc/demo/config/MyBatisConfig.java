package com.bonc.demo.config;

import com.google.common.base.CaseFormat;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.wrapper.MapWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @author DELL
 * @Date 2020/3/2
 */
@Configuration
public class MyBatisConfig  {

    @Bean
    public ConfigurationCustomizer mybatisConfigurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                System.out.println("加载自定义--------------");
                configuration.setObjectWrapperFactory(new MapWrapperFactory());
            }
        };
    }

    private class MapWrapperFactory implements ObjectWrapperFactory {

        @Override
        public boolean hasWrapperFor(Object object) {
            return object != null && object instanceof Map;
        }

        @Override
        public ObjectWrapper getWrapperFor(MetaObject metaObject, Object object) {
            return new CustomWrapper(metaObject,(Map)object);
        }
    }

    private class CustomWrapper extends MapWrapper {


        public CustomWrapper(MetaObject metaObject, Map<String, Object> map) {
            super(metaObject, map);
        }


        @Override
        public String findProperty(String name, boolean useCamelCaseMapping) {
            if(useCamelCaseMapping){
                //CaseFormat是引用的 guava库,里面有转换驼峰的,免得自己重复造轮子,pom添加
                /**
                 **         <dependency>
                 <groupId>com.google.guava</groupId>
                 <artifactId>guava</artifactId>
                 <version>24.1-jre</version>
                 </dependency>
                 **/
                System.out.println("驼峰正在转换");
                return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,name);
            }
            return name;
        }
    }
}
