package com.wsdev.EsquadriTech.enums;

public enum StockMovementType
{
    ENTRADA( 1, "Entrada" ),
    SAIDA( 2, "Saída" ),
    AJUSTE( 3, "Ajuste" ),;

    private final Integer code;
    private final String description;

    StockMovementType( Integer code, String description )
    {
        this.code = code;
        this.description = description;
    }

    public Integer getCode()
    {
        return code;
    }

    public String getDescription()
    {
        return description;
    }

    public static StockMovementType fromCode( Integer code )
    {
        for ( StockMovementType stockMovementType : values() )
        {
            if ( stockMovementType.code.equals( code ) )
            {
                return stockMovementType;
            }
        }
        throw new IllegalArgumentException( "Tipo inválido: " + code );
    }

    @Override
    public String toString()
    {
        return description;
    }
}
