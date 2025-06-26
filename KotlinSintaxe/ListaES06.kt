//6. Programa que peça o raio de um círculo, calcule e mostre sua área.//
fun main(args: Array<String>) {
println("Digite o raio do circulo:")
val raio = readLine()!!.toFloat()
val area = 3.14 * (raio * raio)
println("O valor convertido é: $area")
}