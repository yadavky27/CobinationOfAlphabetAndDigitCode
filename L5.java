class Dispaly {
    public void displayNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("i got some interrupted number ");
            }
        }
    }

    public void displayCharacters() {
        for (int i = 65; i <76; i++) {

            System.out.print((char) i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("i got some interrupted charcter ");
            }
        }
    }
}
    class myth extends Thread {
        Dispaly d;

        myth(Dispaly d) {
            this.d = d;
        }

        @Override
        public void run() {
            d.displayNumbers();
        }
    }

    class myt extends Thread {
        Dispaly d;

        myt(Dispaly d) {
            this.d = d;
        }

        @Override
        public void run() {
            d.displayCharacters();
        }
    }

public class L5 {
    public static void main(String[] args) {
        System.out.println();
        Dispaly d=new Dispaly();
       myth m=new myth(d);
       myt m1=new myt(d);
        m.start();

        m1.start();
    }
}
