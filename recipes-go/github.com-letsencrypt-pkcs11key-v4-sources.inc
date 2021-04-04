SRC_URI += "https://proxy.golang.org/github.com/letsencrypt/pkcs11key/v4/@v/v4.0.0.zip;srcoutput=github.com/letsencrypt/pkcs11key/v4;srcinput=github.com/letsencrypt/pkcs11key/v4@v4.0.0;downloadfilename=github-com-letsencrypt-pkcs11key-v4-4.0.0.zip;name=github-com-letsencrypt-pkcs11key-v4"
SRC_URI[github-com-letsencrypt-pkcs11key-v4.sha256sum] = "b8893408cd27d59fc36881c451d737a9ea7f938bb62fa48e7537dd02fc598964"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/letsencrypt/pkcs11key/v4/LICENSE;md5=fb0c3340290e8b57d69b9b578badd25d \
"

GOSRC_INCLUDEGUARD += "github.com-letsencrypt-pkcs11key-v4-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-miekg-pkcs11-sources.inc', '', 'github.com-miekg-pkcs11-sources.inc', d)}
