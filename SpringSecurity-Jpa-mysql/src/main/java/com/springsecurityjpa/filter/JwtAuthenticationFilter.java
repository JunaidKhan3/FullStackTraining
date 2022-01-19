//package com.springsecurityjpa.filter;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import com.springsecurityjpa.MyUserDetailsService;
//import com.springsecurityjpa.JwtUtilHelper.JwtUtil;
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//	
//
//	@Autowired
//	private JwtUtil jwtUtil;
//	
//	@Autowired
//	private MyUserDetailsService myUserDetailsService;
//	
//	
//	@Override
//	protected void doFilterInternal(HttpServletRequest httpServeletrequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
//			throws ServletException, IOException {
//		//get jwt
//		//bearer
//		//validate
//		
//	String RequestTokenHeader=httpServeletrequest.getHeader("Authorization");
//		String userName=null;
//	    String JwtToken=null;  
//		
//	
//	//now check if requestTokenHeader is null or not
//	if(RequestTokenHeader!=null && RequestTokenHeader.startsWith("Bearer ")) {
//		
//		JwtToken=RequestTokenHeader.substring(7);
//		userName=jwtUtil.getUsernameFromToken(JwtToken);
//		
//	}
////	try {
////	       userName=jwtUtil.getUsernameFromToken(JwtToken);
////			
////		}catch(Exception e) {
////			e.printStackTrace();
////		}
////		
////		
////		//define userDetails
////		UserDetails userDetails=this.myUserDetailsService.loadUserByUsername(userName);
////		
////		//security
////		//this a null check
////		if(userName!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
////			
////	    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
////
////	    usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
////
////	    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
////	    
////	    
////		}else {
////			System.out.println("Token is not validate");
////		}
////		filterChain.doFilter(request, response);
////	}
//	 if(userName!=null && SecurityContextHolder.getContext().getAuthentication() == null) {
//         UserDetails userDetails
//                 = myUserDetailsService.loadUserByUsername(userName);
//
//         if(jwtUtil.validateToken(JwtToken,userDetails)) {
//             UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
//                     = new UsernamePasswordAuthenticationToken(userDetails,
//                     null, userDetails.getAuthorities());
//
//             usernamePasswordAuthenticationToken.setDetails(
//                     new WebAuthenticationDetailsSource().buildDetails(httpServeletrequest)
//             );
//
//             SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//         } 
//
//     }
//     filterChain.doFilter(httpServeletrequest, httpServletResponse);
// }
//	
//	}




