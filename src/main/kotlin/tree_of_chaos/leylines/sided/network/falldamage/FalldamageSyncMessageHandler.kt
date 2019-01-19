package tree_of_chaos.leylines.sided.network.falldamage

import net.minecraftforge.fml.common.network.simpleimpl.IMessage
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext

class FalldamageSyncMessageHandler : IMessageHandler<FalldamageSyncMessage, IMessage> {
    override fun onMessage(message: FalldamageSyncMessage, ctx: MessageContext): IMessage? {
        ctx.serverHandler.player.fallDistance = 0.0f
        return null
    }
}
