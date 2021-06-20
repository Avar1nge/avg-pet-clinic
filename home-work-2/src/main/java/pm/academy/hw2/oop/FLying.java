package pm.academy.hw2.oop;

public abstract class FLying extends Animal {
  private long maxFlyingDistance;

  public long getMaxFlyingDistance() {
    return maxFlyingDistance;
  }

  public void setMaxFlyingDistance(long maxFlyingDistance) {
    this.maxFlyingDistance = maxFlyingDistance;
  }
}
