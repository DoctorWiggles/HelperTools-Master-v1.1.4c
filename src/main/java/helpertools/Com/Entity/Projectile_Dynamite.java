package helpertools.Com.Entity;

import helpertools.Utils.BlockStateHelper;

import java.util.Stack;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Projectile_Dynamite extends EntityThrowable{
	
   public Projectile_Dynamite(World world) {
       super(world);
   }

   public Projectile_Dynamite(World world, EntityPlayer entityPlayer) {
       super(world,entityPlayer);
   }
   
   /** Called whenever the entities hitbox touches another box, being an entitie's or block. **/
   @Override
  protected void onImpact(RayTraceResult mop) {
	   
	   if (this.worldObj.isRemote){ return;}	  
	      
	     this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)4, true);
	      
	     this.setDead();
	   
   
   
	
	
   }
   
   
   
   
   

  
}