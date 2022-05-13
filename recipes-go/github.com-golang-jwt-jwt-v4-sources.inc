SRC_URI += "https://proxy.golang.org/github.com/golang-jwt/jwt/v4/@v/v4.4.1.zip;srcoutput=github.com/golang-jwt/jwt/v4;srcinput=github.com/golang-jwt/jwt/v4@v4.4.1;downloadfilename=github-com-golang-jwt-jwt-v4-4.4.1.zip;name=github-com-golang-jwt-jwt-v4"
SRC_URI[github-com-golang-jwt-jwt-v4.sha256sum] = "8116e0956c5c961dfe790704621a55f65d963deec728744e3b17b7386da1a7dc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang-jwt/jwt/v4/LICENSE;md5=a21b708d8b320c68979c44ac9dba9b0d \
"

GOSRC_INCLUDEGUARD += "github.com-golang-jwt-jwt-v4-sources.inc"

