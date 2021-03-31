SUMMARY = "go.mod: github.com/mozilla/scribe"
HOMEPAGE = "https://pkg.go.dev/github.com/mozilla/scribe"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mozilla-scribe-sources.inc

GO_IMPORT = "github.com/mozilla/scribe"

inherit gosrc
inherit native
