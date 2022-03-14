package com.arasucar.multipageformapi.controller

import com.arasucar.multipageformapi.model.Form
import com.arasucar.multipageformapi.service.FormService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
class FormController(val formService: FormService) {

    @GetMapping(value = ["/form"], produces = [MediaType.APPLICATION_JSON_VALUE])
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getFormFromMemory(): Form? = formService.getFormObject()

    @PostMapping(value = ["/form"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun saveForm(@RequestBody form: Form) = formService.saveForm(form)

}