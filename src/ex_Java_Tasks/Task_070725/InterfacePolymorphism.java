package ex_Java_Tasks.Task_070725;

public class InterfacePolymorphism {
    public static void main(String[] args) {
    Playable rockGuitar = new Guitar();
    Playable piano = new Piano();

    rockGuitar.play();
    piano.play();


    }
}

interface Playable{

    void play();
}

class Guitar implements Playable{


    @Override
    public void play() {
        System.out.println("Play sweet child of mine with the Guitar!!");
    }
}

class Piano implements Playable{


    @Override
    public void play() {
        System.out.println("Play Mozart on the piano!!");
    }
}