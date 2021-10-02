SRC_URI += "https://proxy.golang.org/github.com/xdg-go/pbkdf2/@v/v1.0.0.zip;srcoutput=github.com/xdg-go/pbkdf2;srcinput=github.com/xdg-go/pbkdf2@v1.0.0;downloadfilename=github-com-xdg-go-pbkdf2-1.0.0.zip;name=github-com-xdg-go-pbkdf2"
SRC_URI[github-com-xdg-go-pbkdf2.sha256sum] = "c22c803b9e69744dc4e33c5607652b87d61ee6926c54a67c6260b827e2040fec"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xdg-go/pbkdf2/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-xdg-go-pbkdf2-sources.inc"

