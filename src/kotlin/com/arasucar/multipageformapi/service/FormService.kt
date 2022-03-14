package com.arasucar.multipageformapi.service

import com.arasucar.multipageformapi.model.Form
import org.springframework.stereotype.Service

@Service
class FormService {

    var form: Form? = null;

    fun getFormObject(): Form? {
        return this.form;
    }

    fun saveForm(form: Form) {
        this.form = form
    }

}