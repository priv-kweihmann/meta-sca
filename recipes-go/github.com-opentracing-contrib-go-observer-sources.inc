SRC_URI += "https://proxy.golang.org/github.com/opentracing-contrib/go-observer/@v/v0.0.0-20170622124052-a52f23424492.zip;srcoutput=github.com/opentracing-contrib/go-observer;srcinput=github.com/opentracing-contrib/go-observer@v0.0.0-20170622124052-a52f23424492;downloadfilename=github-com-opentracing-contrib-go-observer-0.0.0-20170622124052-a52f23424492.zip;name=github-com-opentracing-contrib-go-observer"
SRC_URI[github-com-opentracing-contrib-go-observer.sha256sum] = "50023eee1ef04412410f43d8b5dcf3ef481c0fc39067add27799654705fa84b2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/opentracing-contrib/go-observer/LICENSE;md5=3e430fab283e174e0a070638207cf45f \
"

GOSRC_INCLUDEGUARD += "github.com-opentracing-contrib-go-observer-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-opentracing-go-sources.inc', '', 'github.com-opentracing-opentracing-go-sources.inc', d)}
