package scapecraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityKK extends EntityScapecraft 
{
	private float moveSpeed;

	

	public EntityKK(World par1World)
	{
		super(par1World);

		this.moveSpeed = 0.7F;


		this.setSize(this.width * 3.5F, this.height * 3.0F);
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackDragon.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackDragon.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos1.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos1.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos2.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos2.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKos3.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKos3.class, this.moveSpeed, false));

		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTD.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTD.class, this.moveSpeed, false));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWolf.class, this.moveSpeed, false));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityOcelot.class, this.moveSpeed, false));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHellhound.class, this.moveSpeed, false));

		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWhiteKnight.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWhiteKnight.class, this.moveSpeed, false));

		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHeroKnight.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityHeroKnight.class, this.moveSpeed, false));

		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityEliteBlackKnight.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityEliteBlackKnight.class, this.moveSpeed, false));

		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGuard.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGuard.class, this.moveSpeed, false));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));


		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWither.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWither.class, this.moveSpeed, false));


		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKing.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKing.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKingsGuard.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityKingsGuard.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBlackKnight.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBlackKnight.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTheif.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTheif.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityCreeper.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySkeleton.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityZombie.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySpider.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWizard.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWizard.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGoblin.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityGoblin.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityScorpion.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityScorpion.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFarmer.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityFarmer.class, this.moveSpeed, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBarbarian.class, 0, true));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityBarbarian.class, this.moveSpeed, false));


	}



	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10000.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);   
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.50D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.5D);
	}
	public int getTotalArmorValue()
	{
		return 12;
	}

	public String getEntityName()
	{
		return "Kalphite King";
	}

	public boolean isAIEnabled()
	{
		return true;
	}


	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte)0));
	}

	public void onUpdate()
	{
		super.onUpdate();

		if (!this.worldObj.isRemote)
		{
			this.setBesideClimbableBlock(this.isCollidedHorizontally);
		}
	}




	public boolean isBesideClimbableBlock()
	{
		return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
	}

	/**
	 * Updates the WatchableObject (Byte) created in entityInit(), setting it to 0x01 if par1 is true or 0x00 if it is
	 * false.
	 */
	public boolean isOnLadder()
	{
		return this.isBesideClimbableBlock();
	}

	public void setBesideClimbableBlock(boolean par1)
	{
		byte var2 = this.dataWatcher.getWatchableObjectByte(16);

		if (par1)
		{
			var2 = (byte)(var2 | 1);
		}
		else
		{
			var2 &= -2;
		}

		this.dataWatcher.updateObject(16, Byte.valueOf(var2));
	}

	protected Entity findPlayerToAttack()
	{
		float var1 = this.getBrightness(1.0F);

		if (var1 < 100F)
		{
			double var2 = 16.0D;
			return this.worldObj.getClosestVulnerablePlayerToEntity(this, var2);
		}
		else
		{
			return null;
		}
	}








	protected String getLivingSound()
	{
		return "mob.spider.say";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.spider.say";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.spider.death";
	}


	protected float getSoundVolume()
	{
		return 0.4F;
	}





	@Override
	protected boolean canDespawn()
	{
		return true;
	}



	protected EntityKKspawn createInstance()
	{
		return new EntityKKspawn(this.worldObj);
	}


	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
	{
		Entity entity;
		entity = par1DamageSource.getSourceOfDamage();
		if (entity instanceof EntityArrow)
		{
			return false;
		}


		if(!worldObj.isRemote && rand.nextFloat() * par2 > 5)
		{ 
			float f = -0.125f;
			float f1 = -0.125f;
			EntityKKspawn entityKKspawn = this.createInstance();

			entityKKspawn.setLocationAndAngles(this.posX + (double)f, this.posY + 0.5D, this.posZ + (double)f1, this.rand.nextFloat() * 360.0F, 0.0F);
			this.worldObj.spawnEntityInWorld(entityKKspawn);    
		}

		return super.attackEntityFrom(par1DamageSource, par2);
	}

	public void onLivingUpdate()
	{
		if(ticksExisted > 1200 * 20) setDead(); 
		super.onLivingUpdate();
	}



	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
	}


	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);

	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	public int getXpValue()
	{
		return 5292;
	}
}
