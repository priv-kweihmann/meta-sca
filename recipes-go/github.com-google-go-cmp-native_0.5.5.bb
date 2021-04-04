SUMMARY = "go.mod: github.com/google/go-cmp"
HOMEPAGE = "https://pkg.go.dev/github.com/google/go-cmp"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-go-cmp-sources.inc

GO_IMPORT = "github.com/google/go-cmp"

inherit gosrc
inherit native
