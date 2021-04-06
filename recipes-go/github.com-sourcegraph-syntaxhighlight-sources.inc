SRC_URI += "https://proxy.golang.org/github.com/sourcegraph/syntaxhighlight/@v/v0.0.0-20201028155326-fc05dd37300c.zip;srcoutput=github.com/sourcegraph/syntaxhighlight;srcinput=github.com/sourcegraph/syntaxhighlight@v0.0.0-20201028155326-fc05dd37300c;downloadfilename=github-com-sourcegraph-syntaxhighlight-0.0.0-20201028155326-fc05dd37300c.zip;name=github-com-sourcegraph-syntaxhighlight"
SRC_URI[github-com-sourcegraph-syntaxhighlight.sha256sum] = "a41b97143760640278fe2afb0974285fa3814f7e671463cb9f23c7d76dcde5e7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sourcegraph/syntaxhighlight/LICENSE;md5=8cbcae0fad8b9e2f52c9d13373471073 \
"

GOSRC_INCLUDEGUARD += "github.com-sourcegraph-syntaxhighlight-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sourcegraph-annotate-sources.inc', '', 'github.com-sourcegraph-annotate-sources.inc', d)}
