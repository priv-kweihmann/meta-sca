SUMMARY = "go.mod: github.com/fyne-io/glfw-js"
HOMEPAGE = "https://pkg.go.dev/github.com/fyne-io/glfw-js"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fyne-io-glfw-js-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-gl-glfw-v3.3-glfw-native \
    github.com-gopherjs-gopherjs-native \
    honnef.co-go-js-dom-native \
"

GO_IMPORT = "github.com/fyne-io/glfw-js"

# needs X11 EGL3 and more
do_compile[noexec] = "1"

inherit gosrc
inherit native
