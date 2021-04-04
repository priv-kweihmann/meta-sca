SUMMARY = "go.mod: github.com/cenkalti/backoff"
HOMEPAGE = "https://pkg.go.dev/github.com/cenkalti/backoff"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-cenkalti-backoff-sources.inc

GO_IMPORT = "github.com/cenkalti/backoff"

inherit gosrc
inherit native
