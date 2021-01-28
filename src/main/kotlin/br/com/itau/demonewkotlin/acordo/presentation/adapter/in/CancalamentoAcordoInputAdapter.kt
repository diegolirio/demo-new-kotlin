package br.com.itau.demonewkotlin.acordo.presentation.adapter.`in`

import br.com.itau.demonewkotlin.acordo.application.cancelamento.`in`.CancelamentoAcordoInputPort

class CancalamentoAcordoInputAdapter(nome: String, cpfCnpj: String) : CancelamentoAcordoInputPort {

    override fun getCpfCnpj(): String {
        return ""
    }

    override fun getNome(): String {
        return ""
    }

}