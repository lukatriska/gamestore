//import java.util.ArrayList;
//
//public class ComputerStore {
//    private static int gamesIdCounter = 0;
//    private ArrayList<ComputerGame> computerGames;
//
//    public ComputerStore() {
//        computerGames = new ArrayList<ComputerGame>();
//    }
//
//    public void addGame(ComputerGame computerGame) {
//        gamesIdCounter++;
//        computerGame.getSpecifications().setGameId(gamesIdCounter);
//        this.computerGames.add(computerGame);
//    }
//
//    public ArrayList<ComputerGame> search(ComputerGameParameters searchParameters) {
//        ArrayList<ComputerGame> matching = new ArrayList<ComputerGame>();
//        for (ComputerGame computerGame : computerGames) {
//            if (computerGame.getSpecifications().filter(searchParameters)) {
//                matching.add(computerGame);
//            }
//        }
//        return matching;
//    }
//
//    public ArrayList<ComputerGame> getComputerGames() {
//        return computerGames;
//    }
//
//    public int getNumberOfGameAvailable() {
//        return this.computerGames.size();
//    }
//
//    public void removeGame(ComputerGame computerGame) {
//        for (int i = 0; i < this.getNumberOfGameAvailable(); i++) {
//            if (this.computerGames.get(i) == computerGame)
//                this.computerGames.remove(i);
//        }
//    }
//
//
//}

import java.util.ArrayList;

public class ComputerStore
{
    private ArrayList<ComputerGame> games;

    public ArrayList<ComputerGame> getGames()
    {
        return games;
    }

    public void addGame(ComputerGame game)
    {
        this.games.add(game);
    }




}
