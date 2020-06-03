package com.dathanwong.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon squirtle = new Pokemon("squirtle", 100, "water");
		Pokemon charmander = new Pokemon("charmander", 110, "fire");
		squirtle.attackPokemon(charmander);
		charmander.attackPokemon(squirtle);
		Pokedex pokedex = new Pokedex();
		pokedex.add(squirtle);
		pokedex.add(charmander);
		pokedex.listPokemon();
	}

}
