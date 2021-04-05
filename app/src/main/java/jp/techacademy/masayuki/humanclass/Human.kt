package jp.techacademy.masayuki.humanclass

import android.util.Log

open class Human: Animal, Thinkable {

    var hobby:String

    constructor(name: String,age:Int): super(name,age) {
        this.hobby = this.name
    }

    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest","「私は"+ this.hobby + this.age + "歳について考える。」")
    }
}