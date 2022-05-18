SUMMARY = "go.mod: golang.org/x/exp/shiny"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/exp/shiny"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-exp-shiny-sources.inc

EXTRA_DEPENDS += "\
    dmitri.shuralyov.com-gpu-mtl-native \
    github.com-go-gl-glfw-v3.3-glfw-native \
    github.com-jezek-xgb-native \
    golang.org-x-image-native \
    golang.org-x-mobile-native \
    golang.org-x-sys-native \
"

GO_IMPORT = "golang.org/x/exp/shiny"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
