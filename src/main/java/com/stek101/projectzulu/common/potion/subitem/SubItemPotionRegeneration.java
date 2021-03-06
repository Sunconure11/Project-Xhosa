package com.stek101.projectzulu.common.potion.subitem;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

import com.google.common.base.Optional;
import com.stek101.projectzulu.common.api.ItemList;
import com.stek101.projectzulu.common.api.SubItemPotionList;
import com.stek101.projectzulu.common.core.ItemGenerics.Properties;
import com.stek101.projectzulu.common.potion.PotionParser;

public class SubItemPotionRegeneration extends SubItemPotionHalfPower {

    public SubItemPotionRegeneration(Item itemID, int subID) {
        super(itemID, subID, "Regeneration");
        setSubItemBounds(4, 4, 4, 0);
        setEffectScale(20 * 10, 15, 6, 10, 1);
    }

    @Override
    Optional<? extends Potion> getPotion() {
        return Optional.of(Potion.regeneration);
    }

    @Override
    protected TYPE getIngredientType(ItemStack ingredient, ItemStack brewingStack) {
        if (ItemList.genericCraftingItems.isPresent()
                && ingredient.getItem() == ItemList.genericCraftingItems.get()
                && ingredient.getItemDamage() == Properties.LargeUnhealthyHeart.meta) {
            return TYPE.CHEMICAL;
        } else if (ingredient.getItem() == Items.fermented_spider_eye) {
            return TYPE.CHEMICAL;
        } else {
            return super.getIngredientType(ingredient, brewingStack);
        }
    }

    @Override
    protected ItemStack getChemicalPotionResult(ItemStack ingredient, ItemStack brewingStack) {
        if (SubItemPotionList.WEAKNESS.isPresent()) {
            SubItemPotion subItemPotion = SubItemPotionList.WEAKNESS.get();
            return new ItemStack(subItemPotion.item, 1, PotionParser.setID(subItemPotion.subID,
                    brewingStack.getItemDamage()));
        }
        return null;
    }
}