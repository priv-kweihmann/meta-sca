SRC_URI += "https://proxy.golang.org/github.com/hashicorp/go-immutable-radix/@v/v1.3.0.zip;srcoutput=github.com/hashicorp/go-immutable-radix;srcinput=github.com/hashicorp/go-immutable-radix@v1.3.0;downloadfilename=github-com-hashicorp-go-immutable-radix-1.3.0.zip;name=github-com-hashicorp-go-immutable-radix"
SRC_URI[github-com-hashicorp-go-immutable-radix.sha256sum] = "99e880764d9796088e9f8b348bd6c1d68354a4f9f28a757496c83c0f51eb8e49"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/go-immutable-radix/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-go-immutable-radix-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-golang-lru-sources.inc', '', 'github.com-hashicorp-golang-lru-sources.inc', d)}
