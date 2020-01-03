package com.example.webfluxhelloworld.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;


/**
 * @author Sam
 * @date 2020/1/3 14:58
 */
@Component
public class XttblogHandler {
    public Mono<ServerResponse> helloXttblog(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).header("Content-Type","text/plain; charset=utf-8")
                .body(BodyInserters.fromObject("Hello, 业余草：www.xttblog.com !"));
    }
}
