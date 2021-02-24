package com.baitap;

public class TennisGame {

    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String ALL = "-All";
    public static final String DEUCE = "Deuce";

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String callScore = "";
        int Score = 0;
        if (m_score1==m_score2)
        {
            switch (m_score1)
            {
                case 0:
                    callScore = LOVE + ALL;
                    break;
                case 1:
                    callScore = FIFTEEN + ALL;
                    break;
                case 2:
                    callScore = THIRTY + ALL;
                    break;
                case 3:
                    callScore = FORTY + ALL;
                    break;
                default:
                    callScore = DEUCE;
                    break;
            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) callScore ="Advantage player1";
            else if (minusResult ==-1) callScore ="Advantage player2";
            else if (minusResult>=2) callScore = "Win for player1";
            else callScore ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) Score = m_score1;
                else {
                    callScore+="-";
                    Score = m_score2;
                }
                switch(Score)
                {
                    case 0:
                        callScore+= LOVE;
                        break;
                    case 1:
                        callScore+= FIFTEEN;
                        break;
                    case 2:
                        callScore+= THIRTY;
                        break;
                    case 3:
                        callScore+= FORTY;
                        break;
                }
            }
        }
        return callScore;
    }
}
