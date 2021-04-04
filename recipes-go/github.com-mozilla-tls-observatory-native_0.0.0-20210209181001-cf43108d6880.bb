SUMMARY = "go.mod: github.com/mozilla/tls-observatory"
HOMEPAGE = "https://pkg.go.dev/github.com/mozilla/tls-observatory"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mozilla-tls-observatory-sources.inc

GO_IMPORT = "github.com/mozilla/tls-observatory"

inherit gosrc
inherit native
