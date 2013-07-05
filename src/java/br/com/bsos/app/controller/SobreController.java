/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.controller;

import br.com.bsos.app.annotation.Permission;
import br.com.bsos.app.modelo.util.TipoPerfil;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

/**
 *
 * @author BrunoLuiz
 */
@Permission({TipoPerfil.USUARIO, TipoPerfil.ADMINISTRADOR})
@Resource
public class SobreController {

    @Get("/sobre")
    public void sobre() {
    }
}
