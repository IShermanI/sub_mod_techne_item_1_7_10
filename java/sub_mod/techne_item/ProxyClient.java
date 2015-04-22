package sub_mod.techne_item;

import net.minecraftforge.client.MinecraftForgeClient;

public class ProxyClient extends ProxyCommon {

	public void preInit() {
		super.preInit();
	}

	public void init() {
		super.init();

		//Item
		MinecraftForgeClient.registerItemRenderer(ModItemTechne.item_techne, new RenderItemTechne());

	}

}
