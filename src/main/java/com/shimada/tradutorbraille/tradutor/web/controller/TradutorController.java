package com.shimada.tradutorbraille.tradutor.web.controller;

import com.shimada.tradutorbraille.tradutor.domain.business.TradutorService;
import com.shimada.tradutorbraille.tradutor.web.form.TradutorForm;
import com.shimada.tradutorbraille.tradutor.web.view.TradutorView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/tradutorBraille")
public class TradutorController {

    private final TradutorService tradutorService;

    @Autowired
    public TradutorController(TradutorService tradutorService) {
        this.tradutorService = tradutorService;
    }

    @PostMapping
    public TradutorView traduzirTexto(@Valid @RequestBody TradutorForm tradutorForm) {
        return TradutorView.toView(tradutorService.traduzirTexto(tradutorForm));
    }

}
