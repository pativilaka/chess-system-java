# <h1 align="center"> Chess System</h1>
<h2>Descrição do projeto:</h2>

Projeto guiado de Java e Orientação a Objetos do professor Nélio Alves - Udemy

<h4 align="center">     
    :construction:  Projeto em construção  :construction: 
</h4>


* Version 1: Class Position

  OOP Topics:
  - Encapsulation

  - Constructors

  - ToString (Object / overriding)

    

* Version 2: Class Piece, Board

    OOP Topics:
    - Associations
    - Encapsulation / Access Modifiers
    
    
    Data Structures Topics:
    - Matrix
    
      
    
* Version 3: 

    * Methods: Board.Piece(row, column) and Board.Piece(position) 
    * Enum Chess.Color 
    * Class Chess.ChessPiece [public] 
    *  Class Chess.ChessMatch [public] 
    * Class ChessConsole.UI

    OOP Topics:

    * Enumerations
    * Encapsulation / Access Modifiers 
    * Inheritance 
    * Downcasting 
    * Static members 
    * Layers pattern

    Data Structures Topics:

    * Matrix

    

* Version 4:

  * Method: Board.PlacePiece(piece, position) 
  * Classes: Rook, King [public] 
  * Method: ChessMatch.InitialSetup 

  OOP Topics:

  * Inheritance
  
  * Overriding
  
  * Polymorphism (ToString)
  
    
  
* Version 5:

  * Class BoardException [public]
  * Methods: Board.PositionExists, Board.ThereIsAPiece
  * Implement defensive programming in Board methods

  OOP Topics:

  * Exceptions
  * Constructors (a string must be informed to the exception)

  

* Version 6:

  * Class ChessException [public]
  * Class ChessPosition [public]
  * Refactor ChessMatch.InitialSetup

  OOP Topics:

  * Exceptions
  * Encapsulation
  * Constructors (a string must be informed to the exception)
  * Overriding
  * Static members
  * Layers pattern



* Version 7:
  * Place more pieces on the board
  * Distinguish piece colors in UI.PrintPiece method



* Version 8:

  * Method Board.RemovePiece
  * Method UI.ReadChessPosition
  * Method ChessMatch.PerformChessMove
    * Method ChessMatch.MakeMove
    * Method ChessMatch.ValidadeSourcePosition
  * Write basic logic on Program.cs

  OOP Topics:

  * Exceptions
  
  * Encapsulation
  
    
  
* Version 9:

  * ChessException
  
  * InputMismatchException
  
    
  
* Version 10:

  * Methods in Piece:
    * PossibleMoves [abstract]
    * PossibleMove // hook method 
    * IsThereAnyPossibleMove // hook method
  * Basic PossibleMove implementation for Rook and King
  * Update ChessMatch.ValidadeSourcePosition

  OOP Topics:

  * Abstract method / class
  
  * Exceptions
  
    
  
* Verson 11:

  * Method ChessPiece.IsThereOpponentPiece(position) [protected]
  * Implement Rook.PossibleMoves
  * Method ChessMatch.ValidateTargetPosition

  OOP Topics:

  * Polymorphism
  
  * Encapsulation / access modifiers [protected]
  
  * Exceptions
  
    
  
* Version 12:

  * Method ChessMatch.PossibleMoves
  * Method UI.PrintBoard [overload]
  * Refactor main program logic

  OOP Topics:

  * Overloading
  
    
  
* Version 13:

  * Method King.CanMove(position) [private]
  * Implement King.PossibleMoves

  OOP Topics:

  * Encapsulation
  * Polymorphism
