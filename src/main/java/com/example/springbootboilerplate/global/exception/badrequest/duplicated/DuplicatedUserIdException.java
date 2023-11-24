package com.example.springbootboilerplate.global.exception.badrequest.duplicated;

import com.example.springbootboilerplate.global.response.ErrorCode;

public class DuplicatedUserIdException extends DuplicatedException {

    public DuplicatedUserIdException() {
        super(ErrorCode.DUPLICATED_USER_ID);
    }

}
