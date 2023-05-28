SRC_URI += "https://proxy.golang.org/modernc.org/tcl/@v/v1.15.3.zip;srcoutput=modernc.org/tcl;srcinput=modernc.org/tcl@v1.15.3;downloadfilename=modernc-org-tcl-1.15.3.zip;name=modernc-org-tcl"
SRC_URI[modernc-org-tcl.sha256sum] = "0e457d7d4f70502e7cc22b96a3d04cd30ae4793c3e9354a625bf5507fcf4d3bf"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    TCL \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/tcl/LICENSE;md5=d606a44b754875df44a2d50eaa6d256f \
    file://src/modernc.org/tcl/assets/license.terms;md5=058f6229798281bbcac4239c788cfa38 \
    file://src/modernc.org/tcl/internal/tclsh/license.terms;md5=058f6229798281bbcac4239c788cfa38 \
    file://src/modernc.org/tcl/internal/tcltest/license.terms;md5=058f6229798281bbcac4239c788cfa38 \
    file://src/modernc.org/tcl/license.terms;md5=058f6229798281bbcac4239c788cfa38 \
    file://src/modernc.org/tcl/testdata/tcl/license.terms;md5=058f6229798281bbcac4239c788cfa38 \
"

GOSRC_INCLUDEGUARD += "modernc.org-tcl-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-ccgo-v3-sources.inc', '', 'modernc.org-ccgo-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-httpfs-sources.inc', '', 'modernc.org-httpfs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-libc-sources.inc', '', 'modernc.org-libc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-mathutil-sources.inc', '', 'modernc.org-mathutil-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-z-sources.inc', '', 'modernc.org-z-sources.inc', d)}
