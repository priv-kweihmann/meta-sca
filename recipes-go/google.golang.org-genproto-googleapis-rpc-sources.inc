SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/googleapis/rpc/@v/v0.0.0-20230526203410-71b5a4ffd15e.zip;srcoutput=google.golang.org/genproto/googleapis/rpc;srcinput=google.golang.org/genproto/googleapis/rpc@v0.0.0-20230526203410-71b5a4ffd15e;downloadfilename=google-golang-org-genproto-googleapis-rpc-0.0.0-20230526203410-71b5a4ffd15e.zip;name=google-golang-org-genproto-googleapis-rpc"
SRC_URI[google-golang-org-genproto-googleapis-rpc.sha256sum] = "6f17d4a4309792c7e25d2f269d417bedea73ecbec855fe7624a3eea11d7c7e43"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/genproto/googleapis/rpc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-genproto-googleapis-rpc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
