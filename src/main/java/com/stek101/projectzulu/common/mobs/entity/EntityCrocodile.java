package com.stek101.projectzulu.common.mobs.entity;

import java.util.EnumSet;
import java.util.Random;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.stek101.projectzulu.common.api.BlockList;
import com.stek101.projectzulu.common.api.CustomEntityList;
import com.stek101.projectzulu.common.core.DefaultProps;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIAttackOnCollide;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIAvoidEntity;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIFollowParent;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIHurtByTarget;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIMate;
import com.stek101.projectzulu.common.mobs.entityai.EntityAINearestAttackableTarget;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIPanic;
import com.stek101.projectzulu.common.mobs.entityai.EntityAISmoothSwimming;
import com.stek101.projectzulu.common.mobs.entityai.EntityAITempt;
import com.stek101.projectzulu.common.mobs.entityai.EntityAIWander;

import cpw.mods.fml.common.Loader;

public class EntityCrocodile extends EntityGenericAnimal {
	
	private boolean inWater = false;
	private boolean isHurt = false;
	private float aggroLevel;
	private double aggroRange;
	private double tmp_aggroRange;
	private EntityAIAvoidEntity aiEntityAvoidEntity = new EntityAIAvoidEntity(this, EntityPlayer.class, 16.0f, 1.3D, 1.2D);

    public EntityCrocodile(World par1World) {
        super(par1World);
        setSize(1.7f, 0.9f);
        
        /*Get Aggression rank of entity and range*/
        CustomEntityList entityEntry = CustomEntityList.getByName(EntityList.getEntityString(this));
         if (entityEntry != null && entityEntry.modData.get().entityProperties != null) {
             aggroLevel = entityEntry.modData.get().entityProperties.aggroLevel;
             aggroRange = entityEntry.modData.get().entityProperties.aggroRange;
         }

        getNavigator().setAvoidsWater(false);
        tasks.addTask(0, new EntityAISmoothSwimming(this, true));
        tasks.addTask(1, new EntityAIPanic(this, 1.25f));

        tasks.addTask(3, new EntityAIAttackOnCollide(this, 1.0f, false));
        // tasks.addTask(4, new EntityAIFollowOwner(this, moveSpeed, 10.0F, 2.0F));

        tasks.addTask(5, new EntityAIMate(this, 1.0f));
        tasks.addTask(6, new EntityAITempt(this, 1.2f, Items.chicken, false));
        tasks.addTask(7, new EntityAIFollowParent(this, 1.1f));
        tasks.addTask(9, new EntityAIWander(this, 1.0f, 120));

        targetTasks.addTask(3, new EntityAIHurtByTarget(this, false, false));
        targetTasks.addTask(4,
                new EntityAINearestAttackableTarget(this, EnumSet.of(EntityStates.attacking, EntityStates.looking),
                        EntityPlayer.class, 16.0F, 0, true));
        targetTasks.addTask(5,
                new EntityAINearestAttackableTarget(this, EnumSet.of(EntityStates.attacking, EntityStates.looking),
                        EntityLiving.class, 16.0F, 0, false, true, IMob.mobSelector));
        // targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityLiving.class, 16.0F, 0, false, true,
        // IMob.mobSelector));
    }
    
    @Override
    protected boolean isValidLocation(World world, int xCoord, int yCoord, int zCoord) {
        return worldObj.canBlockSeeTheSky(xCoord, yCoord, zCoord);
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound() {
        return DefaultProps.mobKey + ":" + DefaultProps.entitySounds + "crocoodileliving";
    }
    
    @Override
    public int getTalkInterval() {
        return 120;
    }

    @Override
    public float getAIMoveSpeed() {
        float baseSpeed = super.getAIMoveSpeed();
        return isInWater() ? baseSpeed * 2.0f : baseSpeed;
    }

    @Override
    protected void updateAITick() {    
        super.updateAITick();
    }
    
    @Override
    public void onLivingUpdate() {
    	super.onLivingUpdate();
    	
   	 if  (Math.round(this.aggroRange) != 0) {  /** 0 deactivate FoF behaviour **/
   		    if (this.inWater){
   		    	tmp_aggroRange = aggroRange + 6D;
   		    }
   		    else {
   		    	tmp_aggroRange = aggroRange;
   		    }
   		    
   	        EntityPlayer entityplayer = worldObj.getClosestPlayerToEntity(this, tmp_aggroRange);
   	        
   	        /* Check if target can be detected, then entity will decide whether to fight or flee, ignore if tamed */
   	        //if (!(this instanceof EntityGenericTameable) && !((EntityGenericTameable)this).isTamed()){
   	        if (!((EntityGenericTameable)this).isTamed()){
   	          if(entityplayer != null && canEntityBeSeen(entityplayer)) {
   	          	
   	          	Random rand = new Random();         	
   	          	int dieRoll = rand.nextInt(100);    	
   	          	
   	             if ((aggroLevel) >= dieRoll){
   	          		if (this.getAngerLevel() == 0 && this.getFleeTick() == 0){
   	          		  this.tasks.removeTask(this.aiEntityAvoidEntity);
   	          	        if (this.isInWater()) {
   	          	        	this.angerLevel = 400 + this.rand.nextInt(400);
   	          	        	}  else { 
   	          	        	this.angerLevel = 400;  //make it angry!!!
   	          	        	}   	          		  
   	          		  }
   	          	} else {
   	          		if (this.getAngerLevel() == 0 && this.getFleeTick() == 0){ 
   	          		 this.tasks.addTask(1, this.aiEntityAvoidEntity );
   	          		 this.setFleeTick(400);   	          		 
   	          		 }
   	          	}
   	           } else {
   	         	 this.angerLevel = 0; // calm down and move on with life
   	         	 this.setFleeTick(0);
   	           }          
   	          }
   	        }
    }

    @Override
    protected int decreaseAirSupply(int par1) {
        return par1;
    }

    @Override
    public boolean isValidBreedingItem(ItemStack itemStack) {
        if (itemStack != null && itemStack.getItem() == Items.chicken) {
        	this.setAngerLevel(0);
        	this.setFleeTick(0);
            return true;
        } else {
            return super.isValidBreedingItem(itemStack);
        }
    }

    @Override
    protected void dropRareDrop(int par1) {
        if (Loader.isModLoaded(DefaultProps.BlocksModId) && BlockList.mobHeads.isPresent()) {
            entityDropItem(new ItemStack(BlockList.mobHeads.get(), 1, 1), 1);
        }
        super.dropRareDrop(par1);
    }
}