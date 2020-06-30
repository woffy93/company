package it.francesco.presentation.domain.dto;

public class CeoDto extends Employee {


    private CeoDto(String cf, int ral, BadgeDto badge) {
        super(cf, ral, badge);
    } //todo: singleton

}
