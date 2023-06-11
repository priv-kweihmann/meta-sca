SUMMARY = "go.mod: modernc.org/ccgo/v3"
HOMEPAGE = "https://pkg.go.dev/modernc.org/ccgo/v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-ccgo-v3-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-kballard-go-shellquote \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
    nativesdk-modernc.org-cc-v3 \
    nativesdk-modernc.org-libc \
    nativesdk-modernc.org-mathutil \
    nativesdk-modernc.org-opt \
"
GO_IMPORT = "modernc.org/ccgo/v3"
inherit gosrc
inherit nativesdk
