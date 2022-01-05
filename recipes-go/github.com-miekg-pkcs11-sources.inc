SRC_URI += "https://proxy.golang.org/github.com/miekg/pkcs11/@v/v1.1.0.zip;srcoutput=github.com/miekg/pkcs11;srcinput=github.com/miekg/pkcs11@v1.1.0;downloadfilename=github-com-miekg-pkcs11-1.1.0.zip;name=github-com-miekg-pkcs11"
SRC_URI[github-com-miekg-pkcs11.sha256sum] = "2794d3cd41e140cbc96c80b65bce548e35bc6a795a68e92869043c729f10208b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/miekg/pkcs11/LICENSE;md5=746b23f793d7aaacdeb34a1c4e7d103b \
"

GOSRC_INCLUDEGUARD += "github.com-miekg-pkcs11-sources.inc"

