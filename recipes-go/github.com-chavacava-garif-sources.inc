SRC_URI += "https://proxy.golang.org/github.com/chavacava/garif/@v/v0.0.0-20221024190013-b3ef35877348.zip;srcoutput=github.com/chavacava/garif;srcinput=github.com/chavacava/garif@v0.0.0-20221024190013-b3ef35877348;downloadfilename=github-com-chavacava-garif-0.0.0-20221024190013-b3ef35877348.zip;name=github-com-chavacava-garif"
SRC_URI[github-com-chavacava-garif.sha256sum] = "ad1d712419c36aa7b88c4a38c22c733fbd0d26e07a2d0a9733fb27381912a895"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chavacava/garif/LICENSE;md5=b85b57c8a1fee230bd17e413a28a5b88 \
"

GOSRC_INCLUDEGUARD += "github.com-chavacava-garif-sources.inc"

