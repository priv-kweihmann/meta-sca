SRC_URI += "https://proxy.golang.org/github.com/hashicorp/yamux/@v/v0.0.0-20211028200310-0bc27b27de87.zip;srcoutput=github.com/hashicorp/yamux;srcinput=github.com/hashicorp/yamux@v0.0.0-20211028200310-0bc27b27de87;downloadfilename=github-com-hashicorp-yamux-0.0.0-20211028200310-0bc27b27de87.zip;name=github-com-hashicorp-yamux"
SRC_URI[github-com-hashicorp-yamux.sha256sum] = "67a57ba487180869ae5fd84c9937ec6fde472d7d30685c2f4e369c5682a1bd98"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/yamux/LICENSE;md5=2dd1a9ecf92cd5617f128808f9b85b44 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-yamux-sources.inc"

