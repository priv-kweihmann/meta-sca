SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-immutable-radix/@v/v1.3.1.zip;srcoutput=github.com/hashicorp/go-immutable-radix;srcinput=github.com/hashicorp/go-immutable-radix@v1.3.1;downloadfilename=github-com-hashicorp-go-immutable-radix-1.3.1.zip;name=github-com-hashicorp-go-immutable-radix"
SRC_URI[github-com-hashicorp-go-immutable-radix.sha256sum] = "47f3d79b57082d5db3f966547ad4de2a00544dfb362790fbf2cef1a161b4de3f"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-immutable-radix/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-immutable-radix-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-golang-lru-sources.inc', '', 'github.com-hashicorp-golang-lru-sources.inc', d)}
