SRC_URI += "https://proxy.golang.org/github.com/googleapis/gax-go/v2/@v/v2.5.1.zip;srcoutput=github.com/googleapis/gax-go/v2;srcinput=github.com/googleapis/gax-go/v2@v2.5.1;downloadfilename=github-com-googleapis-gax-go-v2-2.5.1.zip;name=github-com-googleapis-gax-go-v2"
SRC_URI[github-com-googleapis-gax-go-v2.sha256sum] = "4becf7aa06d4f4197580a5914f2e44bb9e1f49c99707109ea0a16dae8ed5907f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/googleapis/gax-go/v2/LICENSE;md5=0dd48ae8103725bd7b401261520cdfbb \
"

GOSRC_INCLUDEGUARD += "github.com-googleapis-gax-go-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
