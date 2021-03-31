SUMMARY = "go.mod: go.opencensus.io"
HOMEPAGE = "https://pkg.go.dev/go.opencensus.io"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.opencensus.io-sources.inc
require github.com-golang-groupcache-sources.inc
require github.com-golang-protobuf-sources.inc
require github.com-google-go-cmp-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc
require golang.org-x-xerrors-sources.inc
require google.golang.org-protobuf-sources.inc

GO_IMPORT = "go.opencensus.io"

inherit gosrc
inherit native
