import java.util.*;

public class Pc implements Game {
    private Scanner SCANNER = new Scanner(System.in);
    Browser bw = new Browser();
    filling f = new filling();
    LinkedList llist = new LinkedList();

    //categories
    public void action() {
        llist.all();
        System.out.println("assassin creed");
        System.out.println("PUBG pc");
        System.out.println("Fortnite pc");
        System.out.println("Dishonored");

        while (true) {
            System.out.println("select any game for info");
            String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"assassin creed"))) {
                assassin();
            } else if (inp.equals(llist.search(llist.head,"PUBG pc"))) {
                pubg();
            } else if (inp.equals(llist.search(llist.head,"Fortnite pc"))) {
                fortnite();
            } else if (inp.equals(llist.search(llist.head,"dishonored"))) {
                Dishonored();
            } else if (inp.equals("back")) { action();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else{System.out.println("try again");}
        }
    }

    public void roleplaying() {
        System.out.println("The witcher 3");
        System.out.println("gta5");
        System.out.println("Red dead redempition");
        System.out.println("Dota 2");

        while (true) {
            System.out.println("select any game for info");
            String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"The witcher 3"))) {
                witcher();
            } else if (inp.equals(llist.search(llist.head,"gta5"))) {
                gta5();
            } else if (inp.equals(llist.search(llist.head,"red dead redempition"))) {
                reddeadredemption();
            } else if (inp.equals(llist.search(llist.head,"Dota 2"))) {
                dota2();
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void shooting() {
        System.out.println("Call of duty 4");
        System.out.println("Battlefield series");
        System.out.println("counter strike");
        System.out.println("Borderland 3");

        while (true) {
            System.out.println("select any game for info");
            String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"Call of Duty 4"))) {
                cod4();
            } else if (inp.equals(llist.search(llist.head,"battlefeild series"))) {
                battlefeild();
            } else if (inp.equals(llist.search(llist.head,"counter strike"))) {
                cs();
            } else if (inp.equals(llist.search(llist.head,"Borderland 3"))) {
                borderland();
            } else if (inp.equals("back")) {
                shooting();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void sport() {
        System.out.println("Need for speed most wanted");
        System.out.println("world racing z");
        System.out.println("WWE 2k20");
        System.out.println("cricket 2007");
    
        while (true) {
            System.out.println("select any game for info");
            String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"Need for speed most wanted"))) {
                nfsmw();
            } else if (inp.equals(llist.search(llist.head,"world war z"))) {
                wwz();
            } else if (inp.equals(llist.search(llist.head,"wwe 2k20"))) {
                wwe();
            } else if (inp.equals(llist.search(llist.head,"cricket 2007"))) {
                cricket7();
            } else if (inp.equals("back")) {
                sport();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    
    }

    public void advanture() {
        System.out.println("Tomb rider pc");
        System.out.println("dokapon");
        System.out.println("prince of persia 2008");
        System.out.println("out of order");
    
        while (true) {
            System.out.println("select any game for info");
            String inp = SCANNER.nextLine();
            if (inp.equals(llist.search(llist.head,"Tomb riader pc"))) {
                tr();
            } else if (inp.equals(llist.search(llist.head,"dokapon"))) {
                dokapon();
            } else if (inp.equals(llist.search(llist.head,"prince of persia 2008"))) {
                pop();
            } else if (inp.equals(llist.search(llist.head,"out of order"))) {
                ofo();
            } else if (inp.equals("back")) {
                advanture();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    
    
    }

    //Games method
    public void assassin(){
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            
            }

            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/creedspecs.txt");}
             else if (inp.equals("back")) {
                action();
            }
            else if (inp.equals("plot")){f.readFile("/home/soap/Desktop/gameselector/try.txt");}
            
            else if(inp.equals("exit")){System.exit(5);}
            else{System.out.println("try again");}
        }
        
    }

    public void pubg() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                problem();
            } 
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/creedspecs.txt");}
            else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }

    }

    public void fortnite() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                problem();
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }

    }

    public void Dishonored() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                action();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/dis.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }

    }

    public void witcher() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/p_plot/witcher 3.txt");
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/Witcher 3.txt");} 
            else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void gta5() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } 
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/gta 5.txt");}
            else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/gta 5.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void reddeadredemption() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/red dead redemption.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/rdr.txt");}
            else{System.out.println("try again");}
        }
    }

    public void dota2() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/dota 2.txt");
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/dota 2.txt");}
            else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void cs() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                shooting();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/counter strike.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/CS.txt");}
            else{System.out.println("try again");}
        }
    }

    public void battlefeild() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                shooting();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/Battlefield 4.txt");
            } 
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/bf4.txt");}
            else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void borderland() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                shooting();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/Broderland 3.txt");
            } 
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/bld3.txt");}
            else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void cod4() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                shooting();
            } 
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/COD 4.txt");}
            else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/COD 4.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }
    public void nfsmw() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/NFS.txt");
            } 
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/nfs.txt");}
            else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void wwz() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/World racing z.txt");
            } 
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/World racing Z.txt");}
            else if (inp.equals("exit")) {
                System.exit(5);
            }else{System.out.println("try again");}
        }
    }

    public void wwe() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/wwe 2k20.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/WWE 2K20.txt");}
            else{System.out.println("try again");}
        }
    }

    public void ofo() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/out of order.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/out of order.txt");}
            else{System.out.println("try again");}
        }
    }

    public void tr() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/Tr.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/tra.txt");}
            else{System.out.println("try again");}
        }
    }

    public void pop() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/pop.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/pop.txt");}
            else{System.out.println("try again");}
        }
    }

    public void cricket7() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/Cricket 07.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/cricket 07.txt");}
            else{System.out.println("try again");}
        }
    }

    public void dokapon() {
        while (true) {
            System.out.println("plot , download , memes, specs ,back");
            String inp = SCANNER.nextLine();
            if (inp.equals("download")) {
                bw.open("https://oceanof-games.com/");
            } else if (inp.equals("back")) {
                roleplaying();
            } else if (inp.equals("plot")) {
                f.readFile("/home/soap/Desktop/gameselector/pc/pcplot/Dokapon.txt");
            } else if (inp.equals("exit")) {
                System.exit(5);
            }
            else if(inp.equals("specs")){f.readFile("/home/soap/Desktop/gameselector/pc/pcspecs/dokapon.txt");}
            else{System.out.println("try again");}
        }
    }

    public void problem(){System.out.println("this game dont have any plot or story");}
}
