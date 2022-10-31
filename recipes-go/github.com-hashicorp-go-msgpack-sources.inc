SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-msgpack/@v/v1.1.6.zip;srcoutput=github.com/hashicorp/go-msgpack;srcinput=github.com/hashicorp/go-msgpack@v1.1.6;downloadfilename=github-com-hashicorp-go-msgpack-1.1.6.zip;name=github-com-hashicorp-go-msgpack"
SRC_URI[github-com-hashicorp-go-msgpack.sha256sum] = "4fe3a5a30d30ca366c4d0a97cf07d5aa32c0dc2ed0e2183b6d7a9eb571dc5179"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-msgpack/LICENSE;md5=3f4c936a1236aa7f17ca2a0b0ce4bfdd \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-msgpack-sources.inc"

