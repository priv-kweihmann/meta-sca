SUMMARY = "go.mod: github.com/gofrs/uuid"
HOMEPAGE = "https://pkg.go.dev/github.com/gofrs/uuid"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gofrs-uuid-sources.inc

GO_IMPORT = "github.com/gofrs/uuid"

inherit gosrc
inherit native
