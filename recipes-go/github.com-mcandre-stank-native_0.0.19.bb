SUMMARY = "go.mod: github.com/mcandre/stank"
HOMEPAGE = "https://pkg.go.dev/github.com/mcandre/stank"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mcandre-stank-sources.inc
require github.com-google-renameio-sources.inc
require github.com-pkg-diff-sources.inc
require golang.org-x-sync-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require mvdan.cc-editorconfig-sources.inc
require mvdan.cc-sh-sources.inc
require mvdan.cc-sh-v3-sources.inc

GO_IMPORT = "github.com/mcandre/stank"

inherit gosrc
inherit native
