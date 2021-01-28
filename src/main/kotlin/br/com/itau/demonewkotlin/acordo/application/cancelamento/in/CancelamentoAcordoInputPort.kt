package br.com.itau.demonewkotlin.acordo.application.cancelamento.`in`

interface CancelamentoAcordoInputPort {

    fun getCpfCnpj(): String

    fun getNome(): String
}