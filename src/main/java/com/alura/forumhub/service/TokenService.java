
package com.alura.forumhub.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import java.util.Date;

public class TokenService {

 private String secret = "123456";

 public String gerarToken(String usuario){

  Algorithm algoritmo = Algorithm.HMAC256(secret);

  return JWT.create()
   .withIssuer("forumhub")
   .withSubject(usuario)
   .withExpiresAt(new Date(System.currentTimeMillis()+86400000))
   .sign(algoritmo);
 }
}
