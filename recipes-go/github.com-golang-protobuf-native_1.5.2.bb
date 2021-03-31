SUMMARY = "go.mod: github.com/golang/protobuf"
HOMEPAGE = "https://pkg.go.dev/github.com/golang/protobuf"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-golang-protobuf-sources.inc
require github.com-google-go-cmp-sources.inc
require golang.org-x-xerrors-sources.inc
require google.golang.org-protobuf-sources.inc

GO_IMPORT = "github.com/golang/protobuf"

inherit gosrc
inherit native
