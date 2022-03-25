
compra = float(input ("digite o valor de compra de supermecado R$: "))
nota50 = float(input ("digitar quantidade nota 50 reais: "))
nota20 = float(input ("digitar quantidade nota 20 reais: "))
nota10 = float(input ("digitar quantidade nota 10 reais: "))
nota5 = float(input ("digitar quantidade nota 5 reais: "))
valoRecebido = ((nota50*50) + (nota20*20) + (nota10*10) + (nota5*5))
troco = (valoRecebido - compra)
print(f" Prezado cliente sua compra foi de R${compra}, voce entregou R${valoRecebido} e seu troco R$ {troco:.2f}, Obrigado pela preferencia")

# o IMC e claculado como IMC = peso / altuura
#vamos usar float para converter para decimal
#
peso = float(input(" Digite seu peso: "))
altura = float(input("Digite sua altura: "))
imc = peso/ altura**2

print(f"O seu IMC é: {imc:.2f}")