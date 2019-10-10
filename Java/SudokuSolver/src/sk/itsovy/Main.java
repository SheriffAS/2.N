package sk.itsovy;


//sudoku : prijmame string z 81 prvkami ,vyjde nam 81 prvkovi string , mozme to robit aj cez dvojprvkove pole
// vstup : 100026039008700601000000200400900516000000000796004008009000000301002900640180003

public class Main {
    static int a = 0;

    public static void main(String[] args) {
        a++;
        String Input="100026039008700601000000200400900516000000000796004008009000000301002900640180003";

        SudokuSolve solve1 = new SudokuSolve(Input);
        solve1.prettify();

        System.out.println("From main "+a);

    }


}
