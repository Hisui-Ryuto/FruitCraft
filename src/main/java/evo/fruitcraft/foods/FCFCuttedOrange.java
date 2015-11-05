package evo.fruitcraft.foods;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.FruitCraftCore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FCFCuttedOrange{
	public FCFCuttedOrange(){}
	public static Item FCFCuttedOrange;
			@EventHandler
			public void perInit(FMLPreInitializationEvent event) {
		FCFCuttedOrange = new ItemFood(1, 0.6F, false)
			.setCreativeTab(FruitCraftCore.FCTTabFruitCraft)
			.setUnlocalizedName("FCFCuttedOrange")
			.setTextureName("fruitcraft:cutted_orange");
	GameRegistry.registerItem(FCFCuttedOrange, "FCFCuttedOrange");
	}
}