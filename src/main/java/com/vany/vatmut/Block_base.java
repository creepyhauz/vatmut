package com.vany.vatmut;

import net.minecraft.block.Block;

//Класс в котором можно изменять свойства создоваемого блока
public class Block_base extends Block {
    public int BurningTime;
    public Block_base(Properties properties,int BurningTime) {
        super(properties);
        this.BurningTime=BurningTime;
    }
}
