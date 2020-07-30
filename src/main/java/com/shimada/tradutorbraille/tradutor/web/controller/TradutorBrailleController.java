package com.shimada.tradutorbraille.tradutor.web.controller;

import com.shimada.tradutorbraille.tradutor.domain.business.TradutorService;
import com.shimada.tradutorbraille.tradutor.web.form.TradutorForm;
import com.shimada.tradutorbraille.tradutor.web.view.TradutorView;
import com.shimada.tradutorbraille.tradutor.web.view.TradutorViewDetailed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/tradutorBraille")
public class TradutorBrailleController {

    private final TradutorService tradutorService;

    @Autowired
    public TradutorBrailleController(TradutorService tradutorService) {
        this.tradutorService = tradutorService;
    }

    @PostMapping
    public TradutorView traduzirTexto(@Valid @RequestBody TradutorForm tradutorForm) {
        return TradutorView.toView(tradutorService.traduzirTexto(tradutorForm));
    }

    @PostMapping(value = "/detailed")
    public TradutorViewDetailed traduzirTextoDetailed(@Valid @RequestBody TradutorForm tradutorForm) {
        return TradutorViewDetailed.toView(tradutorService.traduzirTexto(tradutorForm));
    }
}
