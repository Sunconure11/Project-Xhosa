package com.stek101.projectzulu.common.blocks.itemblockdeclarations;

import net.minecraft.item.Item;

import com.google.common.base.Optional;
import com.stek101.projectzulu.common.api.ItemList;
import com.stek101.projectzulu.common.blocks.ItemDuckEgg;
import com.stek101.projectzulu.common.core.itemblockdeclaration.ItemDeclaration;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class DuckEggDeclaration extends ItemDeclaration {

    public DuckEggDeclaration() {
        super("DuckEgg");
    }

    @Override
    protected boolean createItem() {
        ItemList.duckEgg = Optional.of(new ItemDuckEgg(false, name.toLowerCase()));
        return true;
    }

    @Override
    protected void registerItem() {
        Item item = ItemList.duckEgg.get();
        GameRegistry.registerItem(item, name);
        OreDictionary.registerOre("listAllegg", new ItemStack(item));
        OreDictionary.registerOre("objectEgg", new ItemStack(item));
        OreDictionary.registerOre("bakingEgg", new ItemStack(item));
        OreDictionary.registerOre("foodEgg", new ItemStack(item));
    }
}
