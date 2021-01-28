package br.com.itau.demonewkotlin.acordo.presentation

import br.com.itau.demonewkotlin.acordo.application.cancelamento.AtualizaCancelamentoBaixaPlataforma
import br.com.itau.demonewkotlin.acordo.presentation.adapter.`in`.CancalamentoAcordoInputAdapter
import br.com.itau.demonewkotlin.acordo.presentation.resources.AcordoResource
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/acordos")
class AcordoController(private val atualizaCancelamentoBaixaPlataforma: AtualizaCancelamentoBaixaPlataforma) {

    fun cancelamento(@RequestBody acordoResource : AcordoResource) {
        val inputAdapter = CancalamentoAcordoInputAdapter(acordoResource.nome, acordoResource.cpfCnpj)
        atualizaCancelamentoBaixaPlataforma.execute(inputAdapter);
    }

}