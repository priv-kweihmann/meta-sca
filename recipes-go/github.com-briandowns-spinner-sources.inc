SRC_URI += "https://proxy.golang.org/github.com/briandowns/spinner/@v/v1.18.1.zip;srcoutput=github.com/briandowns/spinner;srcinput=github.com/briandowns/spinner@v1.18.1;downloadfilename=github-com-briandowns-spinner-1.18.1.zip;name=github-com-briandowns-spinner"
SRC_URI[github-com-briandowns-spinner.sha256sum] = "b004597c67b73fb48f2dba84342466bc36235dabbc26a9f11e14696ea53e89d2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/briandowns/spinner/LICENSE;md5=5335066555b14d832335aa4660d6c376 \
"

GOSRC_INCLUDEGUARD += "github.com-briandowns-spinner-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
