//3. Programa que peça dois números e imprima a soma.//
fun main(args: Array<String>) {
println("Digite um número:")
val num1 = readLine()!!.toInt()
println("Digite outro número:")
val num2 = readLine()!!.toInt()
val soma = num1 + num2
println("A soma dos dois numeros foi $soma")
}
