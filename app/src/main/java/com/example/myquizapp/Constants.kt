package com.example.myquizapp

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWER : String = "correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val ques1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austrialia",
            1
        )
        val ques2 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austrialia",
            1
        )
        val ques3 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Australia",
            "Armenia",
            "Austrialia",
            1
        )
        val ques4 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Australia",
            "Armenia",
            "Austrialia",
            1
        )
        val ques5 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina",
            "Australia",
            "Armenia",
            "Austrialia",
            1
        )
        val ques6 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "Australia",
            "Armenia",
            "Austrialia",
            1
        )

        questionList.add(ques1)
        questionList.add(ques2)
        questionList.add(ques3)
        questionList.add(ques4)
        questionList.add(ques5)
        questionList.add(ques6)

        return questionList
    }
}