SRC_URI += "https://proxy.golang.org/github.com/briandowns/spinner/@v/v1.20.0.zip;srcoutput=github.com/briandowns/spinner;srcinput=github.com/briandowns/spinner@v1.20.0;downloadfilename=github-com-briandowns-spinner-1.20.0.zip;name=github-com-briandowns-spinner"
SRC_URI[github-com-briandowns-spinner.sha256sum] = "e00a5c3676d9ea45592d9428d2559728c20fc7a0a152343e5ccb99c912a00bb2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/briandowns/spinner/LICENSE;md5=5335066555b14d832335aa4660d6c376 \
"

GOSRC_INCLUDEGUARD += "github.com-briandowns-spinner-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
