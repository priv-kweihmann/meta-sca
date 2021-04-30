SRC_URI += "https://proxy.golang.org/github.com/grpc-ecosystem/go-grpc-middleware/@v/v1.3.0.zip;srcoutput=github.com/grpc-ecosystem/go-grpc-middleware;srcinput=github.com/grpc-ecosystem/go-grpc-middleware@v1.3.0;downloadfilename=github-com-grpc-ecosystem-go-grpc-middleware-1.3.0.zip;name=github-com-grpc-ecosystem-go-grpc-middleware"
SRC_URI[github-com-grpc-ecosystem-go-grpc-middleware.sha256sum] = "081d63238be37f9f7fd2688642dc0f2c9c37374f99e7ac1d42c1f9184521723a"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/grpc-ecosystem/go-grpc-middleware/LICENSE;md5=7ab5c73bb7e4679b16dd7c11b3559acf \
"

GOSRC_INCLUDEGUARD += "github.com-grpc-ecosystem-go-grpc-middleware-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-kit-kit-sources.inc', '', 'github.com-go-kit-kit-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gogo-protobuf-sources.inc', '', 'github.com-gogo-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-opentracing-go-sources.inc', '', 'github.com-opentracing-opentracing-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-zap-sources.inc', '', 'go.uber.org-zap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
