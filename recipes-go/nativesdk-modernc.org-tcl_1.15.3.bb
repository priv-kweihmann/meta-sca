SUMMARY = "go.mod: modernc.org/tcl"
HOMEPAGE = "https://pkg.go.dev/modernc.org/tcl"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-tcl-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-modernc.org-ccgo-v3 \
    nativesdk-modernc.org-httpfs \
    nativesdk-modernc.org-libc \
    nativesdk-modernc.org-mathutil \
    nativesdk-modernc.org-z \
"
GO_IMPORT = "modernc.org/tcl"
inherit gosrc
inherit nativesdk
