package TrainingjavaSpring.boot.fan.controller;

import TrainingjavaSpring.boot.fan.dto.response.FanResponse;
import TrainingjavaSpring.boot.fan.exeption.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ControllerAdvance {
        @ExceptionHandler(NotFoundException.class)
        public ResponseEntity<?> handleNotFoundException(NotFoundException exception) {
            String message = "id: " + exception.getId() + exception.getObjectName() ;

            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        }
    }

