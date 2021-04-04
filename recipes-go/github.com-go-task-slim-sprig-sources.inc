SRC_URI += "https://proxy.golang.org/github.com/go-task/slim-sprig/@v/v2.20.0+incompatible.zip;srcoutput=github.com/go-task/slim-sprig;srcinput=github.com/go-task/slim-sprig@v2.20.0+incompatible;downloadfilename=github-com-go-task-slim-sprig-2.20.0+incompatible.zip;name=github-com-go-task-slim-sprig"
SRC_URI[github-com-go-task-slim-sprig.sha256sum] = "418f33fa714cc3ad4ab3db1df23bc525198f72b1885554dfa817720fdcf97751"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-task/slim-sprig/LICENSE.txt;md5=652ef7590e03427663a9b9d1318a9fbb \
"

GOSRC_INCLUDEGUARD += "github.com-go-task-slim-sprig-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-uuid-sources.inc', '', 'github.com-google-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-huandu-xstrings-sources.inc', '', 'github.com-huandu-xstrings-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-imdario-mergo-sources.inc', '', 'github.com-imdario-mergo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-goutils-sources.inc', '', 'github.com-masterminds-goutils-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-semver-sources.inc', '', 'github.com-masterminds-semver-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
