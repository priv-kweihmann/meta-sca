SUMMARY = "go.mod: github.com/fatih/structtag"
HOMEPAGE = "https://pkg.go.dev/github.com/fatih/structtag"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fatih-structtag-sources.inc

GO_IMPORT = "github.com/fatih/structtag"

inherit gosrc
inherit native
