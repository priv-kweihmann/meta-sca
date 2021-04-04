SRC_URI += "https://github.com/Masterminds/sprig/archive/refs/tags/v2.22.0.zip;srcoutput=github.com/Masterminds/sprig;srcinput=sprig-2.22.0;downloadfilename=github-com-masterminds-sprig-2.22.0+incompatible.zip;name=github-com-masterminds-sprig"
SRC_URI[github-com-masterminds-sprig.sha256sum] = "2b98a62c67eb38e85673b7d02b17d504c7d48293a87c25b0c892c155cbeae8df"

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
