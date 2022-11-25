SRC_URI += "https://proxy.golang.org/github.com/hashicorp/golang-lru/@v/v0.6.0.zip;srcoutput=github.com/hashicorp/golang-lru;srcinput=github.com/hashicorp/golang-lru@v0.6.0;downloadfilename=github-com-hashicorp-golang-lru-0.6.0.zip;name=github-com-hashicorp-golang-lru"
SRC_URI[github-com-hashicorp-golang-lru.sha256sum] = "75a21bee633745563dc3161386b2245fc126f882d2e5d2d97c0c6899511a5faf"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/golang-lru/LICENSE;md5=dc2f3ee49116a594755b22b853cc8b6b \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-golang-lru-sources.inc"

