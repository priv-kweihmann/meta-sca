SRC_URI += "https://proxy.golang.org/github.com/urfave/cli/@v/v1.22.7.zip;srcoutput=github.com/urfave/cli;srcinput=github.com/urfave/cli@v1.22.7;downloadfilename=github-com-urfave-cli-1.22.7.zip;name=github-com-urfave-cli"
SRC_URI[github-com-urfave-cli.sha256sum] = "f3e15b3e19750262f51f15072c4e957e51663f8a7d90920d7488c62edf3f6542"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/urfave/cli/LICENSE;md5=c542707ca9fc0b7802407ba62310bd8f \
"

GOSRC_INCLUDEGUARD += "github.com-urfave-cli-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cpuguy83-go-md2man-v2-sources.inc', '', 'github.com-cpuguy83-go-md2man-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
