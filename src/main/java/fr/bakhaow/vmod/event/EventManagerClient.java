package fr.bakhaow.vmod.event;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import fr.bakhaow.vmod.Main;
import fr.bakhaow.vmod.client.screen.AuthScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Main.MODID, value = Dist.CLIENT)
@OnlyIn(Dist.CLIENT)
public class EventManagerClient {

    @SubscribeEvent
    public static void onFirstMainMenuGui(GuiScreenEvent.InitGuiEvent.Post event) {
        if(event.getGui() instanceof MainMenuScreen) {
        	if(!AuthScreen.authed) {
        		Minecraft.getInstance().displayGuiScreen(new AuthScreen());
        	}
        }
    }
    
    @SubscribeEvent
    public static void onInGameGui(RenderGameOverlayEvent e) {
    	if(e.getType() == ElementType.CROSSHAIRS) {
    		float width = e.getWindow().getScaledWidth();
    		float height = e.getWindow().getScaledHeight();
    		Minecraft mc = Minecraft.getInstance();
    		RenderSystem.pushMatrix();
    		RenderSystem.translatef(width / 20, height / 5, 1050.0F);
    		RenderSystem.scalef(0.05F, 0.05F, -1F);
    		MatrixStack ms = new MatrixStack();
    		ms.translate(0.0D, 0.0D, 1000.0D);
    		ms.scale(width, width, width);
    		Quaternion q = Vector3f.ZP.rotationDegrees(180.0F);
    		Quaternion q1 = Vector3f.XP.rotationDegrees(1 * 20.0F);
    		q.multiply(q1);
    		ms.rotate(q);
    		EntityRendererManager erm = mc.getRenderManager();
    		q1.conjugate();
    		erm.setCameraOrientation(q1);
    		erm.setRenderShadow(false);
    		IRenderTypeBuffer.Impl ir = mc.getRenderTypeBuffers().getBufferSource();
    		erm.renderEntityStatic(mc.player, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, ms, ir, 15728880);
    		ir.finish();
    		erm.setRenderShadow(true);
    		RenderSystem.popMatrix();
    		if(Minecraft.getInstance().player.isRidingHorse()) {
    			Entity ent = mc.player.getRidingEntity();
        		RenderSystem.pushMatrix();
        		float f = height / 5 + height / 15;
    			if(!ent.onGround) {
    				f = height / 5 + height / 10;
    			}
        		RenderSystem.translatef(width / 20, f, 1050.0F);
        		RenderSystem.scalef(0.05F, 0.05F, -1F);
        		MatrixStack ms1 = new MatrixStack();
        		ms1.translate(0.0D, 0.0D, 1000.0D);
        		ms1.scale(width, width, width);
        		Quaternion q2 = Vector3f.ZP.rotationDegrees(180.0F);
        		Quaternion q3 = Vector3f.XP.rotationDegrees(1 * 20.0F);
        		q2.multiply(q3);
        		ms1.rotate(q2);
        		EntityRendererManager erm1 = mc.getRenderManager();
        		q2.conjugate();
        		erm1.setCameraOrientation(q3);
        		erm1.setRenderShadow(false);
        		IRenderTypeBuffer.Impl ir1 = mc.getRenderTypeBuffers().getBufferSource();
        		erm1.renderEntityStatic(mc.player.getRidingEntity(), 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, ms1, ir1, 15728880);
        		ir1.finish();
        		erm1.setRenderShadow(true);
        		RenderSystem.popMatrix();

    		}
    	}
    }
}
