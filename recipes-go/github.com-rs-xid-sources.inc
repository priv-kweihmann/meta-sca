SRC_URI += "https://proxy.golang.org/github.com/rs/xid/@v/v1.5.0.zip;srcoutput=github.com/rs/xid;srcinput=github.com/rs/xid@v1.5.0;downloadfilename=github-com-rs-xid-1.5.0.zip;name=github-com-rs-xid"
SRC_URI[github-com-rs-xid.sha256sum] = "331935097e01208709dd2c7425eee34d7f7ba75a6f2d65dce38319cb4a5707c2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rs/xid/LICENSE;md5=785017b3cd2e2cd7d8fdd30f36d67a93 \
"

GOSRC_INCLUDEGUARD += "github.com-rs-xid-sources.inc"

