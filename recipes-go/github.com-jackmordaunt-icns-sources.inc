SRC_URI += "https://proxy.golang.org/github.com/jackmordaunt/icns/@v/v1.0.0.zip;srcoutput=github.com/jackmordaunt/icns;srcinput=github.com/jackmordaunt/icns@v1.0.0;downloadfilename=github-com-jackmordaunt-icns-1.0.0.zip;name=github-com-jackmordaunt-icns"
SRC_URI[github-com-jackmordaunt-icns.sha256sum] = "c40856d2a0db0aefad3f38a93df8ecd10b6ec4e2fa22057230bfb69ce7a23d63"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackmordaunt/icns/LICENSE;md5=1701a53863d278c9a209cb81acb77e79 \
"

GOSRC_INCLUDEGUARD += "github.com-jackmordaunt-icns-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nfnt-resize-sources.inc', '', 'github.com-nfnt-resize-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-afero-sources.inc', '', 'github.com-spf13-afero-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-pflag-sources.inc', '', 'github.com-spf13-pflag-sources.inc', d)}
