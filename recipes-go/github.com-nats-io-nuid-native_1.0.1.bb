SUMMARY = "go.mod: github.com/nats-io/nuid"
HOMEPAGE = "https://pkg.go.dev/github.com/nats-io/nuid"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-nats-io-nuid-sources.inc

GO_IMPORT = "github.com/nats-io/nuid"

inherit gosrc
inherit native
