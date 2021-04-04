SUMMARY = "go.mod: github.com/syndtr/goleveldb"
HOMEPAGE = "https://pkg.go.dev/github.com/syndtr/goleveldb"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-syndtr-goleveldb-sources.inc

GO_IMPORT = "github.com/syndtr/goleveldb"

inherit gosrc
inherit native
