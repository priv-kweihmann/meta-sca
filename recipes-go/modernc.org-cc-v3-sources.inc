SRC_URI += "https://proxy.golang.org/modernc.org/cc/v3/@v/v3.41.0.zip;srcoutput=modernc.org/cc/v3;srcinput=modernc.org/cc/v3@v3.41.0;downloadfilename=modernc-org-cc-v3-3.41.0.zip;name=modernc-org-cc-v3"
SRC_URI[modernc-org-cc-v3.sha256sum] = "ea725c5140292291e6cb9848dc98fde16eba0ca0ceb242dc356a4f9ec148d2b8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/cc/v3/GO-LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/modernc.org/cc/v3/LICENSE;md5=0147787e7682296c534c5a9115995110 \
    file://src/modernc.org/cc/v3/testdata/jhjourdan/LICENSE;md5=1f0086cb85a19712c58e74263e651447 \
    file://src/modernc.org/cc/v3/testdata/tcc-0.9.27/tests/tests2/LICENSE;md5=48d5837ea26397270f2cda84b8b143fa \
"

GOSRC_INCLUDEGUARD += "modernc.org-cc-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'lukechampine.com-uint128-sources.inc', '', 'lukechampine.com-uint128-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-mathutil-sources.inc', '', 'modernc.org-mathutil-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-strutil-sources.inc', '', 'modernc.org-strutil-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-token-sources.inc', '', 'modernc.org-token-sources.inc', d)}
