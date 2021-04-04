SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/fizz/@v/v1.13.0.zip;srcoutput=github.com/gobuffalo/fizz;srcinput=github.com/gobuffalo/fizz@v1.13.0;downloadfilename=github-com-gobuffalo-fizz-1.13.0.zip;name=github-com-gobuffalo-fizz"
SRC_URI[github-com-gobuffalo-fizz.sha256sum] = "e88d54ccfd955684adde91e58751f50c56696369c0d2023ce18fbdaaf465654e"
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
