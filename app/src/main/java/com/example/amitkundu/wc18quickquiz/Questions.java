package com.example.amitkundu.wc18quickquiz;

public class Questions {
    public String mQuestions[] = {
            "Which country was the host nation of the FIFA World Cup 2018?",
            "Which two countries played the first match of the tournament?",
            "Who scored the first goal of the tournament?",
            "In which stadium was the first match played?",
            "Which country won the first match?",
            "Who scored the first hat-trick of the tournament?",
            "Which country confirmed a spot in the Round of 16 first?",
            "Which country was eliminated from the tournament first?",
            "Against which country was the champion of the 2014 World Cup defeated and eliminated from the Group Stage?",
            "From which stage were Brazil and Argentina eliminated?",
            "Which teams earned all the 9 points in the Group Stage?",
            "By which country was Portugal eliminated from this World Cup?",
            "How many matches were played in this tournament in total?",
            "Which one was the theme song of this World Cup?",
            "When was the tournament started?",
            "How many teams participated in this year's World Cup?",
            "How many stadiums were used for playing all the matches of the tournament?",
            "How many goals were scored in total in this tournament?",
            "Who won the Golden Boot award?",
            "Who won the Golden Ball award?",
            "Who won the Best Young Player award?",
            "Who won the Golden Glove award?",
            "Which team won the Fair Play award?",
            "How many confederations' teams played in this world cup?",
            "Which country didn't have to play the Qualifying Round to qualify into the Finals?",
            "Which team gained the third place?",
            "Which team was the fourth?",
            "How many teams were from the UEFA confederation?",
            "A new system was applied in this World Cup. What was that?",
            "Which stadium does have the highest capacity among those 12 stadiums used for playing the matches?",
            "Where was the team base of team Russia?",
            "Which of the options below was the estimated cost of this World Cup?",
            "How many volunteers were appointed for this World Cup?",
            "What is the full meaning of VAR?",
            "When was the opening ceremony held?",
            "Which group was Russia in?",
            "Against which country did Germany lose their first match?",
            "Against which country did Argentina play their first match?",
            "What was the result of the first match of Brazil?",
            "Which two countries played the Final match?",
            "Who won the Final match?",
            "How many World Cup trophies did France win?",
            "What was the scoreline of the Final match between France and Croatia?",
            "Who scored the first goal of the Final match?",
            "Who was the first player ever to score an own goal in a World Cup Final match?",
            "Who scored the last goal of the Final match?",
            "In which process did Antoine Griezmann score a goal in the Final match?",
            "How many own goals were scored in this tournament?",
            "How many goals did Harry Kane score in this tournament?",
            "What was the name of the Mascot of this World Cup?",
    };

    private String mChoice[][] =
            {
                    {"Russia","Brazil","Qatar","USA"},
                    {"Uruguay & Egypt","Egypt & Saudi Arabia","Russia & Saudi Arabia"," Russia & Uruguay"},
                    {"Denis Cheryshev","Yury Gazinsky","Luis Suarez","Mohammed Salah"},
                    {"Krestovsky Stadium","Fisht Olympic Stadium","Cosmos Arena","Luzhniki Stadium"},
                    {"Uruguay","Russia","Egypt","Saudi Arabia"},
                    {"Harry Kane","Lionel Messi","Cristiano Ronaldo","Romelu Lukaku"},
                    {"Uruguay","Egypt","Russia","Saudi Arabia"},
                    {"Egypt","Uruguay","Russia","Saudi Arabia"},
                    {"Mexico","Sweeden","South Korea","North Korea"},
                    {"Group Stage","Round of 16 & Quarter Final","Semi Final & Round of 16","Quarter Final & Round of 16"},
                    {"Uruguay, Croatia, Belgium","France, Uruguay, Croatia","Croatia, France, Belgium","Belgium, Uruguay, France"},
                    {"France","Uruguay","Belgium","England"},
                    {"32","48","64","16"},
                    {"Waka Waka","Wavin' Flag","We Are One","Live It Up"},
                    {"13th June","14th July","14th June","15th June"},
                    {"32","16","48","28"},
                    {"10","11","12","13"},
                    {"177","170","169","166"},
                    {"Kylian Mbappe","Romelu Lukaku","Luka Modric","Harry Kane"},
                    {"Antoine Griezmann","Luka Modric","Kylian Mbappe","Harry Kane"},
                    {"Paul Pogba","Kylian Mbappe","Eden Hazard","Antoine Griezmann"},
                    {"Thibaut Courtois","Hugo Lloris","Jordan Pickford","Danijel Subasic"},
                    {"Croatia","France","Spain","Japan"},
                    {"4","5","6","7"},
                    {"Germany","Spain","France","Russia"},
                    {"England","Belgium","Denmark","Brazil"},
                    {"Denmark","Belgium","Argentina","England"},
                    {"13","14","15","16"},
                    {"Goal Line Technology","Review System","VAP","VAR"},
                    {"Fisht Olympic Stadium","Ekaterinburg Arena","Cosmos Arena","Luzhniki Stadium"},
                    {"Bronnitsy, Moscow Oblast","Vatutinki, Moscow","Khimki, Moscow Oblast","Togliatti, Samara Oblast"},
                    {"$10 billion","$20 billion","$14.2 billion","$35.1 billion"},
                    {"177,000","45,000","120,000","35,000"},
                    {"Visual Assistant Referee","Video Assistant Reference","Video Assistant Referee","Visual Assistant Reference"},
                    {"13th June","13th July","14th July","14th June"},
                    {"A","C","B","D"},
                    {"South Korea","North Korea","Mexico","Sweeden"},
                    {"Croatia","Nigeria","Iceland","France"},
                    {"Brazil won","Switzerland won","Draw","Match abandoned"},
                    {"France & Croatia","Belgium & England","France & Belgium","Croatia & England"},
                    {"France","Croatia","Belgium","England"},
                    {"1","2","3","4"},
                    {"2-4","4-2","4-3","3-4"},
                    {"Antoine Griezmann","Mario Mandzukic","Kylian Mbappe","Ivan Perisic"},
                    {"Mario Balotelli","Marcelo","Mario Mandzukic","Ivan Perisic"},
                    {"Kylian Mbappe","Paul Pogba","Antoine Griezmann","Mario Mandzukic"},
                    {"Free Kick","Penalty Kick","Corner Kick","Header"},
                    {"8","9","11","12"},
                    {"4","5","6","8"},
                    {"Footix","Zakumi","Fuleco","Zabivaka"}
            };

    private String mCorrectAnswer[] = {
            "Russia",
            "Russia & Saudi Arabia",
            "Yury Gazinsky",
            "Luzhniki Stadium",
            "Russia",
            "Cristiano Ronaldo",
            "Russia",
            "Saudi Arabia",
            "South Korea",
            "Quarter Final & Round of 16",
            "Uruguay, Croatia, Belgium",
            "Uruguay",
            "64",
            "Live It Up",
            "14th June",
            "32",
            "12",
            "169",
            "Harry Kane",
            "Luka Modric",
            "Kylian Mbappe",
            "Thibaut Courtois",
            "Spain",
            "5",
            "Russia",
            "Belgium",
            "England",
            "14",
            "VAR",
            "Luzhniki Stadium",
            "Khimki, Moscow Oblast",
            "$14.2 billion",
            "35,000",
            "Video Assistant Referee",
            "14th June",
            "A",
            "Mexico",
            "Iceland",
            "Draw",
            "France & Croatia",
            "France",
            "2",
            "4-2",
            "Mario Mandzukic",
            "Mario Mandzukic",
            "Mario Mandzukic",
            "Penalty Kick",
            "12",
            "6",
            "Zabivaka",
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

