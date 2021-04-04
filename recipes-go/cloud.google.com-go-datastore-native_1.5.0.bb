SUMMARY = "go.mod: cloud.google.com/go/datastore"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go/datastore"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-datastore-sources.inc

GO_IMPORT = "cloud.google.com/go/datastore"

inherit gosrc
inherit native
