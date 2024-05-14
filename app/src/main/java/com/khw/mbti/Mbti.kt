package com.khw.mbti

fun main() {
    val hyeonwoo = MatchRoles("estj", "hyeonwoo")
    hyeonwoo.introduce()


    val jaeguk = MatchRoles("cute", "guukk")
    jaeguk.introduce()
}
fun MatchRoles(myMbti: String, name: String) : Mbti{
    var person = Mbti(myMbti,name)
    if (myMbti[1] == 'n' && myMbti[2] == 't') {
        person = Analysts(myMbti,name)
    }
    else if (myMbti[1] == 'n' && myMbti[2] == 'f') {
        person = Diplomats(myMbti,name)
    }
    else if (myMbti[1] == 's' && myMbti[3] == 'j') {
        person = Sentinels(myMbti,name)
    }
    else if (myMbti[1] == 's' && myMbti[3] == 'p') {
        person = Explorers(myMbti, name)
    }
    return person
}
open class Mbti(val myMbti: String, val name: String) {
    open fun introduce(){
        println("내 이름 $name mbti는 $myMbti 입니다.")
    }
}
class Analysts(myMbti: String, name: String) : Mbti(myMbti, name) {

    override fun introduce(){
        super.introduce()
        println("저는 Analysts 입니다.")
    }
}

class Diplomats(myMbti: String, name: String) : Mbti(myMbti, name) {

    override fun introduce(){
        super.introduce()
        println("저는 Diplomats 입니다.")
    }
}

class Sentinels(myMbti: String, name: String) : Mbti(myMbti, name) {

    override fun introduce(){
        super.introduce()
        println("저는 Sentinels 입니다.")
    }
}

class Explorers(myMbti: String, name: String) : Mbti(myMbti, name) {

    override fun introduce(){
        super.introduce()
        println("저는 Explorers 입니다.")
    }
}