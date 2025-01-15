package net.cjcrispy;

import net.cjcrispy.Blocks.ModBlocks;
import net.cjcrispy.item.ModItemGroups;
import net.cjcrispy.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {
	public static final String MOD_ID = "tutorial";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItem();
		ModBlocks.registerModBlocks();
	}
}