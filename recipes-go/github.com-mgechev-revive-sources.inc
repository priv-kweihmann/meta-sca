SRC_URI += "https://proxy.golang.org/github.com/mgechev/revive/@v/v1.3.1.zip;srcoutput=github.com/mgechev/revive;srcinput=github.com/mgechev/revive@v1.3.1;downloadfilename=github-com-mgechev-revive-1.3.1.zip;name=github-com-mgechev-revive"
SRC_URI[github-com-mgechev-revive.sha256sum] = "f9f142bf1ad07d09d3d31e856f0baa342208ca1e1e0715af4dbf6a51a9727d1d"

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
