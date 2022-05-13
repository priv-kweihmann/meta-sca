SUMMARY = "go.mod: github.com/go-gl/gl"
HOMEPAGE = "https://pkg.go.dev/github.com/go-gl/gl"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-gl-gl-sources.inc

GO_IMPORT = "github.com/go-gl/gl"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
