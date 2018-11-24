import java.util.Scanner;

public class rpg {
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.print("Greetings, traveller. Enter your name: ");
        String name = input.nextLine();
        System.out.println("\nWelcome to Hyrule, "+name+"! It has been a year since Link has defeated Calamity"+
                " Ganon. Hyrule is yours to explore! Type in a cardinal or intermediate direction (North(N),"+
                " Northeast(NE), East(E), Southeast(SE), South(S), Southwest(SW), West(W), and Northwest(NW))"+
                " to begin your journey!");
        hyruleField();
    }
    private static void hyruleField() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou find yourself directly in the center of of the expansive Hyrule Field. You"+
                " feel the grass around your legs gently wafting back and forth as the calm wind blows across"+
                " the fields. Your nostrils react to the lightly-sweet scent of the grass. To the north is" +
                " Hyrule Castle Town Ruins and Hyrule Castle itself. To the Northeast is Eldin, home of the" +
                " rock-loving Gorons. To the East is Lanayru, home of the aquatic Zoras. To the southeast is" +
                " Necluda and Hateno Village. To the south is the lush forests of Faron. To the southeast is" +
                " the vast, harsh desert of Gerudo and the Gerudo people themselves. To the west is the Gerudo" +
                " Highlands and Hyrule Ridge. To the northwest is the frigid region of Hebra, home of the avian" +
                " Rito people.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                System.out.println("\nYou travel north to Hyrule Castle Town Ruins.");
                hyruleCastleTownRuins();
                break;
            case "NE":
                System.out.println("\nYou travel northeast to Eldin.");
                eldin();
                break;
            case "E":
                System.out.println("\nYou travel east to Lanayru.");
                lanayru();
                break;
            case "SE":
                System.out.println("\nYou travel southeast to Necluda.");
                necluda();
                break;
            case "S":
                System.out.println("\nYou travel south to Faron.");
                faron();
                break;
            case "SW":
                System.out.println("\nYou travel southwest to Gerudo.");
                gerudo();
                break;
            case "W":
                System.out.println("\nYou travel west to Hyrule Ridge.");
                west();
                break;
            case "NW":
                System.out.println("\nYou travel northwest to Hebra.");
                hebra();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void hyruleCastleTownRuins() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou have trekked into the once-lively ruins of Hyrule Castle Town. Your feet gently"+
                        " brush across century-old pots as you step into the remnants of the town. You can almost hear"+
                        " the hustle-and-bustle of all those peaceful citizens going about their daily lives all those"+
                        " years ago. To the south is Hyrule Field. To the east is Eldin. To the northwest is Hebra.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "E":
                System.out.println("\nYou travel east to Eldin.");
                eldin();
                break;
            case "S":
                System.out.println("\nYou travel south to Hyrule Field.");
                hyruleField();
                break;
            case "NW":
                System.out.println("\nYou travel northwest to Hebra.");
                hebra();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void eldin() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at the blistering region of Eldin. You've read that visiting certain areas" +
                " of this region requires the use of either heat-proof gear or a bottle of Fireproof Elixer. Thankfully,"+
                " you already have a few bottles of the elixer. To the southwest is Hyrule Field. To the south is"+
                " Lanayru. To the southeast is Zora's Domain.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "SE":
                outsideZorasDomain();
                break;
            case "S":
                lanayru();
                break;
            case "SW":
                System.out.println("\nYou travel southwest to Hyrule Field.");
                hyruleField();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void lanayru() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at the marshy wetlands of Lanayru. You've read that this land is home to the"+
                " aquatic Zora people who are known for their athletic prowess in water. To the west is Hyrule Field. To the south"+
                " is Necluda. To the north is Zora's Domain.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                System.out.println("\nYou travel north to Zora's Domain.");
                outsideZorasDomain();
                break;
            case "S":
                System.out.println("\nYou travel south to Necluda.");
                necluda();
                break;
            case "W":
                System.out.println("\nYou travel west to Hyrule Field.");
                hyruleField();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void outsideZorasDomain() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at Zora's Domain. There are plenty of Zoras walking around. The architecture"+
                " of the surrounding structures are unlike anything you've ever seen before. To the south is Lanayru. To the northwest is Eldin.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "S":
                System.out.println("\nYou travel south to Lanayru.");
                lanayru();
                break;
            case "NW":
                eldin();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void necluda() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at Necluda. You feel the breeze of the plains pat your face as you continue"+
                " trekking on. This region is well-known for the villages of Kakariko and Hateno. To the north is"+
                " Lanayru. To the northwest is Hyrule Field. To the east is Hateno Village. To the southwest is Faron.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                System.out.println("\nYou head north to Lanayru.");
                lanayru();
                break;
            case "E":
                outsideHatenoVillage();
                break;
            case "SW":
                System.out.println("\nYou travel southwest to Faron.");
                faron();
                break;
            case "NW":
                System.out.println("\nYou travel northwest to Hyrule Field.");
                hyruleField();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void outsideHatenoVillage() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at Hateno Village. You can see on top of a hill is the village's research"+
                " center, home of the child-like Sheikah, Purah. To the north is Lanayru. To the west is Necluda. To the northwest is Zora's Domain.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                System.out.println("\nYou head north to Lanayru.");
                lanayru();
                break;
            case "W":
                System.out.println("\nYou travel west to Necluda.");
                necluda();
                break;
            case "NW":
                System.out.println("\nYou travel northwest towards Zora's Domain.");
                outsideZorasDomain();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void faron() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at Faron. You take a deep breath and enjoy the scent of the fresh forest air."+
                " Trees surround you from every direction, rustling around to nature's command. To the north is Hyrule"+
                " Field. To the northeast is Lanayru. To the west is Gerudo.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                System.out.println("\nYou travel north to Hyrule Field.");
                hyruleField();
                break;
            case "NE":
                System.out.println("\nYou travel northeast to Lanayru.");
                lanayru();
                break;
            case "W":
                System.out.println("\nYou travel west to Gerudo.");
                gerudo();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void gerudo() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at Gerudo. The entire region seems to be like two regions in one. By day, it"+
                " feels as hot as Eldin. And by night, it feels as cold as Hebra. To the north is the Gerudo"+
                " Highlands. To the northeast is Hyrule Field. To the east is Faron.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                System.out.println("\nYou travel north to the Gerudo Highlands.");
                gerudoHighlands();
                break;
            case "NE":
                System.out.println("\nYou travel northeast to Hyrule Field.");
                hyruleField();
                break;
            case "E":
                System.out.println("\nYou travel east to Faron.");
                faron();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void west() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at Hyrule Ridge. Off in the distance you can see a violent thunderstorm"+
                " tearing up the land. You figure it would be wise to stay away from the storm. To the north is"+
                " the region of Hebra. To the northwest is Rito Village. To the east is Hyrule Field. To the southwest is the Gerudo Highlands.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                hebra();
                break;
            case "E":
                System.out.println("\nYou travel east to Hyrule Field.");
                hyruleField();
                break;
            case "SW":
                System.out.println("\nYou travel southwest to the Gerudo Highlands.");
                gerudoHighlands();
                break;
            case "NW":
                System.out.println("\nYou travel northwest to the entrace of Rito Village.");
                outsideRitoVillage();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void hebra() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou arrive at the bitter, icy region of Hebra. You are on top of Talonto Peak. You feel" +
                " like you can see the entirety of Hyrule from here. Snowy-white mountains that seem to touch" +
                " the sky surround you from every direction. Speaking of snow, it hasn't stopped snowing since you arrived," +
                " which is why you bundled up on your way. To the south is Rito Village. To the southeast is Hyrule Field.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "SE":
                System.out.println("\nYou travel southeast to Hyrule Field.");
                hyruleField();
                break;
            case "S":
                System.out.println("\nYou travel south to the entrance to Rito Village.");
                outsideRitoVillage();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void outsideRitoVillage() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou are now at the quaint, little village of the Rito people. The"+
                " town is comprised of a large stone spire stretching upwards above a donut-shaped canyon with"+
                " huts built onto the sides of the stone spire. To the north is Hebra. To the southeast is"+
                " Hyrule Ridge. To the south is the Gerudo Highlands.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                hebra();
                break;
            case "SE":
                System.out.println("\nYou travel southeast to Hyrule Ridge.");
                west();
                break;
            case "S":
                gerudoHighlands();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
    private static void gerudoHighlands() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nYou are now in the Gerudo Highlands. You can't help but feel the entire area is identical"+
                " to Hebra in that the whole region is nothing but a bitter, cold wasteland. To the north is"+
                " Rito Village. To the northeast is Hyrule Ridge. To the south is Gerudo.");
        System.out.print("\nChoose your direction: ");
        String dir = input.nextLine();
        switch (dir.toUpperCase()) {
            case "N":
                outsideRitoVillage();
                break;
            case "NE":
                west();
            case "S":
                gerudo();
                break;
            default:
                System.out.println("\nEnter a valid direction.");
                break;
        }
    }
}
