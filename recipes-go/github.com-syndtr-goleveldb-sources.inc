SRC_URI += "https://proxy.golang.org/github.com/syndtr/goleveldb/@v/v1.0.0.zip;srcoutput=github.com/syndtr/goleveldb;srcinput=github.com/syndtr/goleveldb@v1.0.0;downloadfilename=github-com-syndtr-goleveldb-1.0.0.zip;name=github-com-syndtr-goleveldb"
SRC_URI[github-com-syndtr-goleveldb.sha256sum] = "a67abf8141af40a27092f466d3a6df5a691e196d317e24f5f1bccad87bf131d1"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/syndtr/goleveldb/LICENSE;md5=6b6b03a3c410317c558abe499de9b5a7 \
"

GOSRC_INCLUDEGUARD += "github.com-syndtr-goleveldb-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-snappy-sources.inc', '', 'github.com-golang-snappy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-onsi-ginkgo-sources.inc', '', 'github.com-onsi-ginkgo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-onsi-gomega-sources.inc', '', 'github.com-onsi-gomega-sources.inc', d)}
