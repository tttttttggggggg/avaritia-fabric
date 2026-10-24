package net.byAqua3.avaritia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class Avaritia implements ModInitializer {

	public static final String MODID = "avaritia";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Avaritia (Fabric port) loaded");
	}
}
