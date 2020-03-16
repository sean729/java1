/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.intercorp.renzocarpio.service;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.math.BigDecimal;
import javax.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author mastermind
 */
@MicronautTest
@DisplayName("Test Unitario del calculo de IGV")
public class IGVServiceImplTest {

    @Inject
    IGVService instance;

    /**
     * Test of calculateIgvFromAmount method, of class IGVServiceImpl.
     */
    @DisplayName("Debe calcular el IGV correctamente de todos los montos")
    @ParameterizedTest
    @CsvSource({"100,18.00", "90,16.20", "50,9.00", "150,27.00"})
    public void testCalculateIgvFromAmount(String amountBase, String igvExpected) {
        System.out.println("calculateIgvFromAmount");
        BigDecimal amount = new BigDecimal(amountBase);
        BigDecimal expResult = new BigDecimal(igvExpected);
        BigDecimal result = instance.calculateIgvFromAmount(amount);
        Assertions.assertEquals(
                expResult,
                result
        );
    }

}
