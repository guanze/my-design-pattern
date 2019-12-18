package design.pattern.prototype.example3;

import java.util.HashMap;

public class ProtoTypeManager {
    private HashMap<String,Shape> protoTypeCircleMap = new HashMap<String, Shape>();

    ProtoTypeManager(){
        protoTypeCircleMap.put("Circle",new Circle());
        protoTypeCircleMap.put("Square",new Square());
    }

    public void addShape(String key,Shape shape){
        protoTypeCircleMap.put(key,shape);
    }

    public Shape getShape(String key){
        return (Shape) protoTypeCircleMap.get(key).clone();
    }
}
