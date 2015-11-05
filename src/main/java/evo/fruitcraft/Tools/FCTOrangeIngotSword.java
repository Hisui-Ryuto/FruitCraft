package evo.fruitcraft.Tools;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.FruitCraftCore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class FCTOrangeIngotSword{
	public static Item FCTOrangeIngotSword;
	public void perInit(FMLPreInitializationEvent event) {
		FCTOrangeIngotSword = new ItemSword(FruitCraftCore.ORANGEINGOT)
				.setCreativeTab(FruitCraftCore.FCTTabFruitCraft)
				.setUnlocalizedName("FCTOrangeIngotSword")
				.setTextureName("fruitcraft:sword_orangeingot");
				GameRegistry.registerItem(FCTOrangeIngotSword, "FCTOrangeIngotSword");
	}
}