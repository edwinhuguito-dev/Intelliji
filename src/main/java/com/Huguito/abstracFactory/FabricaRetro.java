package com.Huguito.abstracFactory;

public class FabricaRetro implements Fabrica{
    @Override
    public Silla crearSilla() {
        return new SillaRetro();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaRetro();
    }
}
