package com.khw.mbti

fun main() {
    val myMbti = "estj"
    var person = Mbti(myMbti)
    if (myMbti[1] == 'n' && myMbti[2] == 't') {
        person = Analysts(myMbti)
    }
    else if (myMbti[1] == 'n' && myMbti[2] == 'f') {
        person = Diplomats(myMbti)
    }
    else if (myMbti[1] == 's' && myMbti[3] == 'j') {
        person = Sentinels(myMbti)
    }
    else if (myMbti[1] == 's' && myMbti[3] == 'p') {
        person = Explorers(myMbti)
    }

    person.introduce()
}
open class Mbti(val myMbti: String) {
    open fun introduce(){
        println("제 mbti는 $myMbti 입니다.")
    }
}
class Analysts(myMbti: String) : Mbti(myMbti) {

    override fun introduce(){
        super.introduce()
        println("저는 Analysts 입니다.")
    }
}

class Diplomats(myMbti: String) : Mbti(myMbti) {

    override fun introduce(){
        super.introduce()
        println("저는 Diplomats 입니다.")
    }
}

class Sentinels(myMbti: String) : Mbti(myMbti) {

    override fun introduce(){
        super.introduce()
        println("저는 Sentinels 입니다.")
    }
}

class Explorers(myMbti: String) : Mbti(myMbti) {

    override fun introduce(){
        super.introduce()
        println("저는 Explorers 입니다.")
    }
}