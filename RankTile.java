abstract public class RankTile extends Tile {

    protected int rank;

    public RankTile(int otherRank) {
        this.rank = otherRank;
    }

    public boolean matches(Tile otherTile) {
        RankTile other = (RankTile) otherTile;

        return (super.matches(otherTile) && (this.rank == other.rank));
    }
}
