SRC_URI += "https://proxy.golang.org/github.com/sourcegraph/annotate/@v/v0.0.0-20201028165148-8a836f182f9d.zip;srcoutput=github.com/sourcegraph/annotate;srcinput=github.com/sourcegraph/annotate@v0.0.0-20201028165148-8a836f182f9d;downloadfilename=github-com-sourcegraph-annotate-0.0.0-20201028165148-8a836f182f9d.zip;name=github-com-sourcegraph-annotate"
SRC_URI[github-com-sourcegraph-annotate.sha256sum] = "a2e7d9d6190b80ad80d9e84783b7f40881fab663e77bd2506345a0f8c0f1af9f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sourcegraph/annotate/LICENSE;md5=8cbcae0fad8b9e2f52c9d13373471073 \
"

GOSRC_INCLUDEGUARD += "github.com-sourcegraph-annotate-sources.inc"

