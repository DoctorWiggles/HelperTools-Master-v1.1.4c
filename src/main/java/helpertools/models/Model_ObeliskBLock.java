// Date: 5/5/2015 10:28:04 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package helpertools.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Model_ObeliskBLock extends ModelBase
{
  //fields
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer NotStaveCore;
    ModelRenderer Base1;
    ModelRenderer StaveCrystal;
  
  public Model_ObeliskBLock()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Leg1 = new ModelRenderer(this, 0, 44);
      Leg1.addBox(0F, 0F, 0F, 2, 11, 2);
      Leg1.setRotationPoint(0F, 15F, 0F);
      Leg1.setTextureSize(128, 128);
      Leg1.mirror = true;
      setRotation(Leg1, 0.4363323F, 0F, -0.4363323F);
      
      Leg2 = new ModelRenderer(this, 0, 44);
      Leg2.addBox(0F, 0F, 0F, 2, 11, 2);
      Leg2.setRotationPoint(0F, 15F, 0F);
      Leg2.setTextureSize(128, 128);
      Leg2.mirror = true;
      setRotation(Leg2, 0.4363323F, 1.570796F, -0.4363323F);
      
      
      Leg3 = new ModelRenderer(this, 0, 44);
      Leg3.addBox(0F, 0F, 0F, 2, 11, 2);
      Leg3.setRotationPoint(0F, 15F, 0F);
      Leg3.setTextureSize(128, 128);
      Leg3.mirror = true;
      setRotation(Leg3, 0.4363323F, 3.141593F, -0.4363323F);
      
      
      Leg4 = new ModelRenderer(this, 0, 44);
      Leg4.addBox(0F, 0F, 0F, 2, 11, 2);
      Leg4.setRotationPoint(0F, 15F, 0F);
      Leg4.setTextureSize(128, 128);
      Leg4.mirror = true;
      setRotation(Leg4, 0.4363323F, 4.712389F, -0.4363323F);
      
      
      NotStaveCore = new ModelRenderer(this, 0, 69);
      NotStaveCore.addBox(-1F, 0F, -1F, 2, 12, 2);
      NotStaveCore.setRotationPoint(0F, -1F, 0F);
      NotStaveCore.setTextureSize(128, 128);
      NotStaveCore.mirror = true;
      setRotation(NotStaveCore, 0F, 0.5651149F, 0F);
      
      Base1 = new ModelRenderer(this, 17, 43);
      Base1.addBox(-2.5F, 0F, -2.5F, 5, 2, 5);
      Base1.setRotationPoint(0F, 13F, 0F);
      Base1.setTextureSize(128, 128);
      Base1.mirror = true;
      setRotation(Base1, 0F, -0.1189716F, 0F);
      
      StaveCrystal = new ModelRenderer(this, 0, 90);
      StaveCrystal.addBox(0F, 0F, 0F, 3, 3, 3);
      StaveCrystal.setRotationPoint(0F, -7F, 0F);
      StaveCrystal.setTextureSize(128, 128);
      StaveCrystal.mirror = true;
      setRotation(StaveCrystal, -0.7853982F, 0.570796F, 0.6457718F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    NotStaveCore.render(f5);
    Base1.render(f5);
    StaveCrystal.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
