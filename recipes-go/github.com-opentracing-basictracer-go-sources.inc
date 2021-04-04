SRC_URI += "https://proxy.golang.org/github.com/opentracing/basictracer-go/@v/v1.1.0.zip;srcoutput=github.com/opentracing/basictracer-go;srcinput=github.com/opentracing/basictracer-go@v1.1.0;downloadfilename=github-com-opentracing-basictracer-go-1.1.0.zip;name=github-com-opentracing-basictracer-go"
SRC_URI[github-com-opentracing-basictracer-go.sha256sum] = "4e45569502570eebe6de7ebaebce706ccd0b5bdc3d6efca6268128f217ce5bd7"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/opentracing/basictracer-go/LICENSE;md5=3d06a8d5140813297e2b34727d897bf0 \
"

GOSRC_INCLUDEGUARD += "github.com-opentracing-basictracer-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gogo-protobuf-sources.inc', '', 'github.com-gogo-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-opentracing-go-sources.inc', '', 'github.com-opentracing-opentracing-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-lint-sources.inc', '', 'golang.org-x-lint-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
