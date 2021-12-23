SUMMARY = "go.mod: github.com/eapache/go-xerial-snappy"
HOMEPAGE = "https://pkg.go.dev/github.com/eapache/go-xerial-snappy"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-eapache-go-xerial-snappy-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-snappy-native \
"

GO_IMPORT = "github.com/eapache/go-xerial-snappy"

inherit gosrc
inherit native
