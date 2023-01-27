package net.digifr0st.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/* ***************************************************
 * A single instance of this class can be used to make
 * as many new creative mode tabs as desired. Just
 * make another CreativeModeTab with a new variable
 * name and new label, and provide the ItemStack icon
 * for the tab.
 */
public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}
