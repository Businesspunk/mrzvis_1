package com.company;

public class Method {
    protected Binary a, b, result;

    public Method( Binary a, Binary b )
    {
        this.a = a;
        this.b = b;
    }

    public Method( Binary[] binaries)
    {
        this.a = binaries[0];
        this.b = binaries[1];
    }

    public Method( Binary a )
    {
        this( a, new Binary() );
    }

    public Binary callback()
    {
        return this.result;
    }

    public Method multiplication( int index )
    {

        this.result = this.b.multiplicateOnInt( this.a.getBitFromEnd(index) );
        return this;
    }

    public Method sum( int shift )
    {
        this.result = this.b.addAndSave( this.a.shiftLeft(shift) );
        return this;
    }

    public Method sum()
    {
        return sum(0);
    }

}

