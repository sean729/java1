/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.sean.p1.service;

import java.math.BigDecimal;

/**
 *
 * @author mastermind
 */
public interface IGVService {

    double IGV_PERCENT_VALUE = 0.19;

    public BigDecimal calculateIgvFromAmount(BigDecimal amount);
}
