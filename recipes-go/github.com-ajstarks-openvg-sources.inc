SRC_URI += "https://proxy.golang.org/github.com/ajstarks/openvg/@v/v0.0.0-20191008131700-c6885d824eb8.zip;srcoutput=github.com/ajstarks/openvg;srcinput=github.com/ajstarks/openvg@v0.0.0-20191008131700-c6885d824eb8;downloadfilename=github-com-ajstarks-openvg-0.0.0-20191008131700-c6885d824eb8.zip;name=github-com-ajstarks-openvg"
SRC_URI[github-com-ajstarks-openvg.sha256sum] = "81046c36e3c927f732b4e65bdd50c26ac3a30cdfaf41a17aa552d941d7080ac7"

GOSRC_LICENSE += "\
    CC-BY-3.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/openvg/LICENSE;md5=ba51e0670a36d0ef1028dd56ac1f7a22 \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-openvg-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-disintegration-gift-sources.inc', '', 'github.com-disintegration-gift-sources.inc', d)}
