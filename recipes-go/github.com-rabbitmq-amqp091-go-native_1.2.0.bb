SUMMARY = "go.mod: github.com/rabbitmq/amqp091-go"
HOMEPAGE = "https://pkg.go.dev/github.com/rabbitmq/amqp091-go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rabbitmq-amqp091-go-sources.inc

GO_IMPORT = "github.com/rabbitmq/amqp091-go"

inherit gosrc
inherit native
