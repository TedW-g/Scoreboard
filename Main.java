public class Main
{
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");

        //test

        System.out.println(game.getScore());

        //test1

        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);

        //test2

        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);

        //test3

        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
    }
}
