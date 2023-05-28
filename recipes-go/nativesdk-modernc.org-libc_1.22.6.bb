SUMMARY = "go.mod: modernc.org/libc"
HOMEPAGE = "https://pkg.go.dev/modernc.org/libc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-libc-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-dustin-go-humanize \
    nativesdk-github.com-google-uuid \
    nativesdk-github.com-mattn-go-isatty \
    nativesdk-golang.org-x-sys \
    nativesdk-modernc.org-mathutil \
    nativesdk-modernc.org-memory \
"
GO_IMPORT = "modernc.org/libc"
inherit gosrc
inherit nativesdk
