package obj.core;

public class ManWithConstructorAndSetter extends ManWithConstructor{


    public void setName (String name){
        name +=" Ты мне очень нравишься";
        super.setName(name);
    }


}
