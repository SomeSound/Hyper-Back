package com.example.hyper.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ALBUM")
@EqualsAndHashCode(callSuper = false)
public class AlbumEntity extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALBUM_SEQ")
    @SequenceGenerator(name = "ALBUM_SEQ", sequenceName = "ALBUM_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "IMAGE", nullable = false)
    private String image;

    @Column(name = "RELEASE_DATE", nullable = false)
    private ZonedDateTime releaseDate;

    private RecordEntity recordId;

    private CustomerEntity customerId;
}
