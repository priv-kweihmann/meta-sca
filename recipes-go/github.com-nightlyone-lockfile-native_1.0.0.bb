SUMMARY = "go.mod: github.com/nightlyone/lockfile"
HOMEPAGE = "https://pkg.go.dev/github.com/nightlyone/lockfile"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-nightlyone-lockfile-sources.inc

GO_IMPORT = "github.com/nightlyone/lockfile"

inherit gosrc
inherit native
