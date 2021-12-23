SUMMARY = "go.mod: golang.org/x/mobile"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/mobile"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-mobile-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-exp-native \
    golang.org-x-image-native \
    golang.org-x-mod-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "golang.org/x/mobile"

# needs GLES3/gl3.h
do_compile[noexec] = "1"

inherit gosrc
inherit native
