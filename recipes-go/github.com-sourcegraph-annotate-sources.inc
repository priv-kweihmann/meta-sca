SRC_URI += "https://proxy.golang.org/github.com/sourcegraph/annotate/@v/v0.0.0-20210331123347-c8a81f7e2fbe.zip;srcoutput=github.com/sourcegraph/annotate;srcinput=github.com/sourcegraph/annotate@v0.0.0-20210331123347-c8a81f7e2fbe;downloadfilename=github-com-sourcegraph-annotate-0.0.0-20210331123347-c8a81f7e2fbe.zip;name=github-com-sourcegraph-annotate"
SRC_URI[github-com-sourcegraph-annotate.sha256sum] = "c65ba37fcb2cbe5b4e0e9525b88083b0940778ede0bb7dcd64f149c83f8be0ef"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sourcegraph/annotate/LICENSE;md5=8cbcae0fad8b9e2f52c9d13373471073 \
"

GOSRC_INCLUDEGUARD += "github.com-sourcegraph-annotate-sources.inc"

