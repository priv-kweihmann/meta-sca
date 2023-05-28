SUMMARY = "go.mod: golang.org/x/exp/typeparams"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/exp/typeparams"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-exp-typeparams-sources.inc

GO_IMPORT = "golang.org/x/exp/typeparams"

# needs CGO
do_compile[noexec] = "1"

inherit gosrc
inherit native
