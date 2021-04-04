SRC_URI += "https://proxy.golang.org/github.com/antihax/optional/@v/v1.0.0.zip;srcoutput=github.com/antihax/optional;srcinput=github.com/antihax/optional@v1.0.0;downloadfilename=github-com-antihax-optional-1.0.0.zip;name=github-com-antihax-optional"
SRC_URI[github-com-antihax-optional.sha256sum] = "15ab4d41bdbb72ee0ac63db616cdefc7671c79e13d0f73b58355a6a88219c97f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/antihax/optional/LICENSE;md5=e3e3a6e5e55331448f6e68942fc1f83a \
"

GOSRC_INCLUDEGUARD += "github.com-antihax-optional-sources.inc"

