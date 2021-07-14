SRC_URI += "https://proxy.golang.org/github.com/mgechev/revive/@v/v1.0.9.zip;srcoutput=github.com/mgechev/revive;srcinput=github.com/mgechev/revive@v1.0.9;downloadfilename=github-com-mgechev-revive-1.0.9.zip;name=github-com-mgechev-revive"
SRC_URI[github-com-mgechev-revive.sha256sum] = "f1aa5a972e3fc06874d347043f4525600c4468ae23c04d4f2939796178f775d8"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mgechev/revive/LICENSE;md5=6898b1ee52bce3bd296aba3dff3fffb0 \
"

GOSRC_INCLUDEGUARD += "github.com-mgechev-revive-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-chavacava-garif-sources.inc', '', 'github.com-chavacava-garif-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-structtag-sources.inc', '', 'github.com-fatih-structtag-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mgechev-dots-sources.inc', '', 'github.com-mgechev-dots-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-go-homedir-sources.inc', '', 'github.com-mitchellh-go-homedir-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-olekukonko-tablewriter-sources.inc', '', 'github.com-olekukonko-tablewriter-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
