SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/validate/v3/@v/v3.3.0.zip;srcoutput=github.com/gobuffalo/validate/v3;srcinput=github.com/gobuffalo/validate/v3@v3.3.0;downloadfilename=github-com-gobuffalo-validate-v3-3.3.0.zip;name=github-com-gobuffalo-validate-v3"
SRC_URI[github-com-gobuffalo-validate-v3.sha256sum] = "d80652527a2f159725b8e8be58d6ca8a6149ffb98a793caac4390c414d08611b"

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
