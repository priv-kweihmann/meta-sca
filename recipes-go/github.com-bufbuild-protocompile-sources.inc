SRC_URI += "https://proxy.golang.org/github.com/bufbuild/protocompile/@v/v0.3.0.zip;srcoutput=github.com/bufbuild/protocompile;srcinput=github.com/bufbuild/protocompile@v0.3.0;downloadfilename=github-com-bufbuild-protocompile-0.3.0.zip;name=github-com-bufbuild-protocompile"
SRC_URI[github-com-bufbuild-protocompile.sha256sum] = "94681e2e3e65eda22cc0f0957f0f04f369b19631ae5cbfe97626234000629541"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/bufbuild/protocompile/LICENSE;md5=4192ff66af8e4a6b4fbf63f27fdac165 \
"

GOSRC_INCLUDEGUARD += "github.com-bufbuild-protocompile-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
