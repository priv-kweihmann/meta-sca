SRC_URI += "https://proxy.golang.org/github.com/miekg/pkcs11/@v/v1.0.3.zip;srcoutput=github.com/miekg/pkcs11;srcinput=github.com/miekg/pkcs11@v1.0.3;downloadfilename=github-com-miekg-pkcs11-1.0.3.zip;name=github-com-miekg-pkcs11"
SRC_URI[github-com-miekg-pkcs11.sha256sum] = "d06d401db6104517f860ebd4b523a7219fcf9cd16d7f54c930a62894f2067073"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/miekg/pkcs11/LICENSE;md5=746b23f793d7aaacdeb34a1c4e7d103b \
"

GOSRC_INCLUDEGUARD += "github.com-miekg-pkcs11-sources.inc"

