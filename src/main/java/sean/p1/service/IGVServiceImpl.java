/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.sean.p1.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author mastermind
 */
@Singleton
@Slf4j
public class IGVServiceImpl implements IGVService {

    @Override
    public BigDecimal calculateIgvFromAmount(BigDecimal amount) {
        BigDecimal result = amount.multiply(new BigDecimal(IGV_PERCENT_VALUE));
        result = result.setScale(2, RoundingMode.HALF_UP);
        return result;
    }
}
