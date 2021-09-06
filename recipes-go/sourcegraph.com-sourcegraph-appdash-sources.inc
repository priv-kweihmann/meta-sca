SRC_URI += "https://proxy.golang.org/sourcegraph.com/sourcegraph/appdash/@v/v0.0.0-20210831040556-ec77a7fbcadc.zip;srcoutput=sourcegraph.com/sourcegraph/appdash;srcinput=sourcegraph.com/sourcegraph/appdash@v0.0.0-20210831040556-ec77a7fbcadc;downloadfilename=sourcegraph-com-sourcegraph-appdash-0.0.0-20210831040556-ec77a7fbcadc.zip;name=sourcegraph-com-sourcegraph-appdash"
SRC_URI[sourcegraph-com-sourcegraph-appdash.sha256sum] = "f68fa1ea9b704550547a10fa0af1de46b0cb64f648422916e85c910c529690aa"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/sourcegraph.com/sourcegraph/appdash/LICENSE;md5=7382694b07abfd90abcab68784334326 \
"

GOSRC_INCLUDEGUARD += "sourcegraph.com-sourcegraph-appdash-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gogo-protobuf-sources.inc', '', 'github.com-gogo-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-mux-sources.inc', '', 'github.com-gorilla-mux-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jessevdk-go-flags-sources.inc', '', 'github.com-jessevdk-go-flags-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-basictracer-go-sources.inc', '', 'github.com-opentracing-basictracer-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-opentracing-go-sources.inc', '', 'github.com-opentracing-opentracing-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-urfave-negroni-sources.inc', '', 'github.com-urfave-negroni-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'sourcegraph.com-sourcegraph-appdash-data-sources.inc', '', 'sourcegraph.com-sourcegraph-appdash-data-sources.inc', d)}
