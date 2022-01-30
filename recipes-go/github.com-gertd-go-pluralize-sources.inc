SRC_URI += "https://proxy.golang.org/github.com/gertd/go-pluralize/@v/v0.2.0.zip;srcoutput=github.com/gertd/go-pluralize;srcinput=github.com/gertd/go-pluralize@v0.2.0;downloadfilename=github-com-gertd-go-pluralize-0.2.0.zip;name=github-com-gertd-go-pluralize"
SRC_URI[github-com-gertd-go-pluralize.sha256sum] = "e4b8b7642b0a1d1ee6869bc7ff9d698ee564be9e6fc6dcc450193ebd660851a6"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gertd/go-pluralize/LICENSE;md5=7e0362bb72180462b3e08e0cca202fc9 \
"

GOSRC_INCLUDEGUARD += "github.com-gertd-go-pluralize-sources.inc"

