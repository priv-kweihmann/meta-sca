SRC_URI += "https://proxy.golang.org/github.com/sergi/go-diff/@v/v1.3.1.zip;srcoutput=github.com/sergi/go-diff;srcinput=github.com/sergi/go-diff@v1.3.1;downloadfilename=github-com-sergi-go-diff-1.3.1.zip;name=github-com-sergi-go-diff"
SRC_URI[github-com-sergi-go-diff.sha256sum] = "b7a2378f17322fd5f08cf69f5bf1a3ba2bcb84704960ba23230305f6dfec4f98"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sergi/go-diff/APACHE-LICENSE-2.0;md5=2ee41112a44fe7014dce33e26468ba93 \
    file://src/github.com/sergi/go-diff/LICENSE;md5=16f703825b70b736d741a46be315b0d9 \
"

GOSRC_INCLUDEGUARD += "github.com-sergi-go-diff-sources.inc"

