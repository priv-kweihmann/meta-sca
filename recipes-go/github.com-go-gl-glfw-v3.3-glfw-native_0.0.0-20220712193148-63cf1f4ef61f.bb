SUMMARY = "go.mod: github.com/go-gl/glfw/v3.3/glfw"
HOMEPAGE = "https://pkg.go.dev/github.com/go-gl/glfw/v3.3/glfw"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-gl-glfw-v3.3-glfw-sources.inc

GO_IMPORT = "github.com/go-gl/glfw/v3.3/glfw"

# needs X11/Xlib.h
do_compile[noexec] = "1"

inherit gosrc
inherit native
