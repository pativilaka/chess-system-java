package boardgame;

public class Piece {
    protected Position position;

    private Board board;

    public Piece(Board board) {
        this.board = board;
        //position = null;
    }

    //Não posso permitir que o meu tabuleiro seja alterado, por isso não método set

    //Apenas a camada interna poderá acessar o tabuleiro
    protected Board getBoard() {
        return board;
    }

}
