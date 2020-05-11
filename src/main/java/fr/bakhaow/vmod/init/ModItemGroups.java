package fr.bakhaow.vmod.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import fr.bakhaow.vmod.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public final class ModItemGroups {

	public static final ItemGroup vItems = new ModItemGroup(Main.MODID, () -> new ItemStack(Items.GOLD_NUGGET));
	public static final ItemGroup vBlocks = new ModItemGroup(Main.MODID, () -> new ItemStack(Items.GOLD_BLOCK));
	public static final ItemGroup vCombat = new ModItemGroup(Main.MODID, () -> new ItemStack(Items.GOLDEN_SWORD));
	public static final ItemGroup vTools = new ModItemGroup(Main.MODID, () -> new ItemStack(Items.GOLDEN_AXE));
	public static final ItemGroup vFood = new ModItemGroup(Main.MODID, () -> new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
	public static final ItemGroup vMounts = new ModItemGroup(Main.MODID, () -> new ItemStack(ModItems.ALUMINIUM.get()));
	public static final ItemGroup vMisc = new ModItemGroup(Main.MODID, () -> new ItemStack(Items.HONEYCOMB));

	public static final class ModItemGroup extends ItemGroup {

		@Nonnull
		private final Supplier<ItemStack> iconSupplier;

		public ModItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		@Nonnull
		public ItemStack createIcon() {
			return iconSupplier.get();
		}

	}

}