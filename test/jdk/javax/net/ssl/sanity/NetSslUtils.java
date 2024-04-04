/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

 import java.security.Security;
 import java.security.Provider;
 import java.util.List;
 import java.util.ArrayList;
 
 public class NetSslUtils {
   
     private static boolean isFIPS = false;
   
     public static final List<String> TLS_PROTOCOLS = new ArrayList<>();
     public static final List<String> TLS_CIPHERSUITES = new ArrayList<>();
  
     public static boolean isFIPS_140_3() {
         for (Provider p : Security.getProviders()) {
             System.out.println(p.getName());
             if (p.getName().equals("OpenJCEPlusFIPS")) {
                 isFIPS = true;
             }
         }
         return isFIPS;
     }
  
     static {
         TLS_PROTOCOLS.add("TLSv1.2");
         TLS_PROTOCOLS.add("TLSv1.3");
          
         TLS_CIPHERSUITES.add("TLS_AES_128_GCM_SHA256");
         TLS_CIPHERSUITES.add("TLS_AES_256_GCM_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
         TLS_CIPHERSUITES.add("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
         TLS_CIPHERSUITES.add("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
         TLS_CIPHERSUITES.add("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
         TLS_CIPHERSUITES.add("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
         TLS_CIPHERSUITES.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
         TLS_CIPHERSUITES.add("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
         TLS_CIPHERSUITES.add("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
         TLS_CIPHERSUITES.add("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
         TLS_CIPHERSUITES.add("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
         TLS_CIPHERSUITES.add("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
         TLS_CIPHERSUITES.add("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
         TLS_CIPHERSUITES.add("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
     }
 }