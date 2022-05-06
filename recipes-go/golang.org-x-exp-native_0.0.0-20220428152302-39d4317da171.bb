SUMMARY = "go.mod: golang.org/x/exp"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/exp"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-exp-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-mod-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "golang.org/x/exp"

# needs GLES3/gl3.h
do_compile[noexec] = "1"

inherit gosrc
inherit native
