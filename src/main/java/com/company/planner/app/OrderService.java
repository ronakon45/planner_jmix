package com.company.planner.app;

import java.math.BigDecimal;

public interface OrderService {
    public BigDecimal calculateTotalAmount(int orderId);
}
