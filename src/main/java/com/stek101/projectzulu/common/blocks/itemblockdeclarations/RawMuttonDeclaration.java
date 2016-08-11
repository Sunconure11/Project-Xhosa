package com.stek101.projectzulu.common.blocks.itemblockdeclarations;

import net.minecraft.item.Item;

import com.google.common.base.Optional;
import com.stek101.projectzulu.common.api.ItemList;
import com.stek101.projectzulu.common.blocks.ItemFoodProjectZulu;
import com.stek101.projectzulu.common.core.itemblockdeclaration.ItemDeclaration;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class RawMuttonDeclaration extends ItemDeclaration {

    public RawMuttonDeclaration() {
        super("MuttonRaw");
    }

    @Override
    protected boolean createItem() {
        ItemList.muttonRaw = Optional.of(new ItemFoodProjectZulu(3, 1.6f, true, name.toLowerCase()));
        return true;
    }

    @Override
    protected void registerItem() {
        Item item = ItemList.muttonRaw.get();
        GameRegistry.registerItem(item, name);
        OreDictionary.registerOre("listAllmeatraw", new ItemStack(item));
        OreDictionary.registerOre("listAllmuttonraw", new ItemStack(item));
    }
}
