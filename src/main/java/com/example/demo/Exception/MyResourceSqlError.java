<<<<<<< HEAD
package com.example.demo.Exception;

import org.hibernate.exception.SQLGrammarException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyResourceSqlError extends SQLException {
    public MyResourceSqlError() {
        super();
    }
    public MyResourceSqlError(String message, Throwable cause) {
        super(message, cause);
    }
    public MyResourceSqlError(String message) {
        super(message);
    }
    public MyResourceSqlError(Throwable cause) {
        super(cause);
    }
}
=======
package com.example.demo.Exception;

import org.hibernate.exception.SQLGrammarException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLException;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyResourceSqlError extends SQLException {
    public MyResourceSqlError() {
        super();
    }
    public MyResourceSqlError(String message, Throwable cause) {
        super(message, cause);
    }
    public MyResourceSqlError(String message) {
        super(message);
    }
    public MyResourceSqlError(Throwable cause) {
        super(cause);
    }
}
>>>>>>> 0d53964d0ca56025d058e7b889db5ced174b47a7
