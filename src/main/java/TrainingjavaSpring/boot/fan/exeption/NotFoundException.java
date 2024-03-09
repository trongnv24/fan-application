package TrainingjavaSpring.boot.fan.exeption;

import lombok.Getter;

@Getter
public class NotFoundException extends  RuntimeException{
    private  String message;
    private  String id;
    private  String objectName;
    public NotFoundException( String message,String id, String objectName) {
        this.id = id;
        this.objectName = objectName;
        this.message = message;
    }
}
