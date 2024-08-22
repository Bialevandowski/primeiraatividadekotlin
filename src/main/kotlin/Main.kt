//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.text.NumberFormat
import java.util.Locale

fun main() {
    // Variáveis imutáveis
    val idadeOriginal: Int = 18
    val alturaOriginal: Double = 1.70
    val nomeOriginal: String = "Bianca"
    val eEstudante: Boolean = true

    // Exibindo os valores originais
    println("Idade: $idadeOriginal anos")
    println("Altura: $alturaOriginal metros")
    println("Nome: $nomeOriginal")
    println("É estudante: $eEstudante")

    // Calculando a soma de duas idades
    val idade1 = 25
    val idade2 = 30
    val somaIdades = idade1 + idade2
    println("A soma das idades é: $somaIdades")

    // Multiplicando a altura por um fator
    val novaAltura: Double = 1.69
    val fator = 2
    val alturaMultiplicada = novaAltura * fator
    println("A altura multiplicada por $fator é: $alturaMultiplicada metros")

    // Criando uma saudação com o nome original
    val saudacao = "Olá, $nomeOriginal!"
    println(saudacao)

    // Declarando novas variáveis
    val nomeNova: String = "Joao" // Nome de uma pessoa
    val idadeNova: Int = 30 // Idade de uma pessoa
    val salarioBrutoMensal: Double = 5000.0 // Salário bruto mensal de uma pessoa
    val mesesTrabalhados: Int = 12 // Quantidade de meses trabalhados em um ano
    val quantidadeProdutos: Int = 15 // Quantidade de produtos comprados

    // Exibindo os valores das novas variáveis
    println("Nome: $nomeNova")
    println("Idade: $idadeNova anos")
    println("Salário bruto mensal: ${formatarMoeda(salarioBrutoMensal)}")
    println("Meses trabalhados em um ano: $mesesTrabalhados")
    println("Quantidade de produtos comprados: $quantidadeProdutos")

    // Calculando o salário anual bruto
    val salarioAnualBruto: Double = salarioBrutoMensal * mesesTrabalhados
    println("Salário anual bruto: ${formatarMoeda(salarioAnualBruto)}")

    // Definindo o valor fixo de desconto
    val desconto: Double = 2000.0 // Exemplo de valor fixo de desconto

    // Calculando o salário anual líquido
    val salarioAnualLiquido: Double = salarioAnualBruto - desconto
    println("Salário anual líquido: ${formatarMoeda(salarioAnualLiquido)}")

    // Criando uma mensagem personalizada
    val mensagem: String = "Olá, $nomeNova! Seu salário anual líquido é ${formatarMoeda(salarioAnualLiquido)}."
    println(mensagem)

    // Declarando variáveis para o produto
    val nomeProduto: String = "Notebook" // Nome do produto
    val precoUnitario: Double = 2500.0 // Preço unitário do produto
    val quantidadeComprada: Int = 3 // Quantidade de produtos comprados
    val taxaImposto: Double = 12.0 // Taxa de imposto sobre o produto (em porcentagem)
    val margemLucro: Double = 20.0 // Margem de lucro desejada (em porcentagem)

    // Calculando o valor total sem impostos
    val valorTotalSemImpostos: Double = precoUnitario * quantidadeComprada
    println("Valor total sem impostos: ${formatarMoeda(valorTotalSemImpostos)}")

    // Calculando o valor do imposto
    val valorImposto: Double = (valorTotalSemImpostos * taxaImposto) / 100
    println("Valor do imposto: ${formatarMoeda(valorImposto)}")

    // Calculando o valor total com impostos
    val valorTotalComImpostos: Double = valorTotalSemImpostos + valorImposto
    println("Valor total com impostos: ${formatarMoeda(valorTotalComImpostos)}")

    // Calculando o preço de venda necessário para alcançar a margem de lucro desejada
    val precoVendaNecessario: Double = valorTotalComImpostos * (1 + margemLucro / 100)
    // Arredondando o preço de venda para duas casas decimais
    val precoVendaArredondado: Double = "%.2f".format(precoVendaNecessario).toDouble()
    println("Preço de venda necessário para alcançar a margem de lucro desejada: ${formatarMoeda(precoVendaArredondado)}")

    // Criando uma mensagem final com as informações formatadas
    val mensagemFinal: String = "Produto: $nomeProduto\n" +
            "Valor total com impostos: ${formatarMoeda(valorTotalComImpostos)}\n" +
            "Preço de venda sugerido: ${formatarMoeda(precoVendaArredondado)}"
    println(mensagemFinal)
}

// Função para formatar valores como moeda
fun formatarMoeda(valor: Double): String {
    val formatoMoeda = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
    return formatoMoeda.format(valor)
}
