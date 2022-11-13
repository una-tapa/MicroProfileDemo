# JJUG Fall 2022 デモ

https://start.microprofile.io/　からダウンロードしたJWT Authのデモを少し変更して、JWT トークンでの認証認可の様子を試した時のものです。

Quarkusのデモからは、`TestSecureController .java`を、OpenLibertyのデモからは、`ProtectedController．java`を変更しました。

またOpenLibertyのserver.xmlでポートを`9080`から`8180`に変更し、Quarkusのサービスaと通信できるようにしています。


