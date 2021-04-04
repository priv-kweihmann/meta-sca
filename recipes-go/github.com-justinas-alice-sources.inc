SRC_URI += "https://proxy.golang.org/github.com/justinas/alice/@v/v1.2.0.zip;srcoutput=github.com/justinas/alice;srcinput=github.com/justinas/alice@v1.2.0;downloadfilename=github-com-justinas-alice-1.2.0.zip;name=github-com-justinas-alice"
SRC_URI[github-com-justinas-alice.sha256sum] = "b2d65d6a613d0fe33b4595b69855ab9d55bcfeee506a19d07d4585c566fe6587"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/justinas/alice/LICENSE;md5=1296a9c7ee97c4356f9f6a478527c6b1 \
"

GOSRC_INCLUDEGUARD += "github.com-justinas-alice-sources.inc"

