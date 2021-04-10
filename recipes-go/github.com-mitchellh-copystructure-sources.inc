SRC_URI += "https://proxy.golang.org/github.com/mitchellh/copystructure/@v/v1.1.2.zip;srcoutput=github.com/mitchellh/copystructure;srcinput=github.com/mitchellh/copystructure@v1.1.2;downloadfilename=github-com-mitchellh-copystructure-1.1.2.zip;name=github-com-mitchellh-copystructure"
SRC_URI[github-com-mitchellh-copystructure.sha256sum] = "974434c1db8dfbc7bca305bb7bfb778b43bc5b725e1823c6f3dbea365f0e683b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/copystructure/LICENSE;md5=56da355a12d4821cda57b8f23ec34bc4 \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-copystructure-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-reflectwalk-sources.inc', '', 'github.com-mitchellh-reflectwalk-sources.inc', d)}
