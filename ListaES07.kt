//7. Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.//
fun main(args: Array<String>) {
println("Digite o lado do quadrado:")
val lado = readLine()!!.toFloat()
val area = lado * lado
println("A area é: $area")
val area2 = area * 2
println("O dobro da area é: $area2")
}
