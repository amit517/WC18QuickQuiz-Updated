package com.example.amitkundu.wc18quickquiz;

public class Questions {
    public String mQuestions[] = {
      "Who is the best player in the earth?",
      "Who Score most of the goals in the WC18?"
    };

    private String mChoice[][] =
            {
                    {"Messi","Ronaldo","Inista","Kavani"},
                    {"lol1","lol2","LOL3","L4"}
            };

    private String mCorrectAnswer[] = {
      "Messi","lol2"
    };

    public String getQuestion(int a)
    {
      String question = mQuestions[a];
      return question;
    }

    public String getChoice1(int a)
    {
        String choice = mChoice[a][0];
        return choice;
    }
    public String getChoice2(int a)
    {
        String choice = mChoice[a][1];
        return choice;
    }
    public String getChoice3(int a)
    {
        String choice = mChoice[a][2];
        return choice;
    }
    public String getChoice4(int a)
    {
        String choice = mChoice[a][3];
        return choice;
    }

    public String getCorrecANS(int a)
    {
      String answer = mCorrectAnswer[a];
      return answer;
    };


}

