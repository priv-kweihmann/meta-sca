SRC_URI += "https://proxy.golang.org/github.com/eapache/go-xerial-snappy/@v/v0.0.0-20180814174437-776d5712da21.zip;srcoutput=github.com/eapache/go-xerial-snappy;srcinput=github.com/eapache/go-xerial-snappy@v0.0.0-20180814174437-776d5712da21;downloadfilename=github-com-eapache-go-xerial-snappy-0.0.0-20180814174437-776d5712da21.zip;name=github-com-eapache-go-xerial-snappy"
SRC_URI[github-com-eapache-go-xerial-snappy.sha256sum] = "785264afffdcfe50573a1cb0df85ff4186e9e7e4e3a04513752f52d3da1054af"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/eapache/go-xerial-snappy/LICENSE;md5=dcb7929be2a0ff22ad39f869509911d7 \
"

GOSRC_INCLUDEGUARD += "github.com-eapache-go-xerial-snappy-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-snappy-sources.inc', '', 'github.com-golang-snappy-sources.inc', d)}
