package evo.fruitcraft.Tools;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.FruitCraftCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class FCTOrangeIngotPickaxe extends ItemPickaxe {

	public FCTOrangeIngotPickaxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}
public static Item FCTOrangeIngotPickaxe;
		public void perInit(FMLPreInitializationEvent event) {
			FCTOrangeIngotPickaxe = new FCTOrangeIngotPickaxe(FruitCraftCore.ORANGEINGOT)
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("FCTOrangeIngotSpade")
					.setTextureName("fruitcraft:pick_orangeingot");
					GameRegistry.registerItem(FCTOrangeIngotPickaxe, "FCTOrangeIngotSpade");

		}

	}

