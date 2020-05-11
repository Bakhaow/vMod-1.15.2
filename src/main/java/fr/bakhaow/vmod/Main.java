package fr.bakhaow.vmod;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.bakhaow.vmod.init.ModBlocks;
import fr.bakhaow.vmod.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
 
@Mod(Main.MODID)
public class Main {

	public static final String MODID = "vmod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final String Serv = "Village v1.0";
	
	public Main() {
		LOGGER.debug("vMod turned ON");
		final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModBlocks.BLOCKS.register(bus);
		ModItems.ITEMS.register(bus);
	}
 
}