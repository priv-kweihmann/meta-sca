SRC_URI_append = " https://proxy.golang.org/github.com/dgrijalva/jwt-go/@v/v3.2.0+incompatible.zip;srcoutput=github.com/dgrijalva/jwt-go;srcinput=github.com/dgrijalva/jwt-go@v3.2.0+incompatible;downloadfilename=github-com-dgrijalva-jwt-go-3.2.0+incompatible.zip;name=github-com-dgrijalva-jwt-go"
SRC_URI[github-com-dgrijalva-jwt-go.sha256sum] = "26b028eb2d9ee3aef26a96d6790e101f4088ef901008ebab17096966bf6522ad"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/dgrijalva/jwt-go/LICENSE;md5=276f2f3ba3749d25f6a6f5fb852d462e \
"
