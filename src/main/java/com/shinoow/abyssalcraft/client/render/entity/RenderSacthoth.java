/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2019 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.client.render.entity;

import com.shinoow.abyssalcraft.client.model.entity.ModelSacthoth;
import com.shinoow.abyssalcraft.common.entity.EntitySacthoth;
import com.shinoow.abyssalcraft.lib.ACLib;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSacthoth extends RenderLiving<EntitySacthoth> {

	private static final ResourceLocation mobTexture = new ResourceLocation("abyssalcraft:textures/model/boss/sacthoth.png");

	public RenderSacthoth(RenderManager manager)
	{
		super(manager, new ModelSacthoth(), 0.0F);
	}

	@Override
	protected void renderModel(EntitySacthoth entitylivingbaseIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
	{
		if(entitylivingbaseIn.dimension != ACLib.dark_realm_id)
			GlStateManager.color(1.0F, 1.0F, 1.0F, Math.max(entitylivingbaseIn.getBrightness(), 0.15f));
		GlStateManager.enableBlend();
		GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
		super.renderModel(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
		GlStateManager.disableBlend();
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySacthoth entity) {

		return mobTexture;
	}
}
