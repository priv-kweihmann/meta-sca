SRC_URI += "https://proxy.golang.org/modernc.org/sqlite/@v/v1.23.1.zip;srcoutput=modernc.org/sqlite;srcinput=modernc.org/sqlite@v1.23.1;downloadfilename=modernc-org-sqlite-1.23.1.zip;name=modernc-org-sqlite"
SRC_URI[modernc-org-sqlite.sha256sum] = "50e0cdc4e9f9c37081edf265d0ee435d181ebde8de356adf3e4fbbb8ba5786c8"
GOSRC_REMOVEDIRS += "modernc.org/sqlite/functest"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    PD \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/sqlite/LICENSE;md5=3cd92e5f84bae63802a058f3ff54fbe7 \
    file://src/modernc.org/sqlite/SQLITE-LICENSE;md5=52831603de5e49ccae06c9676860acb1 \
"

GOSRC_INCLUDEGUARD += "modernc.org-sqlite-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-sqlite3-sources.inc', '', 'github.com-mattn-go-sqlite3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-ccgo-v3-sources.inc', '', 'modernc.org-ccgo-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-libc-sources.inc', '', 'modernc.org-libc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-mathutil-sources.inc', '', 'modernc.org-mathutil-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-tcl-sources.inc', '', 'modernc.org-tcl-sources.inc', d)}
