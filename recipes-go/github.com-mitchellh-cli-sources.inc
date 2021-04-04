SRC_URI += "https://proxy.golang.org/github.com/mitchellh/cli/@v/v1.1.2.zip;srcoutput=github.com/mitchellh/cli;srcinput=github.com/mitchellh/cli@v1.1.2;downloadfilename=github-com-mitchellh-cli-1.1.2.zip;name=github-com-mitchellh-cli"
SRC_URI[github-com-mitchellh-cli.sha256sum] = "38cf52dd2c968e946f3364c8dcf68db56da6ccfd4b78d63b044835c3d38c2770"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/cli/LICENSE;md5=b278a92d2c1509760384428817710378 \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-cli-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-armon-go-radix-sources.inc', '', 'github.com-armon-go-radix-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-bgentry-speakeasy-sources.inc', '', 'github.com-bgentry-speakeasy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-sprig-sources.inc', '', 'github.com-masterminds-sprig-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-posener-complete-sources.inc', '', 'github.com-posener-complete-sources.inc', d)}
