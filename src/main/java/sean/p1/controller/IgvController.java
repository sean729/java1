package reto.sean.p1.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpHeaders;
import java.io.IOException;
import java.math.BigDecimal;
import javax.inject.Inject;

import lombok.extern.slf4j.Slf4j;
import reto.sean.p1.service.IGVService;

@Slf4j
@Controller("/igv")
public class IgvController {

    @Inject
    IGVService iGVService;

    @Get(value = "/calculate/{amount}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public String calculateIGV(@QueryValue Double amount, final HttpHeaders headers) throws IOException {
        return "{\"IGV\":\"" + (iGVService.calculateIgvFromAmount(new BigDecimal(amount))) + "\"}";
    }
}
