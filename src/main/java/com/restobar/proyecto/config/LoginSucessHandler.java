package com.restobar.proyecto.config;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class LoginSucessHandler extends SimpleUrlAuthenticationSuccessHandler {
}
