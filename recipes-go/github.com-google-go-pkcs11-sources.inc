SRC_URI += "https://proxy.golang.org/github.com/google/go-pkcs11/@v/v0.2.0.zip;srcoutput=github.com/google/go-pkcs11;srcinput=github.com/google/go-pkcs11@v0.2.0;downloadfilename=github-com-google-go-pkcs11-0.2.0.zip;name=github-com-google-go-pkcs11"
SRC_URI[github-com-google-go-pkcs11.sha256sum] = "64e052c2df9cc1b825295d055e70bf4a38bbfca2e1065b3117068d93476da80d"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/go-pkcs11/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-go-pkcs11-sources.inc"

