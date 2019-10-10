package sk.itsovy;

public class SudokuSolve {

    int[][] sudoku;
    public SudokuSolve(String input) {
            this.sudoku = new int[9][9];
            int count=0;

            for (int a=0;a<sudoku.length;a++){
                for (int b=0;b<sudoku[a].length;b++){
                    sudoku[a][b] = Integer.parseInt(
                            String.valueOf(input.charAt(count)
                            )
                    );

//                    System.out.print(sudoku[a][b]);

                    count++;
                }
            }

//        System.out.println(Main.a);
//            Main.a += 3;
    }
    public void prettify(){
        for(int a=0;a<sudoku.length;a++){
            System.out.print("|");
            for(int b=0;b<sudoku[a].length;b++){
                System.out.print(" "+sudoku[a][b]);


                if(b==2 || b==5 || b==8){
                    System.out.print(" |");
                }
            }
            System.out.println();
            if ((a+1)%3==0){
                System.out.println(" ________________________");
            }
        }
    }


}
