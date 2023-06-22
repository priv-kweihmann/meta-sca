SRC_URI += "https://proxy.golang.org/github.com/urfave/cli/v2/@v/v2.25.7.zip;srcoutput=github.com/urfave/cli/v2;srcinput=github.com/urfave/cli/v2@v2.25.7;downloadfilename=github-com-urfave-cli-v2-2.25.7.zip;name=github-com-urfave-cli-v2"
SRC_URI[github-com-urfave-cli-v2.sha256sum] = "10941b24689d7c953a78b6d196a03e04274e012d27d4f297fe844cf58221a86c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/urfave/cli/v2/LICENSE;md5=51992c80b05795f59c22028d39f9b74c \
"

GOSRC_INCLUDEGUARD += "github.com-urfave-cli-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cpuguy83-go-md2man-v2-sources.inc', '', 'github.com-cpuguy83-go-md2man-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xrash-smetrics-sources.inc', '', 'github.com-xrash-smetrics-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v3-sources.inc', '', 'gopkg.in-yaml.v3-sources.inc', d)}
