SRC_URI += "https://proxy.golang.org/github.com/briandowns/spinner/@v/v1.13.0.zip;srcoutput=github.com/briandowns/spinner;srcinput=github.com/briandowns/spinner@v1.13.0;downloadfilename=github-com-briandowns-spinner-1.13.0.zip;name=github-com-briandowns-spinner"
SRC_URI[github-com-briandowns-spinner.sha256sum] = "72260517aa41f73007ab4f9db8aa5854619686c38d448343a407cd5161c97044"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/briandowns/spinner/LICENSE;md5=5335066555b14d832335aa4660d6c376 \
"

GOSRC_INCLUDEGUARD += "github.com-briandowns-spinner-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
