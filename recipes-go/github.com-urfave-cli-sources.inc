SRC_URI += "https://proxy.golang.org/github.com/urfave/cli/@v/v1.22.17.zip;srcoutput=github.com/urfave/cli;srcinput=github.com/urfave/cli@v1.22.17;downloadfilename=github-com-urfave-cli-1.22.17.zip;name=github-com-urfave-cli"
SRC_URI[github-com-urfave-cli.sha256sum] = "eb2629ff4d93a527036f0ebb57cf67caa10e97fdd9181740f8877936528bf6a9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/urfave/cli/LICENSE;md5=75d9e324acacf92aca82397b81c225b0 \
"

GOSRC_INCLUDEGUARD += "github.com-urfave-cli-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cpuguy83-go-md2man-v2-sources.inc', '', 'github.com-cpuguy83-go-md2man-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
