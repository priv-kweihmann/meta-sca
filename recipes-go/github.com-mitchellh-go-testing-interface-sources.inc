SRC_URI += "https://proxy.golang.org/github.com/mitchellh/go-testing-interface/@v/v1.14.1.zip;srcoutput=github.com/mitchellh/go-testing-interface;srcinput=github.com/mitchellh/go-testing-interface@v1.14.1;downloadfilename=github-com-mitchellh-go-testing-interface-1.14.1.zip;name=github-com-mitchellh-go-testing-interface"
SRC_URI[github-com-mitchellh-go-testing-interface.sha256sum] = "c178afbb9d041b7ecaebf40d3fee1b169f2f11f929accca7642f9b57f801ff4c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/go-testing-interface/LICENSE;md5=96ada10a9e51c98c4656f2cede08c673 \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-go-testing-interface-sources.inc"

