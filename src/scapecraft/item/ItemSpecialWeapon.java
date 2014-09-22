package scapecraft.item;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import scapecraft.ExtendedPlayer;

public class ItemSpecialWeapon extends ItemWeapon
{
	int specialCost;
	Random rand = new Random();

	public ItemSpecialWeapon(ScapecraftToolMaterial toolMaterial, float baseDamage, String name, int specialCost)
	{
		super(toolMaterial, baseDamage, name);
		this.specialCost = specialCost;
	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{


		if (ExtendedPlayer.getEnergy(player) >  specialCost)
		{
			itemStack.getTagCompound().setBoolean("special", true);
			ExtendedPlayer.addEnergy(player, -specialCost);		
			if (world.isRemote)
				player.addChatMessage(new ChatComponentText("\u00a7ESpecial Activated"));
		}

		return itemStack;
	}
	public void onEntityHurt(LivingHurtEvent event)
	{
		if(event.source.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.source.getEntity();
			ItemStack itemStack = player.getHeldItem();
			if(itemStack.getTagCompound() != null && itemStack.getTagCompound().getBoolean("special"))
			{
				String chatMessage = "\u00a7ECriticalHit";
				player.getHeldItem().getTagCompound().setBoolean("special", false);
				switch(this.toolMaterial)
				{
					case AGS:
						event.ammount *= 2;
						player.motionY = 1.3D;
						for(int x = -2; x <= 1; x++)
							for(int y = -1; y <= 3; y++)
								for(int z = -2; z <= 1; z++)
									if(rand.nextFloat() > .6F)
										player.worldObj.spawnParticle("magicCrit", player.posX + x, player.posY + y, player.posZ + z, 0D, 0D, 1D);
						break;
					case BGS:
						event.entityLiving.motionY = 1.25D;
						event.ammount += 5F;
						event.entityLiving.addPotionEffect(new PotionEffect(Potion.weakness.id, 200, 0));
						//TODO some sort of potion effect that decreases armor?
						break;

					case SGS:
						event.ammount += 5F;
						player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 100, 6)); //TODO this seems way too high
						player.addPotionEffect(new PotionEffect(Potion.resistance.id, 100, 7)); 
						break;

					case ZGS:
						event.ammount += 8F;
						event.entityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 5));
						break;
					case WHIP:
						event.ammount += 8F;
						break;
					default:
				}
				if (player.worldObj.isRemote)
					player.addChatMessage(new ChatComponentText(chatMessage));
			}

		}
	}
}