SRC_URI += "https://proxy.golang.org/github.com/grpc-ecosystem/grpc-gateway/@v/v1.16.0.zip;srcoutput=github.com/grpc-ecosystem/grpc-gateway;srcinput=github.com/grpc-ecosystem/grpc-gateway@v1.16.0;downloadfilename=github-com-grpc-ecosystem-grpc-gateway-1.16.0.zip;name=github-com-grpc-ecosystem-grpc-gateway"
SRC_URI[github-com-grpc-ecosystem-grpc-gateway.sha256sum] = "377b03aef288b34ed894449d3ddba40d525dd7fb55de6e79045cdf499e7fe565"
GOSRC_REMOVEDIRS += "github.com/grpc-ecosystem/grpc-gateway/examples"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/grpc-ecosystem/grpc-gateway/LICENSE.txt;md5=c510a2a01572b82d27f28fd4d02ca318 \
    file://src/github.com/grpc-ecosystem/grpc-gateway/internal/casing/LICENSE.md;md5=939cce1ec101726fa754e698ac871622 \
    file://src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-grpc-ecosystem-grpc-gateway-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-antihax-optional-sources.inc', '', 'github.com-antihax-optional-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ghodss-yaml-sources.inc', '', 'github.com-ghodss-yaml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-glog-sources.inc', '', 'github.com-golang-glog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rogpeppe-fastuuid-sources.inc', '', 'github.com-rogpeppe-fastuuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-oauth2-sources.inc', '', 'golang.org-x-oauth2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-xerrors-sources.inc', '', 'golang.org-x-xerrors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
