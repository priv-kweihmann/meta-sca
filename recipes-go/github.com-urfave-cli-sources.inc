SRC_URI += "https://proxy.golang.org/github.com/urfave/cli/@v/v1.22.8.zip;srcoutput=github.com/urfave/cli;srcinput=github.com/urfave/cli@v1.22.8;downloadfilename=github-com-urfave-cli-1.22.8.zip;name=github-com-urfave-cli"
SRC_URI[github-com-urfave-cli.sha256sum] = "344f281cd0a756d287471582f5197608c2a9eec022ebdb48133b2aaf55bf93a6"

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
