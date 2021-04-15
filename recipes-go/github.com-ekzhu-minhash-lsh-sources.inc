SRC_URI += "https://github.com/ekzhu/minhash-lsh/archive/refs/tags/v1.0.zip;srcoutput=github.com/ekzhu/minhash-lsh;srcinput=minhash-lsh-1.0;downloadfilename=github-com-ekzhu-minhash-lsh-1.0.zip;name=github-com-ekzhu-minhash-lsh"
SRC_URI[github-com-ekzhu-minhash-lsh.sha256sum] = "12bed4420b75072be394016c73003fc28e3471edacc88f13984b4ddd16d071ae"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ekzhu/minhash-lsh/LICENSE;md5=5fa0d12c68af5766cefc240d5f17acbd \
"

GOSRC_INCLUDEGUARD += "github.com-ekzhu-minhash-lsh-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-dgryski-go-minhash-sources.inc', '', 'github.com-dgryski-go-minhash-sources.inc', d)}
