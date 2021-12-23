SUMMARY = "go.mod: golang.org/x/exp"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/exp"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-exp-sources.inc

EXTRA_DEPENDS += "\
    dmitri.shuralyov.com-gpu-mtl-native \
    github.com-burntsushi-xgb-native \
    github.com-go-gl-glfw-v3.3-glfw-native \
    golang.org-x-image-native \
    golang.org-x-mobile-native \
    golang.org-x-mod-native \
    golang.org-x-sys-native \
    golang.org-x-tools-native \
    golang.org-x-xerrors-native \
"

GO_IMPORT = "golang.org/x/exp"

# needs GLES3/gl3.h
do_compile[noexec] = "1"

inherit gosrc
inherit native
