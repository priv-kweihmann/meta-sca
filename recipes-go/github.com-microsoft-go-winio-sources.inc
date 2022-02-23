SRC_URI += "git://github.com/microsoft/go-winio;nobranch=1;protocol=https;srcinput=github.com/Microsoft/go-winio;srcoutput=github.com/Microsoft/go-winio;destsuffix=github.com/Microsoft/go-winio;name=github-com-microsoft-go-winio"
SRCREV_github-com-microsoft-go-winio = "dfd7da8f92a382999d77b5d9cfe8cc6bec1894c6"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Microsoft/go-winio/LICENSE;md5=69205ff73858f2c22b2ca135b557e8ef \
"

GOSRC_INCLUDEGUARD += "github.com-microsoft-go-winio-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
