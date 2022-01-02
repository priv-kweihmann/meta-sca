SUMMARY = "go.mod: github.com/PuerkitoBio/goquery"
HOMEPAGE = "https://pkg.go.dev/github.com/PuerkitoBio/goquery"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-puerkitobio-goquery-sources.inc

EXTRA_DEPENDS += "\
    github.com-andybalholm-cascadia-native \
    golang.org-x-net-native \
"

GO_IMPORT = "github.com/PuerkitoBio/goquery"

UPSTREAM_CHECK_REGEX = "v(?P<pver>\d+\.\d+)"

inherit gosrc
inherit native
