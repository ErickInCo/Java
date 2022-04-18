



public class HolaMundo {


    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;
        screen.out("\t\tBienvenidos a la mision de backend java\n","Helvetica",28, Colors.NYCTaxi);
        screen.setVisible(true);
        str=d.readString("Quieres aprender a hacer esto");
        if (str.charAt(0) == 'S' || str.charAt(0)=='s'){
            screen.showImage("Kled.jpg");
            screen.out("\n\t\tHola Explorers mi nombre es Kled y sere tu nuevo campeon favorito");
        }else{
            screen.out("Talvez en otro momento, bye","Century Schoolbook L", 28, Colors.BeniukonBronze);
        }
    }
}