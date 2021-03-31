SUMMARY = "go.mod: github.com/mgechev/revive"
HOMEPAGE = "https://pkg.go.dev/github.com/mgechev/revive"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mgechev-revive-sources.inc
require github.com-burntsushi-toml-sources.inc
require github.com-fatih-color-sources.inc
require github.com-fatih-structtag-sources.inc
require github.com-mattn-go-colorable-sources.inc
require github.com-mattn-go-isatty-sources.inc
require github.com-mattn-go-runewidth-sources.inc
require github.com-mgechev-dots-sources.inc
require github.com-mitchellh-go-homedir-sources.inc
require github.com-olekukonko-tablewriter-sources.inc
require github.com-pkg-errors-sources.inc
require github.com-rivo-uniseg-sources.inc
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

GO_IMPORT = "github.com/mgechev/revive"

inherit gosrc
inherit native
