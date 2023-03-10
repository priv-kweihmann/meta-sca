SRC_URI += "https://proxy.golang.org/github.com/bufbuild/protocompile/@v/v0.5.1.zip;srcoutput=github.com/bufbuild/protocompile;srcinput=github.com/bufbuild/protocompile@v0.5.1;downloadfilename=github-com-bufbuild-protocompile-0.5.1.zip;name=github-com-bufbuild-protocompile"
SRC_URI[github-com-bufbuild-protocompile.sha256sum] = "733b25c9a3d484be55ea77fc22f2b91814d1b5ff80a4dee9be6a171db92957b4"

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
