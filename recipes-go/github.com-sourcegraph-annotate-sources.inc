SRC_URI += "https://proxy.golang.org/github.com/sourcegraph/annotate/@v/v0.0.0-20160123013949-f4cad6c6324d.zip;srcoutput=github.com/sourcegraph/annotate;srcinput=github.com/sourcegraph/annotate@v0.0.0-20160123013949-f4cad6c6324d;downloadfilename=github-com-sourcegraph-annotate-0.0.0-20160123013949-f4cad6c6324d.zip;name=github-com-sourcegraph-annotate"
SRC_URI[github-com-sourcegraph-annotate.sha256sum] = "2a58cbf2485b2e97e49d7c3e83e81385d1418bfbab2b846dabec041a3d402b3e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sourcegraph/annotate/LICENSE;md5=8cbcae0fad8b9e2f52c9d13373471073 \
"

GOSRC_INCLUDEGUARD += "github.com-sourcegraph-annotate-sources.inc"

