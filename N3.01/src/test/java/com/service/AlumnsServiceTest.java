package com.service;

import com.model.Alumns;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

public class AlumnsServiceTest{

    AlumnsService alumnsService = new AlumnsService();
    List<Alumns> alumnsList = alumnsService.getListAlumnus();

    @Test
    void shoulsShowAlumnsWithA() {
        assertThat(alumnsService.showOnlyAlumnsThatStartsWithA(alumnsList)).isEmpty();
    }

    @Test
    void shoulsShowAlumnsWithScoreHigherThan5() {
        assertThat(alumnsService.showScoreMoreThanFive().size()).isEqualTo(7);
        assertThat(alumnsService.showScoreMoreThanFive())
                .containsOnly(alumnsList.get(0),alumnsList.get(1),alumnsList.get(2),alumnsList.get(3)
                        ,alumnsList.get(4),alumnsList.get(7),alumnsList.get(8));
    }

    @Test
    void ShouldShowAlumnsWithScoreHigherThan5AndPHP() {
        assertThat(alumnsService.showScoreMoreThanFiveAndPHP().size()).isEqualTo(4);
        assertThat(alumnsService.showScoreMoreThanFiveAndPHP())
                .containsOnly(alumnsList.get(0),alumnsList.get(2),alumnsList.get(4),alumnsList.get(7));
    }

    @Test
    void ShoulsShowAlumnsJavaAndMajor() {
        assertThat(alumnsService.showJavaAndMajor()).containsOnly(alumnsList.get(6));
    }


}