SRC_URI += "https://proxy.golang.org/github.com/shogo82148/go-shuffle/@v/v1.0.0.zip;srcoutput=github.com/shogo82148/go-shuffle;srcinput=github.com/shogo82148/go-shuffle@v1.0.0;downloadfilename=github-com-shogo82148-go-shuffle-1.0.0.zip;name=github-com-shogo82148-go-shuffle"
SRC_URI[github-com-shogo82148-go-shuffle.sha256sum] = "d61d110e56846ea92f59553038c3da816ea78d94102c7734e801f7b501c3ee2a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shogo82148/go-shuffle/LICENSE.md;md5=61971a7950a223cae7b3f24255ee57af \
"

GOSRC_INCLUDEGUARD += "github.com-shogo82148-go-shuffle-sources.inc"

