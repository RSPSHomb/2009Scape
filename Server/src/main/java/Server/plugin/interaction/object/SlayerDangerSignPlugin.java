package plugin.interaction.object;

import core.cache.def.impl.ObjectDefinition;
import core.game.interaction.OptionHandler;
import core.game.node.Node;
import core.game.node.entity.player.Player;
import core.plugin.InitializablePlugin;
import core.plugin.Plugin;

/**
 * @author 'Vexia
 */
@InitializablePlugin
public class SlayerDangerSignPlugin extends OptionHandler {

	@Override
	public Plugin<Object> newInstance(Object arg) throws Throwable {
		ObjectDefinition.forId(5127).getConfigurations().put("option:read", this);
		return this;
	}

	@Override
	public boolean handle(Player player, Node node, String option) {
		player.getDialogueInterpreter().sendDialogue("<col=FFF0000>WARNING!", "</col>This area contains very dangerous creatures!", "Do not pass unless properly prepared!");
		return true;
	}

}
