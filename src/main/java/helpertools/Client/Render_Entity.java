package helpertools.Client;

import helpertools.Com.ItemRegistry;
import helpertools.Com.Entity.Entity_BombProjectile;
import helpertools.Com.Entity.Entity_DynamiteProjectile;
import helpertools.Com.Entity.Entity_FlyingItem;
import helpertools.Com.Entity.Entity_Mirage;
import helpertools.Com.Entity.Entity_RedTorchProjectile;
import helpertools.Com.Entity.Entity_TorchProjectile;
import helpertools.Com.Entity.Phantom_Cube;
import helpertools.Com.Entity.Renders.Render_BombProjectile;
import helpertools.Com.Entity.Renders.RenderDynamiteProjectile;
import helpertools.Com.Entity.Renders.RenderRedTorchProjectile;
import helpertools.Com.Entity.Renders.RenderTorchProjectile;
import helpertools.Com.Entity.Renders.Render_FlyingItem;
import helpertools.Com.Entity.Renders.Render_Mirage;
import helpertools.Com.Entity.Renders.Render_PhantomCube;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class Render_Entity {
	

	static RenderManager render = Minecraft.getMinecraft().getRenderManager();	
	static RenderItem Item = Minecraft.getMinecraft().getRenderItem();
	
	public static void register_entity_renderer(){
		//super.registerRenderers();    
		reg(Entity_TorchProjectile.class, new RenderTorchProjectile(render));
		
        reg(Entity_DynamiteProjectile.class, new RenderDynamiteProjectile(render));
        
        reg(Entity_RedTorchProjectile.class, new RenderRedTorchProjectile(render));
        
        reg(Entity_BombProjectile.class, new Render_BombProjectile(render, ItemRegistry.dirtbomb, Item));
       
		reg(Entity_FlyingItem.class, new Render_FlyingItem(render, ItemRegistry.miragehusk, Item));
				
		reg(Entity_Mirage.class, new Render_Mirage(render));
		
		reg(Phantom_Cube.class, new Render_PhantomCube(render));
        
	}
	

	public static void reg(Class<? extends Entity> entityClass, Render renderer){
		
		RenderingRegistry.registerEntityRenderingHandler(entityClass, renderer);
	}

}
