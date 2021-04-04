SUMMARY = "go.mod: github.com/bketelsen/crypt"
HOMEPAGE = "https://pkg.go.dev/github.com/bketelsen/crypt"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-bketelsen-crypt-sources.inc

GO_IMPORT = "github.com/bketelsen/crypt"

inherit gosrc
inherit native
