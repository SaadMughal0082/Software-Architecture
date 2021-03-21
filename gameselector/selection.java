

import java.util.*;

public class selection{
    private Scanner SCANNER = new Scanner(System.in);

    Pc pc = new Pc();
    Playstation ps = new Playstation();
    Browser bw = new Browser();
    LinkedList llist = new LinkedList();
    
    void select(){

        llist.all();
    
while(true){   

    System.out.println("select platform i.e: pc,ps , display all games, sort , search");
    String input = SCANNER.nextLine();
    //PC
       
    if(input.equals("pc")){
        while(true){
        System.out.println("select game category i.e : action , adventure etc.");
        String ins = SCANNER.nextLine();

        if(ins.equals("action")){pc.action();}

        else if(ins.equals("advanture")){pc.advanture();}

        else if(ins.equals("role playing")){pc.roleplaying();}

        else if(ins.equals("shooting")){pc.shooting();}

        else if(ins.equals("sport")){pc.sport();}

        else if(ins.equals("exit")){System.exit(5);}

        else if(ins.equals("back")){select(); }

        else{System.out.println("wrong category");}
    }}


//Playstation    
    else if(input.equals("ps")){
    while(true){               
    System.out.println("select game category i.e : action , adventure etc.");
    final String ins = SCANNER.nextLine();

    if(ins.equals("action")){ps.action();}

    else if(ins.equals("advanture")){ps.advanture();}

    else if(ins.equals("role playing")){ps.roleplaying();}

    else if(ins.equals("shooting")){ps.shooting();}

    else if(ins.equals("sport")){ps.sport();}


    else if(ins.equals("exit")){System.exit(5);}

    else if(ins.equals("back")){select(); }

    else{System.out.println("wrong category");}
    }
    }

    else if(input.equals("exit")){
        System.out.println("exiting....");
        System.exit(0);
    }

    else if(input.equals("display"))
    {
        llist.display();
    }

    else if(input.equals("sort"))
    {
        
        llist.sortList();
    }

    else if(input.equals("search")){        while (true) {
        System.out.println("type the name of game to search");
        String inp = SCANNER.nextLine();
        if (inp.equals(llist.search(llist.head, "spiderman"))) {
            ps.spiderman();
        } else if (inp.equals(llist.search(llist.head, "Star wars: Battlefront 2"))) {
            ps.star();
        } else if (inp.equals(llist.search(llist.head,"The knightfall"))) {
            ps.kf();
        } else if (inp.equals(llist.search(llist.head,"Apex construct"))) {
            ps.apex();
        }
        else if (inp.equals(llist.search(llist.head,"judgement"))) {
            ps.jmt();
        } else if (inp.equals(llist.search(llist.head,"tomb raider"))) {
            ps.tr();
        } else if (inp.equals(llist.search(llist.head,"bleed 2"))) {
            ps.b2();
        } else if (inp.equals(llist.search(llist.head,"castle costume"))) {
            ps.cc();
        }
        else if (inp.equals(llist.search(llist.head,"Anthem"))) {
            ps.athm();
        } else if (inp.equals(llist.search(llist.head,"the witcher"))) {
            ps.whr();
        } else if (inp.equals(llist.search(llist.head,"final fantacy"))) {
            ps.ff();
        } else if (inp.equals(llist.search(llist.head,"vampyr"))) {
            ps.vpyr();
        }
        if (inp.equals(llist.search(llist.head,"destiny"))) {
            ps.dty();
        } else if (inp.equals(llist.search(llist.head,"pubg"))) {
            ps.pubg();
        } else if (inp.equals(llist.search(llist.head,"realm royale"))) {
            ps.rr();
        } else if (inp.equals(llist.search(llist.head,"knives out"))) {
            ps.kot();
        }
        else if (inp.equals(llist.search(llist.head,"need for speed the run"))) {
            ps.nfstr();
        } else if (inp.equals(llist.search(llist.head,"steep"))) {
            ps.stp();
        } else if (inp.equals(llist.search(llist.head,"pes-20"))) {
            ps.pes();
        } else if (inp.equals(llist.search(llist.head,"ea sport ufc"))) {
            ps.ufc();
        }
        else if (inp.equals(llist.search(llist.head,"assassin creed"))) {
            pc.assassin();
        } else if (inp.equals(llist.search(llist.head,"pubg pc"))) {
            pc.pubg();
        } else if (inp.equals(llist.search(llist.head,"fortnite pc"))) {
            pc.fortnite();
        } else if (inp.equals(llist.search(llist.head,"dishonored"))) {
            pc.Dishonored();
        }
        else if (inp.equals(llist.search(llist.head,"The witcher 3"))) {
            pc.witcher();
        } else if (inp.equals(llist.search(llist.head,"gta5"))) {
            pc.gta5();
        } else if (inp.equals(llist.search(llist.head,"red dead redempition"))) {
            pc.reddeadredemption();
        } else if (inp.equals(llist.search(llist.head,"Dota 2"))) {
            pc.dota2();
        }
        else if (inp.equals(llist.search(llist.head,"Call of duty 4"))) {
            pc.cod4();
        } else if (inp.equals(llist.search(llist.head,"battlefeild series"))) {
            pc.battlefeild();
        } else if (inp.equals(llist.search(llist.head,"counter strike"))) {
            pc.cs();
        } else if (inp.equals(llist.search(llist.head,"Borderland 3"))) {
            pc.borderland();
        }
        else if (inp.equals(llist.search(llist.head,"Need for speed most wanted"))) {
            pc.nfsmw();
        } else if (inp.equals(llist.search(llist.head,"world war z"))) {
            pc.wwz();
        } else if (inp.equals(llist.search(llist.head,"wwe 2k20"))) {
            pc.wwe();
        } else if (inp.equals(llist.search(llist.head,"cricket 2007"))) {
            pc.cricket7();
        }
        else if (inp.equals(llist.search(llist.head,"Tomb riader pc"))) {
            pc.tr();
        } else if (inp.equals(llist.search(llist.head,"dokapon"))) {
            pc.dokapon();
        } else if (inp.equals(llist.search(llist.head,"prince of persia 2008"))) {
            pc.pop();
        } else if (inp.equals(llist.search(llist.head,"out of order"))) {
            pc.ofo();
        }}}

    else {
        System.out.println("Sorry!!!.....platform doesn't match");
        System.out.println("try again");
        
            }
        }
    }

}




