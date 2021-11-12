SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/validate/v3/@v/v3.3.1.zip;srcoutput=github.com/gobuffalo/validate/v3;srcinput=github.com/gobuffalo/validate/v3@v3.3.1;downloadfilename=github-com-gobuffalo-validate-v3-3.3.1.zip;name=github-com-gobuffalo-validate-v3"
SRC_URI[github-com-gobuffalo-validate-v3.sha256sum] = "0f3a44b03f21140995f1239a1debd6dc838f6144fa3562d5a63a826be4648622"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/validate/v3/LICENSE.txt;md5=a88e32e4ee4b6f57c7a398a4413cc687 \
    file://src/github.com/gobuffalo/validate/v3/LICENSE;md5=bd4a23f55845cb2efdbf894babad8329 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-validate-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gofrs-uuid-sources.inc', '', 'github.com-gofrs-uuid-sources.inc', d)}
