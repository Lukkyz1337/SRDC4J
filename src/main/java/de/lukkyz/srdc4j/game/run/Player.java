package de.lukkyz.srdc4j.game.run;

import de.lukkyz.srdc4j.users.User;

import java.awt.*;
import java.io.IOException;

public class Player {

    private String rel;
    private String id;
    private String name;
    private String uri;

    public String getName() throws IOException {
        if(id != null) {
            return User.fromID(id).getNames().get("international");
        } else {
            return name;
        }
    }

    public Color getColor() throws IOException {
        if(id != null) {
            return User.fromID(id).getNameStyle().getColor();
        } else {
            return Color.white;
        }
    }

}
