/***
 * JUKEBOX
 * Design a musical jukebox using object-oriented principles
 */

package Q7_03_Jukebox;

import java.util.Set; // must import

public class JukeBox {
	// CDPlayer >> User >> CD >> SongSelector >> Song
	private CDPlayer cdPlayer;
	private User user;
	private Set<CD> cdCollection;
	private SongSelector ts;
	
	public JukeBox(CDPlayer cdPlayer, User user, Set<CD> cdCollection,
				   SongSelector ts) {
		/***
		 * A jukebox consists of a cd player, a collection of cds,
		 * a song selector device
		 */
		super();
		this.cdPlayer = cdPlayer;
		this.user = user;
		this.cdCollection = cdCollection;
		this.ts = ts;
	}
	
	// Must be able to return the current song and set the user that placed it
	public Song getCurrentSong() { return ts.getCurrentSong();	}
	public void setUser(User u) { this.user = u;	}
}
