package br.com.itau.demonewkotlin.acordo.application.cancelamento

import br.com.itau.demonewkotlin.acordo.application.cancelamento.`in`.CancelamentoAcordoInputPort
import org.springframework.stereotype.Service

@Service
class AtualizaCancelamentoBaixaPlataformaImpl : AtualizaCancelamentoBaixaPlataforma {

    override fun execute(inputAdapter: CancelamentoAcordoInputPort) {
        // ...
    }
}