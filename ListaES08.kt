//8. Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.//
fun main(args: Array<String>) {
println("Digite o quanto voce ganha por hora trabalhada:")
val valor = readLine()!!.toFloat()
println("Digite as horas trabalhadas:")
val horas = readLine()!!.toFloat()
val salario = horas * valor
println("No final do mes seu salario é: $salario")
}