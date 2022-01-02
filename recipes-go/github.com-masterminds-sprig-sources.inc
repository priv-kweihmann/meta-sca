SRC_URI += "git://github.com/Masterminds/sprig;nobranch=1;protocol=https;srcinput=github.com/Masterminds/sprig;srcoutput=github.com/Masterminds/sprig;destsuffix=github.com/Masterminds/sprig;name=github-com-masterminds-sprig"
SRCREV_github-com-masterminds-sprig = "e4c0945838d570720d876a6ad9b4568ed32317b4"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Masterminds/sprig/LICENSE.txt;md5=652ef7590e03427663a9b9d1318a9fbb \
"

GOSRC_INCLUDEGUARD += "github.com-masterminds-sprig-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-uuid-sources.inc', '', 'github.com-google-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-huandu-xstrings-sources.inc', '', 'github.com-huandu-xstrings-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-imdario-mergo-sources.inc', '', 'github.com-imdario-mergo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-goutils-sources.inc', '', 'github.com-masterminds-goutils-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-semver-sources.inc', '', 'github.com-masterminds-semver-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-copystructure-sources.inc', '', 'github.com-mitchellh-copystructure-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
