SUMMARY = "go.mod: github.com/ryanuber/columnize"
HOMEPAGE = "https://pkg.go.dev/github.com/ryanuber/columnize"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ryanuber-columnize-sources.inc

GO_IMPORT = "github.com/ryanuber/columnize"

inherit gosrc
inherit native
