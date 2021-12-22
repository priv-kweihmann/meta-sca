SRC_URI += "https://proxy.golang.org/github.com/briandowns/spinner/@v/v1.18.0.zip;srcoutput=github.com/briandowns/spinner;srcinput=github.com/briandowns/spinner@v1.18.0;downloadfilename=github-com-briandowns-spinner-1.18.0.zip;name=github-com-briandowns-spinner"
SRC_URI[github-com-briandowns-spinner.sha256sum] = "52cb45fe69d635b33b32b10d103e51b41cee5d56ad79931b37ca5bbe52da01b5"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/briandowns/spinner/LICENSE;md5=5335066555b14d832335aa4660d6c376 \
"

GOSRC_INCLUDEGUARD += "github.com-briandowns-spinner-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
