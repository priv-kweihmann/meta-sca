SRC_URI += "https://proxy.golang.org/github.com/hashicorp/yamux/@v/v0.0.0-20210826001029-26ff87cf9493.zip;srcoutput=github.com/hashicorp/yamux;srcinput=github.com/hashicorp/yamux@v0.0.0-20210826001029-26ff87cf9493;downloadfilename=github-com-hashicorp-yamux-0.0.0-20210826001029-26ff87cf9493.zip;name=github-com-hashicorp-yamux"
SRC_URI[github-com-hashicorp-yamux.sha256sum] = "faa3854fadf87c31ab52ed01f251fd01a7c8a41fe72371d9774ae7e8f5d54bae"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/yamux/LICENSE;md5=2dd1a9ecf92cd5617f128808f9b85b44 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-yamux-sources.inc"

