package br.com.itau.demonewkotlin.acordo.application.cancelamento

import br.com.itau.demonewkotlin.acordo.application.cancelamento.`in`.CancelamentoAcordoInputPort

interface AtualizaCancelamentoBaixaPlataforma {

    fun execute(inputAdapter: CancelamentoAcordoInputPort)

}
