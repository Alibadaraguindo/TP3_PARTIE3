package ma.enset.tp3partie3.security.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUser {
    @Id
    public String userId;
    @Column(unique = true)
    public String username;
    public String password;
    public String email;
    @ManyToMany (fetch = FetchType.EAGER)
    private List<AppRole> roles;
}
