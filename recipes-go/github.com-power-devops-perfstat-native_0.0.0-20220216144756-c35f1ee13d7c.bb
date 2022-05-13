SUMMARY = "go.mod: github.com/power-devops/perfstat"
HOMEPAGE = "https://pkg.go.dev/github.com/power-devops/perfstat"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-power-devops-perfstat-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/power-devops/perfstat"

# fails with C source files not allowed when not using cgo or SWIG
do_compile[noexec] = "1"

inherit gosrc
inherit native
