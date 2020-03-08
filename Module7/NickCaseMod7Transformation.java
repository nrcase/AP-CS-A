import java.util.Random;
public class NickCaseMod7Transformation
{
    /*
     * Ethan-David Rayala
     * Date: 12/5/2019
     * AP Computer Science A
     * Chapel Hill High School
     * Keywords program
     * Description: This program identifies keywords from the user's input and transforms
     * them to give a response.
     * Difficulties: I had a hard time getting the program to create responses
     * that made sense. I fixed this by fixing the restOfStatement string in
     * each private class. Once I did this, it worked.
     * What I Learned: How to use find keyword and transform to make the chatbot
     * more interesting.
     */

    /**
     * A program to carry on conversations with a human user.
     * This version:
     *<ul><li>
     * 		Uses advanced search for keywords
     *</li><li>
     * 		Will transform statements as well as react to keywords
     *</li></ul>
     * This version uses an array to hold the default responses.
     * @author Laurie White
     * @version April 2012
     */
    public class EthanRayalaMod7Transformations
    {
        /**
         * Get a default greeting
         * @return a greeting
         */
        public String getGreeting()
        {
            return "Hello, let's talk.";
        }

        /**
         * Gives a response to a user statement
         *
         * @param statement
         *            the user statement
         * @return a response based on the rules given
         */
        public String getResponse(String statement)
        {
            String response = "";
            if (statement.length() == 0)
            {
                response = "Say something, please.";
            }

            else if (findKeyword(statement, "no") >= 0)
            {
                response = "Why so negative?";
            }
            else if (findKeyword(statement, "mother") >= 0
                    || findKeyword(statement, "father") >= 0
                    || findKeyword(statement, "sister") >= 0
                    || findKeyword(statement, "brother") >= 0)
            {
                response = "Tell me more about your family.";
            }

            // Responses which require transformations
            else if (findKeyword(statement, "I want to", 0) >= 0)
            {
                response = transformIWantToStatement(statement);
            }
            //  Part of student solution
            else if (findKeyword(statement, "I want", 0) >= 0)
            {
                response = transformIWantStatement(statement);
            }

            // I added the following code to create a response for questions regarding where
            else if (findKeyword(statement, "Where is", 0) >= 0)
            {
                response = transformWhereStatement(statement);
            }
            // added following code to create a response for questions about the sky
            else if (findKeyword(statement, "the sky", 0) >= 0)
            {
                response = transformSkyStatement(statement);
            }
            // added the following code to create a response for questions regarding how something is doing
            else if (findKeyword(statement, "How is", 0) >= 0)
            {
                response = transformHowIsStatement(statement);
            }
            else
            {

                // Look for a two word (you <something> me)
                // pattern
                int psn = findKeyword(statement, "you", 0);

                if (psn >= 0
                        && findKeyword(statement, "me", psn) >= 0)
                {
                    response = transformYouMeStatement(statement);
                }
                else
                {
                    //  Part of student solution
                    // Look for a two word (I <something> you)
                    // pattern
                    psn = findKeyword(statement, "i", 0);

                    if (psn >= 0
                            && findKeyword(statement, "you", psn) >= 0)
                    {
                        response = transformIYouStatement(statement);
                    }
                    else
                    {
                        response = getRandomResponse();
                    }
                }
            }
            return response;
        }

        /**
         * Take a statement with "I want to <something>." and transform it into
         * "What would it mean to <something>?"
         * @param statement the user statement, assumed to contain "I want to"
         * @return the transformed statement
         */
        private String transformIWantToStatement(String statement)
        {
            //  Remove the final period, if there is one
            statement = statement.trim();
            String lastChar = statement.substring(statement
                    .length() - 1);
            if (lastChar.equals("."))
            {
                statement = statement.substring(0, statement
                        .length() - 1);
            }
            int psn = findKeyword (statement, "I want to", 0);
            String restOfStatement = statement.substring(psn + 9).trim();
            return "What would it mean to " + restOfStatement + "?";
        }


        /**
         * Take a statement with "I want <something>." and transform it into
         * "Would you really be happy if you had <something>?"
         * @param statement the user statement, assumed to contain "I want"
         * @return the transformed statement
         */
        private String transformIWantStatement(String statement)
        {
            //  Remove the final period, if there is one
            statement = statement.trim();
            String lastChar = statement.substring(statement
                    .length() - 1);
            if (lastChar.equals("."))
            {
                statement = statement.substring(0, statement
                        .length() - 1);
            }
            int psn = findKeyword (statement, "I want", 0);
            String restOfStatement = statement.substring(psn + 6).trim();
            return "Would you really be happy if you had " + restOfStatement + "?";
        }

        /**
         * Take a statement with "you <something> me" and transform it into
         * "What makes you think that I <something> you?"
         * @param statement the user statement, assumed to contain "you" followed by "me"
         * @return the transformed statement
         */
        private String transformYouMeStatement(String statement)
        {
            //  Remove the final period, if there is one
            statement = statement.trim();
            String lastChar = statement.substring(statement
                    .length() - 1);
            if (lastChar.equals("."))
            {
                statement = statement.substring(0, statement
                        .length() - 1);
            }

            int psnOfYou = findKeyword (statement, "you", 0);
            int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);

            String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
            return "What makes you think that I " + restOfStatement + " you?";
        }

        /**
         * Take a statement with "I <something> you" and transform it into
         * "Why do you <something> me?"
         * @param statement the user statement, assumed to contain "I" followed by "you"
         * @return the transformed statement
         */
        private String transformIYouStatement(String statement)
        {
            //  Remove the final period, if there is one
            statement = statement.trim();
            String lastChar = statement.substring(statement
                    .length() - 1);
            if (lastChar.equals("."))
            {
                statement = statement.substring(0, statement
                        .length() - 1);
            }

            int psnOfI = findKeyword (statement, "I", 0);
            int psnOfYou = findKeyword (statement, "you", psnOfI);

            String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
            return "Why do you " + restOfStatement + " me?";
        }

        // added code to create response for where statement
        private String transformWhereStatement(String statement)
        {
            //  Remove the final period, if there is one
            statement = statement.trim();
            String lastChar = statement.substring(statement
                    .length() - 1);
            if (lastChar.equals("."))
            {
                statement = statement.substring(0, statement
                        .length() - 1);
            }
            int psn = findKeyword (statement, "Where", 0);
            String restOfStatement = statement.substring(psn + 9).trim();
            return "Is " + restOfStatement + " a real place in the world?";
        }

        // added following code to create response for sky statement
        private String transformSkyStatement(String statement)
        {
            //  Remove the final period, if there is one
            statement = statement.trim();
            String lastChar = statement.substring(statement
                    .length() - 1);
            if (lastChar.equals("."))
            {
                statement = statement.substring(0, statement
                        .length() - 1);
            }
            int psn = findKeyword (statement, "the sky", 0);
            String restOfStatement = statement.substring(psn + 8).trim();
            return "The sky is " + restOfStatement + " because of science!";
        }

        // added following code to create response for how statement
        private String transformHowIsStatement(String statement)
        {
            //  Remove the final period, if there is one
            statement = statement.trim();
            String lastChar = statement.substring(statement
                    .length() - 1);
            if (lastChar.equals("."))
            {
                statement = statement.substring(0, statement
                        .length() - 1);
            }
            int psn = findKeyword (statement, "the sky", 0);
            String restOfStatement = statement.substring(psn + 7).trim();
            return restOfStatement + " is doing quite well!";
        }

        /**
         * Search for one word in phrase.  The search is not case sensitive.
         * This method will check that the given goal is not a substring of a longer string
         * (so, for example, "I know" does not contain "no").
         * @param statement the string to search
         * @param goal the string to search for
         * @param startPos the character of the string to begin the search at
         * @return the index of the first occurrence of goal in statement or -1 if it's not found
         */
        private int findKeyword(String statement, String goal, int startPos)
        {
            String phrase = statement.trim();
            //  The only change to incorporate the startPos is in the line below
            int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

            //  Refinement--make sure the goal isn't part of a word
            while (psn >= 0)
            {
                //  Find the string of length 1 before and after the word
                String before = " ", after = " ";
                if (psn > 0)
                {
                    before = phrase.substring (psn - 1, psn).toLowerCase();
                }
                if (psn + goal.length() < phrase.length())
                {
                    after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
                }

                //  If before and after aren't letters, we've found the word
                if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                        && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
                {
                    return psn;
                }

                //  The last position didn't work, so let's find the next, if there is one.
                psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

            }

            return -1;
        }

        /**
         * Search for one word in phrase.  The search is not case sensitive.
         * This method will check that the given goal is not a substring of a longer string
         * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.
         * @param statement the string to search
         * @param goal the string to search for
         * @return the index of the first occurrence of goal in statement or -1 if it's not found
         */
        private int findKeyword(String statement, String goal)
        {
            return findKeyword (statement, goal, 0);
        }



        /**
         * Pick a default response to use if nothing else fits.
         * @return a non-committal string
         */
        private String getRandomResponse ()
        {
            Random r = new Random ();
            return randomResponses [r.nextInt(randomResponses.length)];
        }

        private String [] randomResponses = {"Interesting, tell me more",
                "Hmmm.",
                "Do you really think so?",
                "You don't say."
        };

    }
/**
 * Sample Output:
 *
 * Hello, let's talk.
 * Where is my house
 * Is my house a real place in the world?
 * yes
 * Hmmm.
 * Why is the sky red during sunset
 * The sky is red during sunset because of science!
 * How is your best friend
 * your best friend is doing quite well!
 */
}
