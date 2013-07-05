package br.com.bsos.app.util;

public class CommonException extends Exception {

    private static final long serialVersionUID = 1L;

    public CommonException(String mensagem) {
        super(mensagem);
    }

    public CommonException(String mensagem, Throwable e) {
        super(mensagem, e);
    }
}
