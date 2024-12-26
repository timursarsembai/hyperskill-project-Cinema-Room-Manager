package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows:\n");
        int rows = input.nextInt();
        System.out.print("Enter the number of seats in each row:\n");
        int cols = input.nextInt();

        char[][] cinema = createCinema(rows, cols);
        int purchasedTickets = 0;
        int currentIncome = 0;

        while (true) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int command = input.nextInt();

            switch (command) {
                case 1:
                    showTheSeats(cinema);
                    break;
                case 2:
                    int[] result = buyTicket(input, rows, cols, cinema);
                    if (result[0] == 1) {
                        purchasedTickets++;
                        currentIncome += result[1];
                    }
                    break;
                case 3:
                    showStatistics(purchasedTickets, rows, cols, currentIncome);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static char[][] createCinema(int rows, int cols) {
        char[][] cinema = new char[rows + 1][cols + 1];
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {
                if (i == 0 && j == 0) {
                    cinema[i][j] = ' ';
                } else if (i == 0) {
                    cinema[i][j] = (char) ('0' + j);
                } else if (j == 0) {
                    cinema[i][j] = (char) ('0' + i);
                } else {
                    cinema[i][j] = 'S';
                }
            }
        }
        return cinema;
    }

    public static void showTheSeats(char[][] cinema) {
        System.out.println("Cinema:");
        for (char[] row : cinema) {
            for (char seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public static int[] buyTicket(Scanner input, int rows, int cols, char[][] cinema) {
        while (true) {
            System.out.print("Enter a row number:\n");
            int row = input.nextInt();
            System.out.print("Enter a seat number in that row:\n");
            int col = input.nextInt();

            if (row < 1 || row > rows || col < 1 || col > cols) {
                System.out.println("Wrong input!");
            } else if (cinema[row][col] == 'B') {
                System.out.println("That ticket has already been purchased!");
            } else {
                cinema[row][col] = 'B';
                int ticketPrice = calculateTicketPrice(row, rows, cols);
                System.out.println("Ticket price: $" + ticketPrice);
                return new int[]{1, ticketPrice};
            }
        }
    }

    public static int calculateTicketPrice(int row, int rows, int cols) {
        int totalSeats = rows * cols;
        if (totalSeats <= 60 || row <= rows / 2) {
            return 10;
        } else {
            return 8;
        }
    }

    public static void showStatistics(int purchasedTickets, int rows, int cols, int currentIncome) {
        int totalSeats = rows * cols;
        double percentage = (double) purchasedTickets * 100 / totalSeats;
        int totalIncome = calculateTotalIncome(rows, cols);

        System.out.println("Number of purchased tickets: " + purchasedTickets);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }

    public static int calculateTotalIncome(int rows, int cols) {
        int totalSeats = rows * cols;
        if (totalSeats <= 60) {
            return totalSeats * 10;
        } else {
            int frontHalfRows = rows / 2;
            int backHalfRows = rows - frontHalfRows;
            return (frontHalfRows * cols * 10) + (backHalfRows * cols * 8);
        }
    }
}
