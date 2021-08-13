package com.company.planner.app;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("sample_OrderService")
public class CalculationServiceBean implements OrderService {
    @Override
    public BigDecimal calculateTotalAmount(int orderId) {
        return new BigDecimal(42);
    }
}