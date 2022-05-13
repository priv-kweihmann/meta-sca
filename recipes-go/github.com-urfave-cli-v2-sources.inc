SRC_URI += "https://proxy.golang.org/github.com/urfave/cli/v2/@v/v2.6.0.zip;srcoutput=github.com/urfave/cli/v2;srcinput=github.com/urfave/cli/v2@v2.6.0;downloadfilename=github-com-urfave-cli-v2-2.6.0.zip;name=github-com-urfave-cli-v2"
SRC_URI[github-com-urfave-cli-v2.sha256sum] = "645a2b9d0ea8fd6c272ff3302d80e61863ef08d0826ec8565967b0af39ff0268"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/urfave/cli/v2/LICENSE;md5=51992c80b05795f59c22028d39f9b74c \
"

GOSRC_INCLUDEGUARD += "github.com-urfave-cli-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cpuguy83-go-md2man-v2-sources.inc', '', 'github.com-cpuguy83-go-md2man-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
