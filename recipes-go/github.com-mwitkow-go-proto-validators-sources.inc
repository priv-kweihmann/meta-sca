SRC_URI += "https://proxy.golang.org/github.com/mwitkow/go-proto-validators/@v/v0.3.2.zip;srcoutput=github.com/mwitkow/go-proto-validators;srcinput=github.com/mwitkow/go-proto-validators@v0.3.2;downloadfilename=github-com-mwitkow-go-proto-validators-0.3.2.zip;name=github-com-mwitkow-go-proto-validators"
SRC_URI[github-com-mwitkow-go-proto-validators.sha256sum] = "68eb5beb818a44435ece07e88dada8c9bab8f5a4b70a3ca2dce5d5a3eb3421b0"
GOSRC_REMOVEDIRS += "github.com/mwitkow/go-proto-validators/test"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mwitkow/go-proto-validators/LICENSE.txt;md5=7ab5c73bb7e4679b16dd7c11b3559acf \
"

GOSRC_INCLUDEGUARD += "github.com-mwitkow-go-proto-validators-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gogo-protobuf-sources.inc', '', 'github.com-gogo-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
