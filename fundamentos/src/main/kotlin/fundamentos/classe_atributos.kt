package fundamentos

class Carro(var cor: String,val anoFabricacao: Int, val dono: Dono){

}

class Dono(var nome: String, var idade: Int){

}

fun main (){
    var carro = Carro("prata", 2019, Dono("Pedro", 24))

    println(carro.cor)
    carro.cor = "preto"

    println(carro.cor)

    println(carro.dono.nome)
    carro.dono.nome = "João"

    println(carro.dono.nome)
}