package sk.itsovy;


public class SudokuSolve {

    Value[][] sudoku = new Value[9][9];

    public SudokuSolve(String input){
        int count=0;
        for(int a=0;a<sudoku.length;a++){
            for (int b=0;b<sudoku[a].length;b++){
                sudoku[a][b] = new Value(Integer.parseInt(String.valueOf(input.charAt(count))));
                    count++;

            }
        }

    }

    private boolean checkColumn(int column, int searchingNumber, int line) {
        for(int a=0; a<sudoku.length;a++) {
            if (line != a){
                if (sudoku[a][column].getCertainNumber() == searchingNumber) {
                    return true;
                }
            }
        }
        return false;
    }


    private boolean checkLine(int line, int searchingNumber, int column){
        for(int a=0; a<sudoku.length;a++){
            if (column != a) {
                if (sudoku[line][a].getCertainNumber() == searchingNumber){
                    return true;
                }
            }
        }
        return false;
    }



    private boolean chech9Square(int linePosition,int columnPosition, int searchingNumber){

        int startLinePosition = (linePosition/3)*3;
        int startColumnPosition = (columnPosition/3)*3;

        for(int a=startLinePosition;a<startLinePosition+3;a++){
            for(int b=startColumnPosition;b<startColumnPosition+3;b++){
                if (a==linePosition && b==columnPosition){
                }else{
                    if (sudoku[a][b].getCertainNumber()==searchingNumber){
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public void solveSudoku(){

        int baseCount;

        do{
            baseCount=0;
            for(int a=0;a<sudoku.length;a++){

                for (int b=0;b<sudoku[a].length;b++){

                    if (sudoku[a][b].getCertainNumber()==0){

                        for (int number = 1; number<10; number++){

                            if (checkLine(a,number,b)){

                            }else if(checkColumn(b,number,a)){

                            }else if(chech9Square(a,b,number)){

                            }else{

                                sudoku[a][b].setChances(number);

                                if (sudoku[a][b].getChances().size()>1){
                                    break;
                                }
                            }
                        }
                        if (sudoku[a][b].getChances().size() == 1){

                            sudoku[a][b].setCertainNumber(sudoku[a][b].getChances().get(0));
                        }else{
                            baseCount++;
                            sudoku[a][b].cleanChances();
                        }
                    }
                }
            }
        }while(baseCount!=0);
    }

    public void prettify(){
        System.out.println("________________________");
        for(int a=0;a<sudoku.length;a++){
            System.out.print("|");

            for(int b=0;b<sudoku[a].length;b++){
                System.out.print(" "+sudoku[a][b].getCertainNumber());


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

    public void printSudoku(){
        System.out.println("______SOLVED SUDOKU______");
        for(int a=0;a<sudoku.length;a++){
            System.out.print("|");
            for (int b=0;b<sudoku[a].length;b++){
                System.out.print(" "+sudoku[a][b].getCertainNumber());
                if (b==2 || b==5 || b==8){
                    System.out.print(" |");
                }
            }
            System.out.println();
            if ((a+1)%3 == 0){
                System.out.println(" ________________________");
            }
        }

    }








}
