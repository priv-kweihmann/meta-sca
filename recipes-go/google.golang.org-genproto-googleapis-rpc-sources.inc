SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/googleapis/rpc/@v/v0.0.0-20230530153820-e85fd2cbaebc.zip;srcoutput=google.golang.org/genproto/googleapis/rpc;srcinput=google.golang.org/genproto/googleapis/rpc@v0.0.0-20230530153820-e85fd2cbaebc;downloadfilename=google-golang-org-genproto-googleapis-rpc-0.0.0-20230530153820-e85fd2cbaebc.zip;name=google-golang-org-genproto-googleapis-rpc"
SRC_URI[google-golang-org-genproto-googleapis-rpc.sha256sum] = "c0628dd525759b5ed422882cf9db83b83ad5b5f5e2a78f33e5d427781d8b3e07"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/genproto/googleapis/rpc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-genproto-googleapis-rpc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
