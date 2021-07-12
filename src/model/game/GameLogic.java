package model.game;

import javafx.geometry.Point2D;
import model.GameElement;
import model.cards.Card;
import model.cards.levelEnums.Botlevel;

public class GameLogic {
    private ArenaModel model ;
    private GameData data ;
    private Botlevel botlevel ;
    private Point2D currPoint ;
    private Card currCard ;
    private boolean playerMoved ;

    public GameLogic() {
        playerMoved = false ;
        botlevel = Botlevel.RANDOME ;
    }
    public void preprocessLogic(){
        model = ArenaModel.arenaModel;
        data = ArenaModel.arenaModel.gameData;
    }
    public void executeLogic(){

        checkForPlayerMove();
        updateCards();
        updateBoard();
        if(playerMoved){
            executeBot();
            playerMoved = false ;
        }
    }


    private void checkForPlayerMove(){
        if(currPoint != null && currCard != null){
            if(point2cellValue(currPoint) == null){
                currCard.setPoint(currPoint);
                data.boardElements.add(currCard);
                playerMoved = true ;
                currCard = null ;
                currPoint = null ;
            }
        }
    }


    private GameElement point2cellValue(Point2D point){
        return model.cellValues[(int)point.getY()][(int)point.getX()];
    }

    private void executeBot(){
        switch(botlevel){
            case RANDOME:

            case MEDIUM:

            case HARD:
        }
    }


    private void updateCards(){


        for(GameElement m : data.boardElements){
            if(m instanceof Card){

                switch(m.getValue()){
                    case GIANT:

                    case ARCHER:
                    case BARBERIAN:
                    case MINI_PEKA:
                    case WIZARD:
                    case VALKYRIE:
                    case CANNON:
                    case INFERNO:
                    case FIREBALL:
                    case RAGE:
                    case ARROWS:
                }

            }
            else
            {

            }

        }

    }
    private void updateBoard() {
        model.cellValues = new GameElement[model.rowCount][model.columnCount];
        for (GameElement i : data.boardElements) {
            model.cellValues[(int) i.getPoint().getY()][(int) i.getPoint().getX()] = i;
        }

    }

    public void setBotlevel(Botlevel botlevel) {
        this.botlevel = botlevel;
    }
    public void setCurrPoint(Point2D currPoint) {
        if(!(currPoint.getY()>=11 && currPoint.getY()<=17))
            return ;
        else if(currCard == null)
            return ;
        else
            this.currPoint = currPoint;
    }
    public void setCurrCard(Card currCard) {
        if(!data.boardElements.contains(currCard))
            this.currCard = currCard;
    }





}
