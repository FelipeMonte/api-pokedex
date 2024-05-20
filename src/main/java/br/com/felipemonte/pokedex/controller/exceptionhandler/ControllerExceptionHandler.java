package br.com.felipemonte.pokedex.controller.exceptionhandler;


import br.com.felipemonte.pokedex.exceptions.PokemonNaoEncontradoException;
import br.com.felipemonte.pokedex.model.ExceptionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PokemonNaoEncontradoException.class)
    public ResponseEntity<?> handleCatNotFound(PokemonNaoEncontradoException e, WebRequest request) {
        ExceptionModel exceptionModel = new ExceptionModel("Pokemon não encontrado");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionModel);
    }

}
