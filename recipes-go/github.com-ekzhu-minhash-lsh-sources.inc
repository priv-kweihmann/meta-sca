SRC_URI += "git://github.com/ekzhu/minhash-lsh;nobranch=1;protocol=https;srcinput=github.com/ekzhu/minhash-lsh;srcoutput=github.com/ekzhu/minhash-lsh;destsuffix=github.com/ekzhu/minhash-lsh;name=github-com-ekzhu-minhash-lsh"
SRCREV_github-com-ekzhu-minhash-lsh = "5c06ee8586a1691fbfa230842170429e2b31cc05"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ekzhu/minhash-lsh/LICENSE;md5=5fa0d12c68af5766cefc240d5f17acbd \
"

GOSRC_INCLUDEGUARD += "github.com-ekzhu-minhash-lsh-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-dgryski-go-minhash-sources.inc', '', 'github.com-dgryski-go-minhash-sources.inc', d)}
