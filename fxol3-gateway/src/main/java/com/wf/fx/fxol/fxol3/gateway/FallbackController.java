package com.wf.fx.fxol.fxol3.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/reportFallBack")
    public Mono<String> reportServiceFallBack() {
        return Mono.just("Report Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/templateFallback")
    public Mono<String> templateServiceFallBack() {
        return Mono.just("Template Service is taking too long to respond or is down. Please try again later");
    }
}
