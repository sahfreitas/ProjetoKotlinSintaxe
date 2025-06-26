//9. Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.//
fun main(args: Array<String>) {
println("Digite a temperatura em graus Fahrenheit:")
val f = readLine()!!.toDouble()
println("Digite as horas trabalhadas:")
val c = 5 * ((f-32) / 9)
println("A temperatura em celcius é: $c")
}