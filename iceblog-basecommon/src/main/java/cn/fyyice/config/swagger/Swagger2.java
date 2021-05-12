package cn.fyyice.config.swagger;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description:
 * @author: fwh
 * @time: 2021/5/12 13:47
 */
@Configurable
@EnableSwagger2
public class Swagger2 {

//    @Bean
//    public Docket createRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage();
//    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Cloud iceBlog Api docx")
                .description("路子野，心很大")
                .termsOfServiceUrl("http://fyyice.cn")
                .version("1.0")
                .build();
    }

}
