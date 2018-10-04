package tree_of_chaos.leylines.multiblock;

import javax.annotation.Nullable;

import tree_of_chaos.leylines.multiblock.ITile;
import net.minecraft.util.math.BlockPos;

/**
 * Interface for slave tiles
 */
public interface ISlave extends ITile {

  /**
   * Sets the master tile location.
   * @param pos BlockPos of the master tile. Use null to remove the master.
   */
  void setMasterPos(@Nullable BlockPos pos);

  /**
   * Gets the location of the master tile.
   * @return The BlockPos of the master tile. Null if no master is set.
   */
  @Nullable
  BlockPos getMasterPos();
}
