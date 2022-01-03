SRC_URI += "git://github.com/Masterminds/sprig;nobranch=1;protocol=https;srcinput=github.com/Masterminds/sprig;srcoutput=github.com/Masterminds/sprig;destsuffix=github.com/Masterminds/sprig;name=github-com-masterminds-sprig"
SRCREV_github-com-masterminds-sprig = "3ac42c7bc5e4be6aa534e036fb19dde4a996da2e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Masterminds/sprig/LICENSE.txt;md5=4ed8d725bea5f035fcea1ab05a767f78 \
"

GOSRC_INCLUDEGUARD += "github.com-masterminds-sprig-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-uuid-sources.inc', '', 'github.com-google-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-huandu-xstrings-sources.inc', '', 'github.com-huandu-xstrings-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-imdario-mergo-sources.inc', '', 'github.com-imdario-mergo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-goutils-sources.inc', '', 'github.com-masterminds-goutils-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-semver-v3-sources.inc', '', 'github.com-masterminds-semver-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-copystructure-sources.inc', '', 'github.com-mitchellh-copystructure-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-shopspring-decimal-sources.inc', '', 'github.com-shopspring-decimal-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cast-sources.inc', '', 'github.com-spf13-cast-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
