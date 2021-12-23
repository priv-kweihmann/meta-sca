SUMMARY = "go.mod: github.com/grpc-ecosystem/go-grpc-middleware"
HOMEPAGE = "https://pkg.go.dev/github.com/grpc-ecosystem/go-grpc-middleware"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-grpc-ecosystem-go-grpc-middleware-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-kit-kit-native \
    github.com-gogo-protobuf-native \
    github.com-golang-protobuf-native \
    github.com-opentracing-opentracing-go-native \
    github.com-sirupsen-logrus-native \
    github.com-stretchr-testify-native \
    go.uber.org-zap-native \
    golang.org-x-net-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "github.com/grpc-ecosystem/go-grpc-middleware"

inherit gosrc
inherit native
