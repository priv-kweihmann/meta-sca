SUMMARY = "go.mod: github.com/google/martian/v3"
HOMEPAGE = "https://pkg.go.dev/github.com/google/martian/v3"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-martian-v3-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc

GO_IMPORT = "github.com/google/martian/v3"

inherit gosrc
inherit native
