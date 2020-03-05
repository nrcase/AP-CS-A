public class BasketballGame
{
    private int team1Score; //Declaring instance variables
    private int team2Score;
    private int endScore;
    private String team1Name;
    private String team2Name;
    private String gameStatus;

    public BasketballGame() //Default constructor
    {
        team1Name = "";
        team1Score = 0;
        team2Name = "";
        team2Score = 0;
        gameStatus = "";
    }

    public void scoreShot() //Calculates shots and prints
    {
        do
        {
            gameStatus = "In progress";
            int randomPoints1 = (int) ((Math.random() * ((3 - 1) + 1)) + 1); //random number between 1 & 3
            int randomPoints2 = (int) ((Math.random() * ((3 - 1) + 1)) + 1); //random number between 1 & 3

            if (randomPoints1 == 1) //if statements that trigger methods to add to score depending on team and what that number is
            {
                onePointTeam1();
            }
            else if (randomPoints1 == 2)
            {
                twoPointTeam1();
            }
            else if (randomPoints1 == 3)
            {
                threePointTeam1();
            }

             if (randomPoints2 == 1)
            {
                onePointTeam2();
            }
            else if (randomPoints2 == 2)
            {
                twoPointTeam2();
            }
            else if (randomPoints2 == 3)
            {
                threePointTeam2();
            }

            System.out.println("Random # for " + team1Name + ": " + randomPoints1 + "\t Random # for " + team2Name + ": " + randomPoints2); // Printing out the info
            System.out.print(team1Name + " = " + getTeam1Score() + ", " + team2Name + " = " + getTeam2Score());
            System.out.println(" Current Winner is " + currentWinner() + "\n");

        } while (team2Score <= endScore && team1Score <= endScore); //Do all of this until both teams scores are greater than the end score
        gameStatus = "Finished";
    }

    private void onePointTeam1() //method to add 1 point to team 1
    {
       team1Score =  team1Score + 1;
    }

    private void onePointTeam2() //method to add 1 point to team 2
    {
        team2Score = team2Score + 1;
    }

    private void twoPointTeam1() //method to add 2 points to team 1
    {
        team1Score = team1Score + 2;
    }

    private void twoPointTeam2() //method to add 2 points to team 2
    {
        team2Score = team2Score + 2;
    }

    public void threePointTeam1() //method to add 3 points to team 1
    {
        team1Score = team1Score + 3;
    }

    private void threePointTeam2() //method to add 3 points to team 2
    {
        team2Score = team2Score + 3;
    }

    private void setGameStatus(String status) //method to set game status
    {
        gameStatus = status;
    }

    private String getGameStatus() //method to get game status
    {
        return gameStatus;
    }

    private int getTeam1Score()  //method to get team 1 score
    {
        return team1Score;
    }

    private int getTeam2Score() //method to get team 2 score
    {
        return team2Score;
    }

    private String currentWinner() //method to announce current winner
    {
        if (team1Score > team2Score)
        {
            return team1Name;
        }
        else if (team2Score > team1Score)
        {
            return team2Name;
        }
        else
            {
            return "none, they are tied";
        }
    }

    public void setTeam1Name(String team1Name) //method to set team 1 name
    {
        this.team1Name = team1Name;
    }

    public void setTeam2Name(String team2Name) //method to set team 2 name
    {
        this.team2Name = team2Name;
    }

    public void getMaxScore(int maxScore) //method to put the max score from tester class into the game
    {
        endScore = maxScore;
    }
}
