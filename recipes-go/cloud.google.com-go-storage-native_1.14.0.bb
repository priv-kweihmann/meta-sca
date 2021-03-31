SUMMARY = "go.mod: cloud.google.com/go/storage"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go/storage"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-storage-sources.inc
require github.com-golang-groupcache-sources.inc
require github.com-golang-protobuf-sources.inc
require github.com-google-go-cmp-sources.inc
require github.com-googleapis-gax-go-v2-sources.inc
require github.com-yuin-goldmark-sources.inc
require go.opencensus.io-sources.inc
require golang.org-x-crypto-sources.inc
require golang.org-x-lint-sources.inc
require golang.org-x-mod-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sync-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc
require golang.org-x-tools-sources.inc
require golang.org-x-xerrors-sources.inc
require google.golang.org-api-sources.inc
require google.golang.org-appengine-sources.inc
require google.golang.org-genproto-sources.inc
require google.golang.org-protobuf-sources.inc

GO_IMPORT = "cloud.google.com/go/storage"

inherit gosrc
inherit native
