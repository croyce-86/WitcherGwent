package com.siegester.witchergwent.GwentCard;

/**
 * WitcherGwent
 * <p/>
 * Created by Siegester on 7/8/2016.
 */
public enum AttackType
{
   NoType("NoType"),
   Melee("Melee"),
   Ranged ("Ranged"),
   Assault ("Assault"),
   Weather ("Weather");

   private final String _name;

   AttackType(String name)
   {
      _name = name;
   }

   AttackType()
   {
      _name = "NoType";
   }

   public boolean equals( String name )
   {
      return name != null && name.equals(_name);
   }

   public boolean equals( AttackType name )
   {
      return name != null && _name.equals(name.toString());
   }

   @Override
   public String toString()
   {
      return _name;
   }
}
