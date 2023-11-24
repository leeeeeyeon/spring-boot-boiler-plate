package com.example.springbootboilerplate.global.exception.badrequest.duplicated;

import com.example.springbootboilerplate.global.exception.BusinessException;
import com.example.springbootboilerplate.global.response.ErrorCode;

public class DuplicatedException extends BusinessException {

    public DuplicatedException(ErrorCode errorCode) {
        super(errorCode);
    }
}
