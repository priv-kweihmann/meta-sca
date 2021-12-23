SUMMARY = "go.mod: github.com/fatih/structs"
HOMEPAGE = "https://pkg.go.dev/github.com/fatih/structs"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fatih-structs-sources.inc

GO_IMPORT = "github.com/fatih/structs"

inherit gosrc
inherit native
