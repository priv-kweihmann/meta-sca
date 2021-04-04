SRC_URI += "https://proxy.golang.org/github.com/nats-io/jwt/@v/v1.2.2.zip;srcoutput=github.com/nats-io/jwt;srcinput=github.com/nats-io/jwt@v1.2.2;downloadfilename=github-com-nats-io-jwt-1.2.2.zip;name=github-com-nats-io-jwt"
SRC_URI[github-com-nats-io-jwt.sha256sum] = "7ee85dd13b6084cd24584f51b39cc820f3a431e1f97fb075894d72645358d675"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/nats-io/jwt/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-nats-io-jwt-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nats-io-nkeys-sources.inc', '', 'github.com-nats-io-nkeys-sources.inc', d)}
