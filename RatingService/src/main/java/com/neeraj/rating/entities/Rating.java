package com.neeraj.rating.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_ratings")
public class Rating {
    @Id
    @Column(name = "RATINGID")
    private String ratingId;

    @Column(name = "USERID")
    private String userId;

    @Column(name = "HOTELID")
    private String hotelId;

    @Column(name = "RATING")
    private  int rating;

    @Column(name = "FEEDBACK")
    private  String feedback;
}
