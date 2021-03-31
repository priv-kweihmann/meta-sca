SUMMARY = "go.mod: bitbucket.org/creachadair/shell"
HOMEPAGE = "https://pkg.go.dev/bitbucket.org/creachadair/shell"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require bitbucket.org-creachadair-shell-sources.inc

GO_IMPORT = "bitbucket.org/creachadair/shell"

inherit gosrc
inherit native
