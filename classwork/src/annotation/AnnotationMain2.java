package annotation;

import annotation.over.Player;

import java.lang.annotation.Annotation;

public class AnnotationMain2 {

    public static void main(String[] args) {

        Player player = new Player();
        Class aClass = player.getClass();
        for (Annotation annotation : aClass.getAnnotations()) {
         if(annotation instanceof Version){
             System.out.println("description " + ((Version) annotation).description());
             System.out.println("value " + ((Version) annotation).description());

         }

        }
    }


}
