package evo.fruitcraft.Tools;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.FruitCraftCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class FCTOrangeIngotSpade{
	public static Item FCTOrangeIngotSpade;
	public void perInit(FMLPreInitializationEvent event) {
		FCTOrangeIngotSpade = new ItemSpade(FruitCraftCore.ORANGEINGOT)
				.setCreativeTab(CreativeTabs.tabTools)
				.setUnlocalizedName("FCTOrangeIngotSpade")
				.setTextureName("fruitcraft:shovel_orangeingot");
				GameRegistry.registerItem(FCTOrangeIngotSpade, "FCTOrangeIngotSpade");
	}
}