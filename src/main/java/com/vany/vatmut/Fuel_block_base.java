package com.vany.vatmut;

import net.minecraft.block.Block;

//Класс в котором можно изменять свойства создоваемого блока
public class Fuel_block_base extends Block {
    private int BurningTime;
    public Fuel_block_base(Properties properties, int BurningTime) {
        super(properties);
        this.setBurningTime(BurningTime);
    }

    public int getBurningTime() {
        return BurningTime;
    }

    public void setBurningTime(int burningTime) {
        BurningTime = burningTime;
    }
}
