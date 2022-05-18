SRC_URI += "https://proxy.golang.org/github.com/lufia/plan9stats/@v/v0.0.0-20220517141722-cf486979b281.zip;srcoutput=github.com/lufia/plan9stats;srcinput=github.com/lufia/plan9stats@v0.0.0-20220517141722-cf486979b281;downloadfilename=github-com-lufia-plan9stats-0.0.0-20220517141722-cf486979b281.zip;name=github-com-lufia-plan9stats"
SRC_URI[github-com-lufia-plan9stats.sha256sum] = "4f1266edb5fbee35d1bc4ed46d47cbc1a54865873dc9330ec549b215da3daf83"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lufia/plan9stats/LICENSE;md5=3d06b580c89c919790d71cd15a0d49e6 \
"

GOSRC_INCLUDEGUARD += "github.com-lufia-plan9stats-sources.inc"

