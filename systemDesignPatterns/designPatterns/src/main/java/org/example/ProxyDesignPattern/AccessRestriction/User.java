package org.example.ProxyDesignPattern.AccessRestriction;

public class User {
    AceessLevel aceessLevel;
    State state;

    User(AceessLevel aceessLevel, State state){
        this.state = state;
        this.aceessLevel = aceessLevel;
    }

}
