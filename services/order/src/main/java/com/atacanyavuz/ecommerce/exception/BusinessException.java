package com.atacanyavuz.ecommerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class BusinessException extends RuntimeException {
    private final String msg;
}
