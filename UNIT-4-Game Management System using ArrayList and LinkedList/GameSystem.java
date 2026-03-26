import java.util.ArrayList;
import java.util.LinkedList;
class Game {
int gameId;
String gameName;
Game(int gameId, String gameName) {
this.gameId = gameId;
this.gameName = gameName;
}
@Override
public String toString() {
return "Game ID: " + gameId + " | Game Name: " + gameName;
}
}
public class GameSystem {
public static void displayGames(String title, Iterable<Game> games) {
System.out.println("\n" + title);
for (Game g : games) {
System.out.println(g);
}
}
public static void searchGame(Iterable<Game> games, String name) {
boolean found = false;
for (Game g : games) {
if (g.gameName.equalsIgnoreCase(name)) {
System.out.println("\nGame Found: " + g);
found = true;
break;
}
}
if (!found) {
System.out.println("\nGame not found!");
}
}
public static void main(String[] args) {
ArrayList<Game> sectionA = new ArrayList<>();
sectionA.add(new Game(1,"Free Fire"));
sectionA.add(new Game(2,"PUBG"));
sectionA.add(new Game(3,"Call of Duty"));
sectionA.add(new Game(4,"Minecraft"));
sectionA.add(new Game(5,"GTA V"));
sectionA.add(new Game(6,"FIFA"));
sectionA.add(new Game(7,"Need for Speed"));
sectionA.add(new Game(8,"Clash of Clans"));
sectionA.add(new Game(9,"Subway Surfers"));
displayGames("Section A (ArrayList Games):", sectionA);
sectionA.remove(2);
displayGames("After removing one game from Section A:", sectionA);
System.out.println("Total Games in Section A: " + sectionA.size());
searchGame(sectionA, "Minecraft");
LinkedList<Game> sectionB = new LinkedList<>();
sectionB.add(new Game(101,"Valorant"));
sectionB.add(new Game(102,"Fortnite"));
sectionB.add(new Game(103,"Among Us"));
sectionB.add(new Game(104,"Apex Legends"));
sectionB.add(new Game(105,"Rocket League"));
sectionB.add(new Game(106,"CS:GO"));
displayGames("Section B (LinkedList Games):", sectionB);
sectionB.removeFirst();
displayGames("After removing first game from Section B:", sectionB);
System.out.println("Total Games in Section B: " + sectionB.size());
searchGame(sectionB, "Valorant");
}
}