SUMMARY = "go.mod: github.com/PuerkitoBio/goquery"
HOMEPAGE = "https://pkg.go.dev/github.com/PuerkitoBio/goquery"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-puerkitobio-goquery-sources.inc

GO_IMPORT = "github.com/PuerkitoBio/goquery"

inherit gosrc
inherit native
