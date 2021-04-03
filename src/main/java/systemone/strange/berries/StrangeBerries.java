package systemone.strange.berries;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class StrangeBerries implements ModInitializer {

	private static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier("strangeberry", "strangeberry"), () -> new ItemStack(StrangeBerries.GOLDEN_BERRIES));

    public static final Item SLOW_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.SLOW_BERRIES));
	public static final Item SPEED_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.SPEED_BERRIES));
	public static final Item HASTE_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.HASTE_BERRIES));
	public static final Item STRENGTH_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.STRENGTH_BERRIES));
	public static final Item REGEN_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.REGEN_BERRIES));
	public static final Item JUMP_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.JUMP_BERRIES));
	public static final Item POISON_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.POISON_BERRIES));
	public static final Item NIGHT_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.NIGHT_BERRIES));
	public static final Item FIRE_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.FIRE_BERRIES));
	public static final Item RESIST_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.RESIST_BERRIES));
	public static final Item HEALING_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.HEALING_BERRIES));
	public static final Item HARMING_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.HARMING_BERRIES));
	public static final Item LEVITATING_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.LEVITATING_BERRIES));
	public static final Item INVISIBILITY_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.INVISIBILITY_BERRIES));
	public static final Item WEAKNESS_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.WEAKNESS_BERRIES));
	public static final Item GOLDEN_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.GOLDEN_BERRIES));
	public static final Item SPECTRAL_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.SPECTRAL_BERRIES));
	public static final Item OMEN_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.OMEN_BERRIES));
	public static final Item WITHER_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.WITHER_BERRIES));
	public static final Item ROTTEN_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.ROTTEN_BERRIES));
	public static final Item LUCKY_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.LUCKY_BERRIES));
	public static final Item HERO_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.HERO_BERRIES));
	public static final Item DOLPHIN_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.DOLPHIN_BERRIES));
	public static final Item NAUSEA_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.NAUSEA_BERRIES));
	public static final Item UNLUCKY_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.UNLUCKY_BERRIES));
	public static final Item SEA_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.SEA_BERRIES));
	public static final Item EXTENDED_NIGHT_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.EXTENDED_NIGHT_BERRIES));
	public static final Item EXTENDED_FIRE_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.EXTENDED_FIRE_BERRIES));
	public static final Item EXTENDED_INVISIBILITY_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.EXTENDED_INVISIBILITY_BERRIES));
	public static final Item EXTENDED_REGEN_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.EXTENDED_REGEN_BERRIES));
	public static final Item EXTENDED_STRENGTH_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.EXTENDED_STRENGTH_BERRIES));
	public static final Item EXTENDED_SPEED_BERRIES = new Item(new Item.Settings().group(GROUP).food(BerryFoodComponents.EXTENDED_SPEED_BERRIES));


	@Override
	public void onInitialize() {

    Registry.register(Registry.ITEM, new Identifier("strangeberry", "slow_berries"), SLOW_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "speed_berries"), SPEED_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "haste_berries"), HASTE_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "strength_berries"), STRENGTH_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "regen_berries"), REGEN_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "jump_berries"), JUMP_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "poison_berries"), POISON_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "night_berries"), NIGHT_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "fire_berries"), FIRE_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "resist_berries"), RESIST_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "healing_berries"), HEALING_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "harming_berries"), HARMING_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "levitating_berries"), LEVITATING_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "invisibility_berries"), INVISIBILITY_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "weakness_berries"), WEAKNESS_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "sea_berries"), SEA_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "omen_berries"), OMEN_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "wither_berries"), WITHER_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "rotten_berries"), ROTTEN_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "golden_berries"), GOLDEN_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "hero_berries"), HERO_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "dolphin_berries"), DOLPHIN_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "nausea_berries"), NAUSEA_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "spectral_berries"), SPECTRAL_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "unlucky_berries"), UNLUCKY_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "lucky_berries"), LUCKY_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "extended_night_berries"), EXTENDED_NIGHT_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "extended_fire_berries"), EXTENDED_FIRE_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "extended_invisibility_berries"), EXTENDED_INVISIBILITY_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "extended_regen_berries"), EXTENDED_REGEN_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "extended_strength_berries"), EXTENDED_STRENGTH_BERRIES);
	Registry.register(Registry.ITEM, new Identifier("strangeberry", "extended_speed_berries"), EXTENDED_SPEED_BERRIES);
	}
}
