SUMMARY = "go.mod: github.com/oklog/ulid"
HOMEPAGE = "https://pkg.go.dev/github.com/oklog/ulid"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-oklog-ulid-sources.inc

EXTRA_DEPENDS += "\
    github.com-pborman-getopt-v2-native \
"

GO_IMPORT = "github.com/oklog/ulid"

inherit gosrc
inherit native
