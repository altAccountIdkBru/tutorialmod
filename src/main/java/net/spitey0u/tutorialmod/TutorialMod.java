package net.spitey0u.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.spitey0u.tutorialmod.block.ModBlocks;
import net.spitey0u.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

//	public static Identifier id(String path) {
//		return Identifier.of(MOD_ID, path);
//	}
}
