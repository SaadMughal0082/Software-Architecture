
import java.util.*;

public class Playstation implements Game {

    private final Scanner SCANNER = new Scanner(System.in);
    Browser bw = new Browser();
    filling f = new filling();
    Pc p = new Pc();
    LinkedList llist = new LinkedList();
    //Start with the empty list 
    

    @Override
    public void action() {
        llist.all();    
        System.out.println("Spiderman");
        System.out.println("Star wars: Battlefront 2");
        System.out.println("The knightfall");
        System.out.println("Apex construct");

        while (true) {
            System.out.println("select any game for info");
            String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head, "spiderman"))) {
                spiderman();
            } else if (inp.equals(llist.search(llist.head, "Star wars: Battlefront 2"))) {
                star();
            } else if (inp.equals(llist.search(llist.head,"The knightfall"))) {
                kf();
            } else if (inp.equals(llist.search(llist.head,"Apex construct"))) {
                apex();
            } else if (inp.equals("back")) { action();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else{System.out.println("try again");}
        }
    }

    @Override
    public void advanture() {
        llist.all();
        System.out.println("Judgement");
        System.out.println("Tomb raider");
        System.out.println("Bleed 2");
        System.out.println("castle costume");

        while (true) {
            System.out.println("select any game for info");
            final String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"judgement"))) {
                jmt();
            } else if (inp.equals(llist.search(llist.head,"tomb raider"))) {
                tr();
            } else if (inp.equals(llist.search(llist.head,"bleed 2"))) {
                b2();
            } else if (inp.equals(llist.search(llist.head,"castle costume"))) {
                cc();
            } else if (inp.equals("back")) { advanture();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else{System.out.println("try again");}
        }
    }

    @Override
    public void roleplaying() {
        llist.all();
        System.out.println("Anthem");
        System.out.println("The witcher");
        System.out.println("Final fantacy series");
        System.out.println("vampyr");

        while (true) {
            System.out.println("select any game for info");
            final String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"Anthem"))) {
                athm();
            } else if (inp.equals(llist.search(llist.head,"the witcher"))) {
                whr();
            } else if (inp.equals(llist.search(llist.head,"final fantacy"))) {
                ff();
            } else if (inp.equals(llist.search(llist.head,"vampyr"))) {
                vpyr();
            } else if (inp.equals("back")) { roleplaying();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else{System.out.println("try again");}
        }
    }

    @Override
    public void shooting() {
        System.out.println("pubg");
        System.out.println("Destiny");
        System.out.println("realm royale");
        System.out.println("knives out");

        while (true) {
            System.out.println("select any game for info");
            final String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"destiny"))) {
                dty();
            } else if (inp.equals(llist.search(llist.head,"pubg"))) {
                pubg();
            } else if (inp.equals(llist.search(llist.head,"realm royale"))) {
                rr();
            } else if (inp.equals(llist.search(llist.head,"knives out"))) {
                kot();
            } else if (inp.equals("back")) { shooting();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else{System.out.println("try again");}
        }
    }

    @Override
    public void sport() {
        llist.all();
        System.out.println("need for speed the run");
        System.out.println("steep");
        System.out.println("PES-20");
        System.out.println("EA sports UFC");

        while (true) {
            System.out.println("select any game for info");
            final String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"need for speed the run"))) {
                nfstr();
            } else if (inp.equals(llist.search(llist.head,"steep"))) {
                stp();
            } else if (inp.equals(llist.search(llist.head,"pes-20"))) {
                pes();
            } else if (inp.equals(llist.search(llist.head,"ea sport ufc"))) {
                ufc();
            } else if (inp.equals("back")) { sport();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else{System.out.println("try again");}
        }
    }

    //Games methods
    //Action
    public void spiderman() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/sp.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void star() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/star.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void kf() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/kf.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void apex() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/apex.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    //advanture games
    public void jmt() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/jdg.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void tr() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/trl.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void b2() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/bleed 2.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void cc() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/cc.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    //role playing games
    public void athm() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                p.problem();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void whr() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                p.problem();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void ff() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                p.problem();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void vpyr() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                p.problem();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    //shooting games
    public void dty() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/destiny.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void pubg() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                p.problem();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void rr() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/rr.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void kot() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/ko.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    //sport games
    public void nfstr() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/NFS the run.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }


    public void stp() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/Steep.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void pes() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/PES 20.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void ufc() {
        while (true) {
            System.out.println("plot , download , memes ,back");
            final String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/ps4/ufc.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }
}