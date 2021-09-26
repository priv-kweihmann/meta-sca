SRC_URI += "https://proxy.golang.org/github.com/markbates/refresh/@v/v1.12.0.zip;srcoutput=github.com/markbates/refresh;srcinput=github.com/markbates/refresh@v1.12.0;downloadfilename=github-com-markbates-refresh-1.12.0.zip;name=github-com-markbates-refresh"
SRC_URI[github-com-markbates-refresh.sha256sum] = "5a9c0cc18da6787d15b1094ad0169dad3b2e6650e4a9ff360263347e80bd6e11"

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
