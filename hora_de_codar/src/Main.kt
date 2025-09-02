fun main() {
 inicio()
}


var continuar = true



fun inicio(){

    while (continuar == true){

        println("=== HORA DE CODAR 1 ===")
        println("===                 ===")
        println("=== 1 - Ex 1        ===")
        println("=== 2 - Ex 2        ===")
        println("=== 3 - Ex 3        ===")
        println("=== 4 - Ex 4        ===")
        println("=== 5 - Sair        ===")

        println("Escolha qual exercicio resolver: ")
        val opcao = readln().toInt()

        when(opcao){

            1 -> ex1()
            2 -> ex2()
            3 -> ex3()
            4 -> ex4()
            5 -> sair()
            else -> ("Opoção invalida !!!!")

        }

    }

}


fun ex1(){

    println(" Escreva um programa que crie uma variável chamada \"nome_do_carro\" e atribua-a um valor \"Fusca\". Exiba-a ao usuário.")
    var nome_do_carro = "Fusca"

    println("O seu carro é um $nome_do_carro")
}

fun ex2(){
    println("Escreva um programa em que o usuário informe o seu nome e exiba a mensagem \"Olá, [NomeDoUsuario]\".")
    val nome_do_ususario : String

    println("Qual seu nome?")
    nome_do_ususario = readln()

    println("Olá, $nome_do_ususario")
}

fun ex3(){

    println("Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem \"Olá, [NomeDoUsuario], sua idade é [idade]\".")
    val nome_do_ususario : String
    val idade: Int

    println("Qual seu nome?")
    nome_do_ususario = readln()
    println("Qual sua idade?")
    idade = readln().toInt()

    println("Olá, $nome_do_ususario, sua idade é $idade")

}

fun ex4(){
    println("Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável.")

    var prossiga = true


    fun acabou(){
        prossiga = false
        println("Acabou!!!!")
    }



    fun retangulo() {
        println("Digite o valor da base: ")
        val base = readln().toDouble()

        println("Digite o valor da altura: ")
        val altura = readln().toDouble()

        val area = base * altura
        println("Área do retângulo: $area")
    }

    fun quadrado(){
        println("Digite o valor do lado: ")
        var lado = readln().toDouble()

        var area = lado * lado

        println("Area do quadrado: $area")
    }

    fun trapezio(){
        println("Digite o valor da diagonal maior: ")
        var base_maior = readLine()?.toInt() ?: 0
        println("Digite o valor da diagonal menor: ")
        var base_menor = readLine()?.toInt() ?: 0
        println("Digite o valor da altura: ")
        var altura = readLine()?.toInt() ?: 0


        var area = (base_maior + base_menor)*altura/2
        println("Area do trapezio: $area")
    }

    fun paralelogramo() {
        println("Digite o valor da base: ")
        val base = readLine()?.toInt() ?: 0 // se for nulo, usa 0

        println("Digite o valor da altura: ")
        val altura = readLine()?.toInt() ?: 0

        val area = base * altura
        println("Área do paralelogramo: $area")
    }

    fun triangulo(){

        println("Digite o valor da base: ")
        var base = readLine()?.toInt() ?: 0
        println("Digite o valor da altura: ")
        var altura = readLine()?.toInt() ?: 0

        var area = (base * altura)/2
        println("Area do losango: $area")
    }

    fun losango(){

        println("Digite o valor da diagonal maior: ")
        var diagonal_maior = readLine()?.toInt() ?: 0
        println("Digite o valor da diagonal menor: ")
        var diagonal_menor = readLine()?.toInt() ?: 0

        var area = (diagonal_menor * diagonal_maior)/2
        println("Area do losango: $area")
    }

    fun circulo(){

        println("Digite o valor do raio: ")
        var raio = readLine()?.toInt() ?: 0

        var area = (raio * raio) * 3.14

        println("Area do circulo: $area")


    }



while (prossiga == true){

    println("=== CALCULANDO AREA ===")
    println("=== 1 - Retangulo      ")
    println("=== 2 - Quadrado       ")
    println("=== 3 - Losango        ")
    println("=== 4 - Trapezio       ")
    println("=== 5 - Paralelogramo  ")
    println("=== 6 - Triangulo      ")
    println("=== 7 - Circulo        ")
    println("=== 8 - Sair           ")

    println("Qual area deseja calcular? ")
    var escolha = readln().toInt()

    when(escolha){

        1 -> retangulo()
        2 -> quadrado()
        3 -> losango()
        4 -> trapezio()
        5 -> paralelogramo()
        6 -> triangulo()
        7 -> circulo()
        8 -> acabou()
        else -> ("escolha uma opção valida")

        }

    }



}

fun sair(){
    continuar = false
    println("Encerrando o programa. Muito obrigado pelo acesso!")
}