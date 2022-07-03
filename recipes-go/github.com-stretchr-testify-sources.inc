SRC_URI += "https://proxy.golang.org/github.com/stretchr/testify/@v/v1.8.0.zip;srcoutput=github.com/stretchr/testify;srcinput=github.com/stretchr/testify@v1.8.0;downloadfilename=github-com-stretchr-testify-1.8.0.zip;name=github-com-stretchr-testify"
SRC_URI[github-com-stretchr-testify.sha256sum] = "d880adf449449120b459a2220f539c69648fd797ded5b745cf3add60ec84081e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/stretchr/testify/LICENSE;md5=188f01994659f3c0d310612333d2a26f \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-testify-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-davecgh-go-spew-sources.inc', '', 'github.com-davecgh-go-spew-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pmezard-go-difflib-sources.inc', '', 'github.com-pmezard-go-difflib-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-objx-sources.inc', '', 'github.com-stretchr-objx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v3-sources.inc', '', 'gopkg.in-yaml.v3-sources.inc', d)}
