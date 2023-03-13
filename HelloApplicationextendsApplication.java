public class HelloApplicationextendsApplication {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x;
        int score = 0;
        int y;


        System.out.print("Enter the number of rounds you wish to play: ");
        x= reader.nextInt();


        for (int i = 1; i <= x; i++) {
            System.out.print("Round " + i + ": Enter your lucky number: ");
             y = reader.nextInt();
            int remainder = y % 7;
            if (remainder == 0) {
                System.out.println("Draw!");
                score=score+1;
            } else if (remainder % 2 == 0) {
                System.out.println("You won this round!");
                score=score+3;
            } else {
                System.out.println("You lost this round!");
                score=score-3;
            }
        }


        System.out.println("Final score: " + score);

        if (score > 0) {
            System.out.println("Congratulations, you won the game!");
        } else {
            System.out.println("you lost the game.");
        }


    }
}