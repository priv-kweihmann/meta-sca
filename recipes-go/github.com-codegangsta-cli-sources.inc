SRC_URI += "https://proxy.golang.org/github.com/codegangsta/cli/@v/v1.22.5.zip;srcoutput=github.com/codegangsta/cli;srcinput=github.com/codegangsta/cli@v1.22.5;downloadfilename=github-com-codegangsta-cli-1.22.5.zip;name=github-com-codegangsta-cli"
SRC_URI[github-com-codegangsta-cli.sha256sum] = "c138d11e5e82c198232314a8addd5dc507f9a1fb46a331d352af810b6f9748b4"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/codegangsta/cli/LICENSE;md5=c542707ca9fc0b7802407ba62310bd8f \
"

GOSRC_INCLUDEGUARD += "github.com-codegangsta-cli-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cpuguy83-go-md2man-v2-sources.inc', '', 'github.com-cpuguy83-go-md2man-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-urfave-cli-sources.inc', '', 'github.com-urfave-cli-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
