import kotlin.system.exitProcess

fun main() {
    var a = Drawings("Hola")
    /*
    83.34
    66.68
    50.02
    33.36
    16.66
    0
     */
    fun bye(){
        exitProcess(1)
    }
    fun Drawings.first(){
        println("  _______")
        println(""" |      ( )""")
        println(""" |     """)
        println(""" |      """)
        println("---")
        this.life = 83.34F
    }
    fun Drawings.second(){
        println("  _______")
        println(""" |      ( )""")
        println(""" |       | """)
        println(""" |     """)
        println("---")
        this.life = 66.68F
    }
    fun Drawings.third(){
        println("  _______")
        println(""" |      ( )""")
        println(""" |     - | """)
        println(""" |      """)
        println("---")
        this.life = 50.02F
    }
    fun Drawings.fourth(){
        println("  _______")
        println(""" |      ( )""")
        println(""" |     - | -""")
        println(""" |        """)
        println("---")
        this.life = 33.36F
    }
    fun Drawings.fifth(){
        println("  _______")
        println(""" |      ( )""")
        println(""" |     - | -""")
        println(""" |        \""")
        println("---")
        this.life = 16.66F
    }
    fun Drawings.sixth(){
        println("  _______")
        println(""" |      ( )""")
        println(""" |     - | -""")
        println(""" |      / \""")
        println("---")
        this.life = 0F
        this.status = true
    }
    fun start(){
        println("...........................")
        println("Ingrese una palabra........")
        var word = readln().toString()
        var b = Drawings(word)
        var tries:Int = 1
        println("Inicio de partida..........")
        while (!b.getStatus()){
            var word2 = readln().toString()
            if(b.word != word2){
                var c = ""
                var ex = ""
                if(word2.length >= b.word.length){
                    for(e in 0..b.word.length - 1){
                            if(b.word[e] == word2[e]){
                                ex += "*"
                                c += b.word[e].toString()
                            }else{
                                ex += "*"
                                c += "*"
                            }
                        }

                }else {
                    println("Palabra muy corta, vuelva a intentar")
                }
                println(c)
                if(ex == c){
                    when(tries){
                        1 -> b.first()
                        2 -> b.second()
                        3 -> b.third()
                        4 -> b.fourth()
                        5 -> b.fifth()
                        6 -> b.sixth()
                    }
                    tries ++
                }
            }else{
                b.status = true
            }

        }
        println(
            if(b.life <= 0F)
            {
                "Ya se te murio"
            }else {
                "Sos el más capito"
            }
        )

    }
    fun read(){
        var option = readln().toInt()
        when(option){
            1 -> start()
            2 -> bye()
        }
    }
    fun menu(){
        println("...........................")
        println("Ahorcadito.................")
        println("1) Iniciar partida.........")
        println("2) Cerrar juego............")
        println("...........................")
        println("Ingrese una opción.........")
        read()
    }
    menu()
}

class Drawings(var word: String){
    var life: Float = 100.00F
    var status: Boolean = false

    @JvmName("getStatus1")
    fun getStatus(): Boolean {
        return this.status
    }

}