package br.com.watchbetter.stream;

import br.com.watchbetter.calculator.Rateable;

public class Movie extends Titulos implements Rateable{

    @Override
    public int getConvertRatingToStars(){
        return (int) averageRating() / 2;
    };
}