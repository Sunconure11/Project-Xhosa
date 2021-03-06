package com.stek101.projectzulu.common.mobs.entity;

import java.util.EnumSet;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.stek101.projectzulu.common.api.BlockList;
import com.stek101.projectzulu.common.api.CustomEntityList;
import com.stek101.projectzulu.common.core.DefaultProps;
import com.stek101.projectzulu.common.mobs.EntityAFightorFlight;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIAttackOnCollide;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIHurtByTarget;
import com.stek101.projectzulu.common.mobs.entityai.EntityAINearestAttackableTarget;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIPanic;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIWander;

import cpw.mods.fml.common.Loader;

public class EntityBeaver extends EntityGenericAnimal implements IAnimals {
	private EntityAFightorFlight EAFF;
	private CustomEntityList entityEntry;
	private float aggroLevel;
	private double aggroRange;
	
    public EntityBeaver(World par1World) {
        super(par1World);
        setSize(0.63f, 0.8f);
        
        this.entityEntry = CustomEntityList.getByName(EntityList.getEntityString(this));
        
        /* Check if aggroLevel and aggroRange have valid values to activate AFoF */
    	  if (entityEntry != null && entityEntry.modData.get().entityProperties != null) {
            this.aggroLevel = entityEntry.modData.get().entityProperties.aggroLevel;
            this.aggroRange = entityEntry.modData.get().entityProperties.aggroRange;                    
        }
    	  
    	  if (Math.round(this.aggroRange) != 0) {
          EAFF = new EntityAFightorFlight().setEntity(this, worldObj, this.aggroLevel, this.aggroRange);
    	  }

        getNavigator().setAvoidsWater(false);
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, new EntityAIPanic(this, 1.25f));

        tasks.addTask(3, new EntityAIAttackOnCollide(this, 1.0f, false));
        // tasks.addTask(4, new EntityAIFollowOwner(this, moveSpeed, 10.0F, 2.0F));

        // tasks.addTask(5, new EntityAIMate(this, moveSpeed));
        // tasks.addTask(6, new EntityAITempt(this, moveSpeed, Items.spider_eye, false));
        // tasks.addTask(7, new EntityAIFollowParent(this, moveSpeed));
        tasks.addTask(9, new EntityAIWander(this, 1.0f, 120));

        targetTasks.addTask(3, new EntityAIHurtByTarget(this, false, false));
        targetTasks.addTask(4,
                new EntityAINearestAttackableTarget(this, EnumSet.of(EntityStates.attacking, EntityStates.looking),
                        EntityPlayer.class, 16.0F, 0, true));
        // targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityLiving.class, 16.0F, 0, false, true,
        // IMob.mobSelector));
    }

    @Override
    protected boolean isValidLocation(World world, int xCoord, int yCoord, int zCoord) {
        return super.isValidLocation(world, xCoord, yCoord, zCoord)
                && worldObj.canBlockSeeTheSky(xCoord, yCoord, zCoord);
    }

    @Override
    public void onLivingUpdate() {
    	super.onLivingUpdate();    	
    	if (Math.round(this.aggroRange) != 0) {
    		EAFF.updateEntityAFF(worldObj);
    	}    	
    }
    
    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    @Override
    public int getTotalArmorValue() {
        return 0;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound() {
        return DefaultProps.mobKey + ":" + DefaultProps.entitySounds + "beaverliving";
    }
    
    @Override
    public int getTalkInterval() {
        return 160;
    }

    @Override
    protected void dropRareDrop(int par1) {
        if (Loader.isModLoaded(DefaultProps.BlocksModId) && BlockList.mobHeads.isPresent()) {
            entityDropItem(new ItemStack(BlockList.mobHeads.get(), 1, 6), 1);
        }
        super.dropRareDrop(par1);
    }
}