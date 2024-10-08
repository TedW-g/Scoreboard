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

        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        System.out.println(info);

        //test3

        game.recordPlay(3);
        info = game.getScore();
        System.out.println(info);

        //test4asdfsad

        game.recordPlay(1);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //test5

        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);

        //test6

        Scoreboard match = new Scoreboard("Lions", "Tigers");
        info = match.getScore();
        System.out.println(info);

        //test7

        info = game.getScore();
        System.out.print(info);

    }
}
