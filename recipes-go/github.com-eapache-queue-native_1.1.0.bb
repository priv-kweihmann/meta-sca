SUMMARY = "go.mod: github.com/eapache/queue"
HOMEPAGE = "https://pkg.go.dev/github.com/eapache/queue"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-eapache-queue-sources.inc

GO_IMPORT = "github.com/eapache/queue"

inherit gosrc
inherit native
