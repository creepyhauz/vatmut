package com.vany.vatmut;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;


public class FuelBlockItem extends BlockItem {
    private int BurningTime;
    public FuelBlockItem(Block blockIn, Properties builder,int BurningTime)
    {
        super(blockIn, builder);
        this.BurningTime=BurningTime;
    }

    @Override
    public int getBurnTime(ItemStack stack) {
        return this.BurningTime;
    }
}
