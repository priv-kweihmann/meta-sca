SRC_URI += "https://proxy.golang.org/github.com/microsoft/go-winio/@v/v0.5.0.zip;srcoutput=github.com/microsoft/go-winio;srcinput=github.com/microsoft/go-winio@v0.5.0;downloadfilename=github-com-microsoft-go-winio-0.5.0.zip;name=github-com-microsoft-go-winio"
SRC_URI[github-com-microsoft-go-winio.sha256sum] = "31679d311ecf539ac597998bc5cb852a797d8dbe210b92c434d4fb31bc091beb"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/microsoft/go-winio/LICENSE;md5=69205ff73858f2c22b2ca135b557e8ef \
"

GOSRC_INCLUDEGUARD += "github.com-microsoft-go-winio-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
