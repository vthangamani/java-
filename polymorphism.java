// Parent Class
class Wonder {
    public void display() {
        System.out.println("Wonder and Location");
    }
}

// Child Classes
class TajMahal extends Wonder {
    @Override
    public void display() {
        System.out.println("Taj Mahal - Agra, India");
    }
}

class GreatWall extends Wonder {
    @Override
    public void display() {
        System.out.println("Great Wall of China - China");
    }
}

class Petra extends Wonder {
    @Override
    public void display() {
        System.out.println("Petra - Jordan");
    }
}

class Colosseum extends Wonder {
    @Override
    public void display() {
        System.out.println("Colosseum - Rome, Italy");
    }
}

class ChichenItza extends Wonder {
    @Override
    public void display() {
        System.out.println("Chichen Itza - Mexico");
    }
}

class MachuPicchu extends Wonder {
    @Override
    public void display() {
        System.out.println("Machu Picchu - Peru");
    }
}

class ChristRedeemer extends Wonder {
    @Override
    public void display() {
        System.out.println("Christ the Redeemer - Rio de Janeiro, Brazil");
    }
}

// Main Class
public class SevenWonders {
    public static void main(String[] args) {

        Wonder[] wonders = {
            new TajMahal(),
            new GreatWall(),
            new Petra(),
            new Colosseum(),
            new ChichenItza(),
            new MachuPicchu(),
            new ChristRedeemer()
        };

        System.out.println("Seven Wonders of the World:\n");

        for (Wonder w : wonders) {
            w.display();   // Runtime Polymorphism
        }
    }
}
