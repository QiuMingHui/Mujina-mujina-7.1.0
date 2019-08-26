package mujina.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Credential implements Serializable {

  private String certificate;
  private String key;
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

}
