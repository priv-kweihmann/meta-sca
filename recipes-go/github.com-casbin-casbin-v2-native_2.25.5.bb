SUMMARY = "go.mod: github.com/casbin/casbin/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/casbin/casbin/v2"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-casbin-casbin-v2-sources.inc
require github.com-golang-mock-sources.inc
require github.com-knetic-govaluate-sources.inc
require github.com-yuin-goldmark-sources.inc
require golang.org-x-crypto-sources.inc
require golang.org-x-mod-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sync-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc
require golang.org-x-tools-sources.inc
require golang.org-x-xerrors-sources.inc

GO_IMPORT = "github.com/casbin/casbin/v2"

inherit gosrc
inherit native
