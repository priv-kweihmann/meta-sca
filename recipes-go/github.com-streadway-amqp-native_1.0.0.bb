SUMMARY = "go.mod: github.com/streadway/amqp"
HOMEPAGE = "https://pkg.go.dev/github.com/streadway/amqp"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-streadway-amqp-sources.inc

GO_IMPORT = "github.com/streadway/amqp"

inherit gosrc
inherit native
