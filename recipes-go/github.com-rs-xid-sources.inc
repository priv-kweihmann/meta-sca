SRC_URI += "https://proxy.golang.org/github.com/rs/xid/@v/v1.3.0.zip;srcoutput=github.com/rs/xid;srcinput=github.com/rs/xid@v1.3.0;downloadfilename=github-com-rs-xid-1.3.0.zip;name=github-com-rs-xid"
SRC_URI[github-com-rs-xid.sha256sum] = "809ed1d8845fe5d73f6973e9b7a33eefd786cc97b1aebe493243e420b7c89958"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rs/xid/LICENSE;md5=785017b3cd2e2cd7d8fdd30f36d67a93 \
"

GOSRC_INCLUDEGUARD += "github.com-rs-xid-sources.inc"

