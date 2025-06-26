//5. Programa que converta metros para centímetros.//
fun main(args: Array<String>) {
println("Digite o valor em metros para converter em centimetros:")
val m = readLine()!!.toFloat()
val cm = m * 100
println("O valor convertido é: $cm")
}