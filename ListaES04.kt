//4. Programa que peça as 4 notas bimestrais e mostre a média.//
fun main(args: Array<String>) {
println("Digite sua primeira nota bimestral:")
val num1 = readLine()!!.toFloat()
val num2 = readLine()!!.toFloat()
println("Digite sua segunda nota bimestral:")
println("Digite sua terceira nota bimestral:")
val num3 = readLine()!!.toFloat()
println("Digite sua quarta nota bimestral:")
val num4 = readLine()!!.toFloat()
val media = (num1 + num2 + num3 + num4) / 4
println("A media de suas 4 notas bimestrais foi $media")
}