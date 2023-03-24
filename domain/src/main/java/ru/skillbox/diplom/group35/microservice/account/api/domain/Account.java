package ru.skillbox.diplom.group35.microservice.account.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * Account
 *
 * @author Denis_Kholmogorov
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Account extends User {
    @Column(name = "phone", columnDefinition = "VARCHAR(255)", nullable = false)
    private String phone;

    @Column(name = "photo", columnDefinition = "VARCHAR(255)")
    private String photo;

    @Column(name = "about", columnDefinition = "TEXT")
    private String about;

    @Column(name = "city", columnDefinition = "VARCHAR(255)", nullable = false)
    private String city;

    @Column(name = "country", columnDefinition = "VARCHAR(255)", nullable = false)
    private String country;

    @Column(name = "status_code", columnDefinition = "VARCHAR(255)", nullable = false)
    private StatusCode statusCode;

    @Column(name = "reg_date", nullable = false)
    private ZonedDateTime regDate;

    @Column(name = "birth_date", nullable = false)
    private ZonedDateTime birthDate;

    @Column(name = "message_permission", columnDefinition = "VARCHAR(255)", nullable = false)
    private String messagePermission;

    @Column(name = "last_online_time", nullable = false)
    private ZonedDateTime lastOnlineTime;

    @Column(name = "is_online", nullable = false)
    private Boolean isOnline;

    @Column(name = "is_blocked", nullable = false)
    private Boolean isBlocked;

    @Column(name = "photo_id", columnDefinition = "VARCHAR(255)")
    private String photoId;

    @Column(name = "photo_name", columnDefinition = "VARCHAR(255)")
    private String photoName;
}