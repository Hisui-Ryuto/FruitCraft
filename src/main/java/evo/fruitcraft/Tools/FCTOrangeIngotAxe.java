package evo.fruitcraft.Tools;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.FruitCraftCore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class FCTOrangeIngotAxe extends ItemAxe {

	public FCTOrangeIngotAxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}
	public static Item FCTOrangeIngotAxe;
	public void perInit(FMLPreInitializationEvent event) {
		FCTOrangeIngotAxe = new FCTOrangeIngotAxe(FruitCraftCore.ORANGEINGOT)
				.setCreativeTab(FruitCraftCore.FCTTabFruitCraft)
				.setUnlocalizedName("FCTOrangeIngotAxe")
				.setTextureName("fruitcraft:axe_orangeingot");
				GameRegistry.registerItem(FCTOrangeIngotAxe, "FCTOrangeIngotAxe");

	}
}