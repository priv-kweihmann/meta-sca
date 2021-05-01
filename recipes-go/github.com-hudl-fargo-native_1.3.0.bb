SUMMARY = "go.mod: github.com/hudl/fargo"
HOMEPAGE = "https://pkg.go.dev/github.com/hudl/fargo"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hudl-fargo-sources.inc

EXTRA_DEPENDS += "\
    github.com-cenkalti-backoff-native \
    github.com-clbanning-x2j-native \
    github.com-franela-goreq-native \
    github.com-miekg-dns-native \
    github.com-op-go-logging-native \
    gopkg.in-gcfg.v1-native \
"

GO_IMPORT = "github.com/hudl/fargo"

inherit gosrc
inherit native
