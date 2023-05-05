SRC_URI += "https://proxy.golang.org/github.com/jackmordaunt/icns/v2/@v/v2.2.6.zip;srcoutput=github.com/jackmordaunt/icns/v2;srcinput=github.com/jackmordaunt/icns/v2@v2.2.6;downloadfilename=github-com-jackmordaunt-icns-v2-2.2.6.zip;name=github-com-jackmordaunt-icns-v2"
SRC_URI[github-com-jackmordaunt-icns-v2.sha256sum] = "07a96e8a31da3a329d569c8961bec75cd5ad6b0da12f682ef28f1a107a67cc0b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackmordaunt/icns/v2/LICENSE;md5=1701a53863d278c9a209cb81acb77e79 \
"

GOSRC_INCLUDEGUARD += "github.com-jackmordaunt-icns-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nfnt-resize-sources.inc', '', 'github.com-nfnt-resize-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-afero-sources.inc', '', 'github.com-spf13-afero-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-pflag-sources.inc', '', 'github.com-spf13-pflag-sources.inc', d)}
