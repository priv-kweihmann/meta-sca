SRC_URI += "https://proxy.golang.org/github.com/stretchr/testify/@v/v1.10.0.zip;srcoutput=github.com/stretchr/testify;srcinput=github.com/stretchr/testify@v1.10.0;downloadfilename=github-com-stretchr-testify-1.10.0.zip;name=github-com-stretchr-testify"
SRC_URI[github-com-stretchr-testify.sha256sum] = "36c87573527a97ce97fc15ce2a101e65e5ebb350db142d09f633580cb8d5c839"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/stretchr/testify/LICENSE;md5=188f01994659f3c0d310612333d2a26f \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-testify-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-davecgh-go-spew-sources.inc', '', 'github.com-davecgh-go-spew-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pmezard-go-difflib-sources.inc', '', 'github.com-pmezard-go-difflib-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-objx-sources.inc', '', 'github.com-stretchr-objx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v3-sources.inc', '', 'gopkg.in-yaml.v3-sources.inc', d)}
