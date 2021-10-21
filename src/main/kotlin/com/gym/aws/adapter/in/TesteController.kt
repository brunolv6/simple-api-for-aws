package com.gym.aws.adapter.`in`

import com.gym.aws.adapter.`in`.dto.CorpoTeste
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TesteController {

    @GetMapping("/v1/teste")
    fun testando(@RequestBody corpo: CorpoTeste): String =
            corpo.toString()
}