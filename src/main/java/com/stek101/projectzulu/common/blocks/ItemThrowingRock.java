package com.stek101.projectzulu.common.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.stek101.projectzulu.common.ProjectZulu_Core;
import com.stek101.projectzulu.common.core.DefaultProps;
import com.stek101.projectzulu.common.mobs.entity.EntityThrowingRock;

public class ItemThrowingRock extends Item{
	
	    public ItemThrowingRock(boolean full3D, String name) {
	    	 super();
	    	 this.maxStackSize = 24;
		     this.setCreativeTab(ProjectZulu_Core.projectZuluCreativeTab);
 	         setMaxDamage(5);
 	         bFull3D = full3D;
		     setHasSubtypes(true);
		     setUnlocalizedName(name);
		     setTextureName(DefaultProps.blockKey + ":" + name);
		}

		/**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    @Override
	    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
	    {
	        if (!p_77659_3_.capabilities.isCreativeMode)
	        {
	            --p_77659_1_.stackSize;
	        }

	        p_77659_2_.playSoundAtEntity(p_77659_3_, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	        if (!p_77659_2_.isRemote)
	        {
	        	float var7 = (float)8.99F / 20.0F;
	            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

	            if (var7 > 1.0F)
	            {
	                var7 = 1.0F;
	            }
	           p_77659_2_.spawnEntityInWorld(new EntityThrowingRock(p_77659_2_, p_77659_3_));
	        	//p_77659_2_.spawnEntityInWorld(new EntityThrowingRock(p_77659_2_, p_77659_3_, var7 * 2.0F));
	        }

	        return p_77659_1_;
	    }

}
