SRC_URI += "https://proxy.golang.org/github.com/stretchr/testify/@v/v1.7.1.zip;srcoutput=github.com/stretchr/testify;srcinput=github.com/stretchr/testify@v1.7.1;downloadfilename=github-com-stretchr-testify-1.7.1.zip;name=github-com-stretchr-testify"
SRC_URI[github-com-stretchr-testify.sha256sum] = "d78938d7c60cb8cb6810f7fd5c2f7f7ff62091e483ca3610af69c3920011dc44"

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
