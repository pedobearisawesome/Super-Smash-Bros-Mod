package com.aggro.asma.proxy;


	import net.minecraft.client.renderer.entity.RenderSnowball;

import com.DwainEdwards.Blocks.TileEntityssbATM;
import com.DwainEdwards.Entity.EntityDonkey;
import com.DwainEdwards.Entity.EntityFox;
import com.DwainEdwards.Entity.EntityJigglypuff;
import com.DwainEdwards.Entity.EntityLink;
import com.DwainEdwards.Entity.EntityLuigi;
import com.DwainEdwards.Entity.EntityMario;
import com.DwainEdwards.Entity.EntityMiiBullet;
import com.DwainEdwards.Entity.EntityMiiGunner;
import com.DwainEdwards.Entity.EntityPikachu;
import com.DwainEdwards.Entity.EntityYoshi;
import com.DwainEdwards.Items.SmashItems;
import com.DwainEdwards.Models.ModelDONKEY;
import com.DwainEdwards.Models.ModelFOX;
import com.DwainEdwards.Models.ModelJIGGLYPUFF;
import com.DwainEdwards.Models.ModelLUIGI;
import com.DwainEdwards.Models.ModelLink;
import com.DwainEdwards.Models.ModelMARIO;
import com.DwainEdwards.Models.ModelMIIGUNNER;
import com.DwainEdwards.Models.ModelPIKACHU;
import com.DwainEdwards.Models.ModelYoshi;
import com.DwainEdwards.Render.RenderDonkey;
import com.DwainEdwards.Render.RenderFox;
import com.DwainEdwards.Render.RenderJigglypuff;
import com.DwainEdwards.Render.RenderLink;
import com.DwainEdwards.Render.RenderLuigi;
import com.DwainEdwards.Render.RenderMario;
import com.DwainEdwards.Render.RenderMiiGunner;
import com.DwainEdwards.Render.RenderPikachu;
import com.DwainEdwards.Render.RenderYoshi;
import com.DwainEdwards.TESR.RenderssbATM;
import com.DwainEdwards.gui.GuiHandler;
import com.aggro.asma.Main;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkRegistry;

	public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenderers() {
		
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.modInstance,
				new GuiHandler());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityssbATM.class,
				new RenderssbATM());
	
		//projectiles
		RenderingRegistry.registerEntityRenderingHandler(EntityMiiBullet.class, new RenderSnowball(SmashItems.miibullet));
		
		//player render
		//RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, new RenderPlayerN());
		
		//entities
		RenderingRegistry.registerEntityRenderingHandler(EntityMario.class, new RenderMario(new ModelMARIO(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPikachu.class, new RenderPikachu(new ModelPIKACHU(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDonkey.class, new RenderDonkey(new ModelDONKEY(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLuigi.class, new RenderLuigi(new ModelLUIGI(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMiiGunner.class, new RenderMiiGunner(new ModelMIIGUNNER(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFox.class, new RenderFox(new ModelFOX(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityYoshi.class, new RenderYoshi(new ModelYoshi(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLink.class, new RenderLink(new ModelLink(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJigglypuff.class, new RenderJigglypuff(new ModelJIGGLYPUFF(), 0.3F));
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityHand.class, new RenderHand(new ModelHand(), 0.5F));
	//RenderingRegistry.registerEntityRenderingHandler(EntityMii.class, new RenderMii(new ModelBiped(), 0.5F));
	//RenderingRegistry.registerEntityRenderingHandler(EntityUFO.class, new RenderUFO(new ModelUFO(), 0.5F));
	//RenderingRegistry.registerEntityRenderingHandler(EntityLakitu.class, new RenderLakitu(new ModelLakitu(), 0.5F));
	//RenderingRegistry.registerEntityRenderingHandler(EntityDHDog.class, new RenderDHDog(new ModelWolf(), new ModelWolf(), 0.5F));

	//RenderingRegistry.registerEntityRenderingHandler(EntityDisc.class, new RenderDisc(new ModelDisc(), 0.5F));
	}
	@SidedProxy(clientSide = "com.aggro.asma.proxy.YoyoClient", serverSide = "com.aggro.asma.proxy.YoyoCommon")
	public static YoyoCommon proxy;
	
}
