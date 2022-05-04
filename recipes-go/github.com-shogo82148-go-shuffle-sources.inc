SRC_URI += "https://proxy.golang.org/github.com/shogo82148/go-shuffle/@v/v1.0.1.zip;srcoutput=github.com/shogo82148/go-shuffle;srcinput=github.com/shogo82148/go-shuffle@v1.0.1;downloadfilename=github-com-shogo82148-go-shuffle-1.0.1.zip;name=github-com-shogo82148-go-shuffle"
SRC_URI[github-com-shogo82148-go-shuffle.sha256sum] = "8d03aef649f851ad7c5462812f36762ae296cadd892f62cc5141d96497dd96cd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/shogo82148/go-shuffle/LICENSE.md;md5=61971a7950a223cae7b3f24255ee57af \
"

GOSRC_INCLUDEGUARD += "github.com-shogo82148-go-shuffle-sources.inc"

