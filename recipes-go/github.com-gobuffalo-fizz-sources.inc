SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/fizz/@v/v1.14.0.zip;srcoutput=github.com/gobuffalo/fizz;srcinput=github.com/gobuffalo/fizz@v1.14.0;downloadfilename=github-com-gobuffalo-fizz-1.14.0.zip;name=github-com-gobuffalo-fizz"
SRC_URI[github-com-gobuffalo-fizz.sha256sum] = "3ea95dd0fc56f18e74051a601f4728850f0759edbf78da5cf1d3febf0b0ff70a"
GOSRC_REMOVEDIRS += "github.com/gobuffalo/fizz/internal/e2e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/fizz/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-fizz-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-plush-v4-sources.inc', '', 'github.com-gobuffalo-plush-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kballard-go-shellquote-sources.inc', '', 'github.com-kballard-go-shellquote-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-semver-v3-sources.inc', '', 'github.com-masterminds-semver-v3-sources.inc', d)}
