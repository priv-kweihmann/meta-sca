SUMMARY = "go.mod: github.com/luna-duclos/instrumentedsql"
HOMEPAGE = "https://pkg.go.dev/github.com/luna-duclos/instrumentedsql"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-luna-duclos-instrumentedsql-sources.inc

GO_IMPORT = "github.com/luna-duclos/instrumentedsql"

inherit gosrc
inherit native
