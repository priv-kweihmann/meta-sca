SRC_URI += "https://proxy.golang.org/github.com/urfave/cli/@v/v1.22.13.zip;srcoutput=github.com/urfave/cli;srcinput=github.com/urfave/cli@v1.22.13;downloadfilename=github-com-urfave-cli-1.22.13.zip;name=github-com-urfave-cli"
SRC_URI[github-com-urfave-cli.sha256sum] = "52277cf2e31f42152746babee3d51bf8df674cbf22e4e0c6c55cc87115284361"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/urfave/cli/LICENSE;md5=75d9e324acacf92aca82397b81c225b0 \
"

GOSRC_INCLUDEGUARD += "github.com-urfave-cli-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cpuguy83-go-md2man-v2-sources.inc', '', 'github.com-cpuguy83-go-md2man-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
