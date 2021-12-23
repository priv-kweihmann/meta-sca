SUMMARY = "go.mod: github.com/nats-io/nats.go"
HOMEPAGE = "https://pkg.go.dev/github.com/nats-io/nats.go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-nats-io-nats.go-sources.inc

EXTRA_DEPENDS += "\
    github.com-nats-io-nkeys-native \
    github.com-nats-io-nuid-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/nats-io/nats.go"

inherit gosrc
inherit native
