package com.siegester.witchergwent.GwentCard;

/**
 * WitcherGwent
 * <p/>
 * Created by Siegester on 7/8/2016.
 */
public class Card {
   /**
    * Default constructor
    *
    */
   public Card()
   {
      _cardStrength = -1;
      _attackType = AttackType.NoType;
      _name = "";
      _description = "";
   }

   /**
    * Constructor
    *
    * @param strength - Strength of the card
    * @param atType - AttackType of the card
    */
   public Card(int strength, AttackType atType, String name, String description)
   {
      _cardStrength = strength;
      _attackType = atType;
      _name = name;
      _description = description;
   }

   public String get_name() {
      return _name;
   }

   public void set_name( String _name ) {
      this._name = _name;
   }

   public String get_description() {
      return _description;
   }

   public void set_description( String _description ) {
      this._description = _description;
   }

   public void set_attackType( AttackType _attackType ) {
      this._attackType = _attackType;
   }

   public void set_cardStrength( int _cardStrength ) {
      this._cardStrength = _cardStrength;
   }

   private String _name;
   private String _description;
   private int _cardStrength;
   private AttackType _attackType;

}
