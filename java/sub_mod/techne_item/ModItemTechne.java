package sub_mod.techne_item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = ModItemTechne.MODID, name = ModItemTechne.MODNAME, version = ModItemTechne.VERSION)

public class ModItemTechne {

	public static final String MODID = "sub_mod_techne_item";
	public static final String MODNAME = "SM_TI";
	public static final String VERSION = "0.1a";

	@Instance(ModItemTechne.MODID) public static ModItemTechne instance;
	@SidedProxy(modId = ModItemTechne.MODID, clientSide = "sub_mod.techne_item.ProxyClient", serverSide = "sub_mod.techne_item.ProxyCommon")
	public static ProxyCommon proxy;

	public static Item item_techne;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		item_techne = new ItemTechne();
		GameRegistry.registerItem(item_techne, "item_techne");

		proxy.preInit();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

}