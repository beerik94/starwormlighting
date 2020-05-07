package nl.beerik.starwormlighting;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class StarWormLightingItemGroup extends ItemGroup {

	@Nonnull
	private final Supplier<ItemStack> iconSupplier;
	
	public StarWormLightingItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
		super(name);
		this.iconSupplier = iconSupplier;
	}
	
	@Override
	@Nonnull
	public ItemStack createIcon() {
		return iconSupplier.get();
	}
}
