# o IMC e claculado como IMC = peso / altuura
#vamos usar float para converter para decimal
#
peso = float(input(" Digite seu peso: "))
altura = float(input("Digite sua altura: "))
imc = peso/ altura**2

print(f"O seu IMC é: {imc:.2f}")