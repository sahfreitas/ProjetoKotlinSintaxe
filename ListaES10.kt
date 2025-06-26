//10. Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.//
fun main(args: Array<String>) {
println("Digite a temperatura em graus Celcius:")
val c = readLine()!!.toDouble()
println("Digite as horas trabalhadas:")
val f = c * 1.8 + 32
println("A temperatura em Fahrenheit é: $f")
}
