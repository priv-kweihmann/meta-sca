SUMMARY = "go.mod: golang.org/x/net"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/net"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-net-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc

GO_IMPORT = "golang.org/x/net"

inherit gosrc
inherit native
