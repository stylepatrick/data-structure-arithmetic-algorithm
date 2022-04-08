public class TicTacToe {

    int[][] game;

    TicTacToe() {
        game = new int [3][3];
    }

    public void add(int gamer, int y, int x) {
        if ((x < 3 && y < 3) && game[y][x] == 0) {
            System.out.println("----------");
            game[y][x] = gamer;
            int winner = checkWinner();
            if (winner > -1) {
                System.out.println("Winner: " + winner);
            }
            print();
            System.out.println("----------");
        } else {
            System.out.println("## Error input. Gamer: " + gamer + " try again");
        }
    }

    private void print() {
        for (int[] ints : game) {
            System.out.print(ints[0] + " ");
            System.out.print(ints[1] + " ");
            System.out.print(ints[2] + " ");
            System.out.println("");
        }
    }

    private int checkWinner() {
        int winner = - 1;
        for (int i = 0; i < game.length; i++) {
            if (game[0][i] > 0) {
                if (game[0][i] == game[1][i] && game[0][i] == game[2][i]) {
                    winner = game[0][i];
                }
            }
            if (game[i][0] > 0) {
                if (game[i][0] == game[i][1] && game[i][0] == game[i][2]) {
                    winner = game[i][0];
                }
            }
        }
        if ((game[1][1] > 0 && game[0][0] == game[1][1] && game[0][0] == game[2][2]) || (game[1][1] > 0 && game[2][0] == game[1][1] && game[2][0] == game[0][2])) {
            winner = game[1][1];
        }
        return winner;
    }

}
