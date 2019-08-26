package mujina.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

  private String name;
  private String password;
  private List<String> authorities;
  
  User(String name,String password,List<String> authorities){
    this.name = name;
    this.password=password;
    this.authorities = authorities;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public List<String> getAuthorities() {
    return authorities;
  }
  public void setAuthorities(List<String> authorities) {
    this.authorities = authorities;
  }
}
