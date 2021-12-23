SUMMARY = "go.mod: github.com/oklog/oklog"
HOMEPAGE = "https://pkg.go.dev/github.com/oklog/oklog"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-oklog-oklog-sources.inc

EXTRA_DEPENDS += "\
    github.com-djherbis-buffer-native \
    github.com-djherbis-nio-native \
    github.com-go-kit-kit-native \
    github.com-google-btree-native \
    github.com-hashicorp-go-sockaddr-native \
    github.com-hashicorp-memberlist-native \
    github.com-oklog-run-native \
    github.com-oklog-ulid-native \
    github.com-pborman-uuid-native \
    github.com-pkg-errors-native \
    github.com-prometheus-client-golang-native \
    github.com-rs-cors-native \
"

GO_IMPORT = "github.com/oklog/oklog"

inherit gosrc
inherit native
