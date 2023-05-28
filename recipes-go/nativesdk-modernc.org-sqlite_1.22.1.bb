SUMMARY = "go.mod: modernc.org/sqlite"
HOMEPAGE = "https://pkg.go.dev/modernc.org/sqlite"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-sqlite-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-mattn-go-sqlite3 \
    nativesdk-golang.org-x-sys \
    nativesdk-modernc.org-ccgo-v3 \
    nativesdk-modernc.org-libc \
    nativesdk-modernc.org-mathutil \
    nativesdk-modernc.org-tcl \
"
GO_IMPORT = "modernc.org/sqlite"
inherit gosrc
inherit nativesdk
