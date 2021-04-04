SRC_URI += "https://proxy.golang.org/github.com/mitchellh/copystructure/@v/v1.1.1.zip;srcoutput=github.com/mitchellh/copystructure;srcinput=github.com/mitchellh/copystructure@v1.1.1;downloadfilename=github-com-mitchellh-copystructure-1.1.1.zip;name=github-com-mitchellh-copystructure"
SRC_URI[github-com-mitchellh-copystructure.sha256sum] = "1be38e428c3b9211d03c4a6362517858d329f9fc68ae2f631bbbeb737b76a155"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/copystructure/LICENSE;md5=56da355a12d4821cda57b8f23ec34bc4 \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-copystructure-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-reflectwalk-sources.inc', '', 'github.com-mitchellh-reflectwalk-sources.inc', d)}
