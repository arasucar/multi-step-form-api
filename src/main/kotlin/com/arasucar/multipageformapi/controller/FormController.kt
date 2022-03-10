package com.arasucar.multipageformapi.controller

import com.arasucar.multipageformapi.model.Form
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
class FormController {

    var form: Form? = null;

    @GetMapping(value = ["/form"], produces = [MediaType.APPLICATION_JSON_VALUE])
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getFormFromMemory(): Form? {
        return form
    }

    @PostMapping(value = ["/form"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun saveForm(@RequestBody form: Form) {
        this.form = form
    }

}