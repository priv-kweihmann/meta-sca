SRC_URI += "https://proxy.golang.org/github.com/urfave/cli/@v/v1.22.9.zip;srcoutput=github.com/urfave/cli;srcinput=github.com/urfave/cli@v1.22.9;downloadfilename=github-com-urfave-cli-1.22.9.zip;name=github-com-urfave-cli"
SRC_URI[github-com-urfave-cli.sha256sum] = "2fa8fa1cd0472a28b5d8038b9790c3c3d9b1a9c46e4c2cb339846b81340f3114"

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
