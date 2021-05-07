SRC_URI += "https://proxy.golang.org/github.com/mitchellh/copystructure/@v/v1.2.0.zip;srcoutput=github.com/mitchellh/copystructure;srcinput=github.com/mitchellh/copystructure@v1.2.0;downloadfilename=github-com-mitchellh-copystructure-1.2.0.zip;name=github-com-mitchellh-copystructure"
SRC_URI[github-com-mitchellh-copystructure.sha256sum] = "4a1ce1f3c66bf99883e55da50fe1b3122299b79ad1d11c5407abbd74ace12550"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/copystructure/LICENSE;md5=56da355a12d4821cda57b8f23ec34bc4 \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-copystructure-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-reflectwalk-sources.inc', '', 'github.com-mitchellh-reflectwalk-sources.inc', d)}
