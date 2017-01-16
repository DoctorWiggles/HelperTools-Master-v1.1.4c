package helpertools.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import helpertools.tools.Staff_Expansion;
import helpertools.tools.Staff_Transformation;
import ibxm.Player;
import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

/** http://www.minecraftforge.net/wiki/Packet_Handling **/
/** http://www.minecraftforge.net/forum/index.php/topic,20135.0.html	**/
public class NetworkMessage implements IMessage {
   
    private String text;

    public NetworkMessage() { }

    public NetworkMessage(String text) {
        this.text = text;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        text = ByteBufUtils.readUTF8String(buf); 
        // this class is very useful in general for writing more complex objects
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, text);
    }

    public static class Handler implements IMessageHandler<NetworkMessage, IMessage> {
       
        @Override
        public IMessage onMessage(NetworkMessage message, MessageContext ctx) {
            //System.out.println(String.format("Received %s from %s", message.text, ctx.getServerHandler().playerEntity.getDisplayName()));
            EntityPlayerMP theplayer = ctx.getServerHandler().playerEntity;
            ItemStack heldItem = theplayer.inventory.getCurrentItem();
            
            if ((heldItem == null) || (!(heldItem.getItem() instanceof Staff_Expansion))) {
            	if ((heldItem == null) ||!(heldItem.getItem() instanceof Staff_Transformation)){
            	//System.out.println("Returned null Erra!!!"); 
  		      return null;
            	}
  		    }
            if(heldItem.getItem() instanceof Staff_Expansion){
            	Staff_Expansion  Tool = (Staff_Expansion)heldItem.getItem();
            	Tool.ToolEmpower(heldItem, theplayer);
            }
            if(heldItem.getItem() instanceof Staff_Transformation){
            	Staff_Transformation  Tool = (Staff_Transformation)heldItem.getItem();
            	Tool.ToolEmpower(heldItem, theplayer);
            }
  		 
            return null; // no response in this case
        }
    }
}

	// Sending packets:
	//MyMod.network.sendToServer(new MyMessage("foobar"));
	//MyMod.network.sendTo(new SomeMessage(), somePlayer);