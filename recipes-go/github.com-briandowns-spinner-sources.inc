SRC_URI += "https://proxy.golang.org/github.com/briandowns/spinner/@v/v1.23.2.zip;srcoutput=github.com/briandowns/spinner;srcinput=github.com/briandowns/spinner@v1.23.2;downloadfilename=github-com-briandowns-spinner-1.23.2.zip;name=github-com-briandowns-spinner"
SRC_URI[github-com-briandowns-spinner.sha256sum] = "d4e47d6807f7fc3584afe8e62e0bbd4e9e0bcb923715baa7b6beab5c8271fcb1"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://github.com/briandowns/spinner/LICENSE;md5=5335066555b14d832335aa4660d6c376 \
"

GOSRC_INCLUDEGUARD += "github.com-briandowns-spinner-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
