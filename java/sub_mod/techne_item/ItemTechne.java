package sub_mod.techne_item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTechne extends Item {

	public ItemTechne() {
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setFull3D();
		setTextureName(ModItemTechne.MODID + ":item_techne");
		setUnlocalizedName(ModItemTechne.MODID + ".item_techne");
	}

}
