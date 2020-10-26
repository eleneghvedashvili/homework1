fun main(){
    var grafiki1 = point (X = 3F,Y = 8F)
    var grafiki2 = point (X = 10F, Y = 14F)
    println(grafiki1)
    println(grafiki2)
    println(grafiki1==grafiki2)
    grafiki1.movingX(2F)
    grafiki2.movingY(3F)
}

class point (private var X:Float, private var Y:Float){
    fun movingX(a:Float){
        var c = Y - a
        println("X ღერსძის მიმართ გადავა:$X,$c")
    }
    fun movingY(b:Float){
        var d = X - b
        println("Y ღერძის მიმართ გადავა:$d,$Y")
    }

    override fun toString(): String {
        return "($X,$Y)"
    }

    override fun equals(other: Any?): Boolean {
        if (other is point) {
            if (X==other.X && Y==other.Y){
                return true
            }
        }
        return false
    }
}