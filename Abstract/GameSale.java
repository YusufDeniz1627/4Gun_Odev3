package Abstract;

import Entities.Game;
import Entities.Offer;
import Entities.User;

public interface GameSale {
	void sale(User user,Game game,Offer offer);
}
