package cn.tedu.store.service.ex;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(){

    }
    public UserNotFoundException(String message){
        super(message);
    }
}
