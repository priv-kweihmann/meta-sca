SUMMARY = "go.mod: github.com/chris-ramon/douceur"
HOMEPAGE = "https://pkg.go.dev/github.com/chris-ramon/douceur"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-chris-ramon-douceur-sources.inc

EXTRA_DEPENDS += "\
    github.com-aymerick-douceur-native \
    github.com-gorilla-css-native \
    github.com-puerkitobio-goquery-native \
    golang.org-x-net-native \
"

GO_IMPORT = "github.com/chris-ramon/douceur"

inherit gosrc
inherit native
