SUMMARY = "go.mod: github.com/jpillora/backoff"
HOMEPAGE = "https://pkg.go.dev/github.com/jpillora/backoff"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jpillora-backoff-sources.inc

GO_IMPORT = "github.com/jpillora/backoff"

inherit gosrc
inherit native
