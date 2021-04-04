SRC_URI += "https://proxy.golang.org/github.com/sourcegraph/syntaxhighlight/@v/v0.0.0-20170531221838-bd320f5d308e.zip;srcoutput=github.com/sourcegraph/syntaxhighlight;srcinput=github.com/sourcegraph/syntaxhighlight@v0.0.0-20170531221838-bd320f5d308e;downloadfilename=github-com-sourcegraph-syntaxhighlight-0.0.0-20170531221838-bd320f5d308e.zip;name=github-com-sourcegraph-syntaxhighlight"
SRC_URI[github-com-sourcegraph-syntaxhighlight.sha256sum] = "c0e6323ed7a5dcddcdd7686f2d7c68dff44a8ecbfd6818db3bdb33a7af422792"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sourcegraph/syntaxhighlight/LICENSE;md5=8cbcae0fad8b9e2f52c9d13373471073 \
"

GOSRC_INCLUDEGUARD += "github.com-sourcegraph-syntaxhighlight-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sourcegraph-annotate-sources.inc', '', 'github.com-sourcegraph-annotate-sources.inc', d)}
