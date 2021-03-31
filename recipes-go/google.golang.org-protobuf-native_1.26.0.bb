SUMMARY = "go.mod: google.golang.org/protobuf"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/protobuf"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-protobuf-sources.inc
require github.com-google-go-cmp-sources.inc
require golang.org-x-xerrors-sources.inc

GO_IMPORT = "google.golang.org/protobuf"

inherit gosrc
inherit native
