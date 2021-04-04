SRC_URI += "https://proxy.golang.org/github.com/markbates/refresh/@v/v1.11.1.zip;srcoutput=github.com/markbates/refresh;srcinput=github.com/markbates/refresh@v1.11.1;downloadfilename=github-com-markbates-refresh-1.11.1.zip;name=github-com-markbates-refresh"
SRC_URI[github-com-markbates-refresh.sha256sum] = "e0aa9b2c7cee58985901bd993aebb67b793cbfc59d3f37ff638b3a237da337a1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/markbates/refresh/LICENSE;md5=88f05a89e72d0405a3fc01af7f522532 \
"

GOSRC_INCLUDEGUARD += "github.com-markbates-refresh-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fsnotify-fsnotify-sources.inc', '', 'github.com-fsnotify-fsnotify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-go-homedir-sources.inc', '', 'github.com-mitchellh-go-homedir-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cobra-sources.inc', '', 'github.com-spf13-cobra-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
