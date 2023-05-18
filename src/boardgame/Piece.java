package boardgame;

public abstract class Piece {
    protected Position position;

    private Board board;

    public Piece(Board board) {
        this.board = board;
        //position = null;
    }

    //Não posso permitir que o meu tabuleiro seja alterado, por isso não há método set

    //Apenas a camada interna poderá acessar o tabuleiro
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

}
