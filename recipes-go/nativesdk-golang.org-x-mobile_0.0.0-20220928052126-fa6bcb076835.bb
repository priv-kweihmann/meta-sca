SUMMARY = "go.mod: golang.org/x/mobile"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/mobile"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-mobile-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-exp \
    nativesdk-golang.org-x-image \
    nativesdk-golang.org-x-mod \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "golang.org/x/mobile"
# needs GLES3/gl3.h
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
