package com.Huguito.abstracFactory;

public class FabricaMod implements Fabrica{
    @Override
    public Silla crearSilla() {
        return new SillaMod();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaMod();
    }
}
