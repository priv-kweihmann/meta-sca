SRC_URI += "https://proxy.golang.org/github.com/miekg/pkcs11/@v/v1.1.1.zip;srcoutput=github.com/miekg/pkcs11;srcinput=github.com/miekg/pkcs11@v1.1.1;downloadfilename=github-com-miekg-pkcs11-1.1.1.zip;name=github-com-miekg-pkcs11"
SRC_URI[github-com-miekg-pkcs11.sha256sum] = "81cfc2922f7d5c59dc1e688d6247ec8dc35246d646ab27088847a232570c76e6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/miekg/pkcs11/LICENSE;md5=746b23f793d7aaacdeb34a1c4e7d103b \
"

GOSRC_INCLUDEGUARD += "github.com-miekg-pkcs11-sources.inc"

