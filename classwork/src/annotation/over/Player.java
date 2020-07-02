package annotation.over;

import annotation.Version;

public class Player implements iPlay{

    @Version(description = "Класс плеер")
    @Override
    public void play() {
        System.out.println("some play");
    }

    @Version (value = "2.5.7", description = "Играет музыка")
    @Override
    public void play(String play) {
        System.out.println("some game");
    }

    public void playMusic (String music){
        System.out.println("play music");
    }



}
