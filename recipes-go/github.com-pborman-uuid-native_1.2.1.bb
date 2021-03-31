SUMMARY = "go.mod: github.com/pborman/uuid"
HOMEPAGE = "https://pkg.go.dev/github.com/pborman/uuid"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pborman-uuid-sources.inc
require github.com-google-uuid-sources.inc

GO_IMPORT = "github.com/pborman/uuid"

inherit gosrc
inherit native
