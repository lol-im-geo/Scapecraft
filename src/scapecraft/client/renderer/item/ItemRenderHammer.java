package scapecraft.client.renderer.item;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import scapecraft.client.model.ModelWarhammer;

public class ItemRenderHammer implements IItemRenderer
{
	protected ModelWarhammer WarHammerModel;
	protected ResourceLocation texture;

	public ItemRenderHammer(ResourceLocation texture)
	{
		WarHammerModel = new ModelWarhammer();		
		this.texture = texture;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type)
		{
			case EQUIPPED: return true;
			case ENTITY: return true;
			case EQUIPPED_FIRST_PERSON: return true;
			default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type)
		{
			case  ENTITY:
				{
					GL11.glPushMatrix();
					float scale = 1.7F;
					GL11.glScalef(scale,scale,scale);
					RenderManager.instance.renderEngine.bindTexture(texture);
					GL11.glRotatef(90F, 1.0f, 0.0f, 0.0f);
					GL11.glRotatef(45F, 0.0f, 0.0f, 1.0f);
					GL11.glTranslatef( -0.2F, 0F, -0.5F);
					WarHammerModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					//FMLClientHandler.instance().getClient().renderEngine.resetBoundTexture();
					GL11.glPopMatrix();
				}
				break;
			case EQUIPPED_FIRST_PERSON:
				{
					GL11.glPushMatrix();
					RenderManager.instance.renderEngine.bindTexture(texture);
					float scale = 0.85F;
					GL11.glScalef(scale, scale, scale);
					GL11.glRotatef(230.0F, 0.0F, 0.0F, 1.0F);
					GL11.glTranslatef(-1.0F, -0.7F, -0.15F);
					WarHammerModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					GL11.glPopMatrix();
				}
			case EQUIPPED:
				{
					GL11.glPushMatrix();
					RenderManager.instance.renderEngine.bindTexture(texture);
					float scale = 0.85F;
					GL11.glScalef(scale, scale, scale);
					GL11.glRotatef(230.0F, 0.0F, 0.0F, 1.0F);
					GL11.glTranslatef(-1.0F, -0.7F, -0.15F);
					WarHammerModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					GL11.glPopMatrix();
				}
			default:
				break;
		}
	}
}
