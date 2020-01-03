package com.example.webfluxhelloworld.router;

import com.example.webfluxhelloworld.handler.XttblogHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


/**
 * @author Sam
 * @date 2020/1/3 14:57
 */
@Configuration
public class HelloWebFlux {

    @Bean
    public RouterFunction<ServerResponse> helloXttblog(XttblogHandler handler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        handler::helloXttblog).filter((serverRequest, handlerFunction) -> {
                    return ServerResponse.status(HttpStatus.OK).header("Content-Type","text/plain; charset=utf-8").build();
                });
    }
}
