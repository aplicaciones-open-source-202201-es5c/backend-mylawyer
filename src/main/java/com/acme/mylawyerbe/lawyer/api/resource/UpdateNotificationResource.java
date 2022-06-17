package com.acme.mylawyerbe.lawyer.api.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
public class UpdateNotificationResource {

    private Date date;

    @NotNull
    @NotBlank
    @Size(max = 240)
    private String message;

    private Long client_id;

    //falta "private Long lawyer_id;"
}