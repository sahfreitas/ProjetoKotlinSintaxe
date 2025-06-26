//2. Programa que peça um número e então mostre a mensagem O número informado foi [número].//
fun main(args: Array<String>) {
println("Digite um número:")
val num = readLine()!!.toInt()
println("O número informado foi $num")
}