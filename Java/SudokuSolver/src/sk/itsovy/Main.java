package sk.itsovy;


//sudoku : prijmame string z 81 prvkami , vyjde nam vysledok , spravit cez dvojprvkove pole
// vstup : 100026039008700601000000200400900516000000000796004008009000000301002900640180003

public class Main {


    public static void main(String[] args) {

        String Input="100026039008700601000000200400900516000000000796004008009000000301002900640180003";

        SudokuSolve solve1 = new SudokuSolve(Input);
        solve1.prettify();
        solve1.solveSudoku();
        solve1.printSudoku();




    }


}
