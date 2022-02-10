SUMMARY = "go.mod: go.uber.org/zap"
HOMEPAGE = "https://pkg.go.dev/go.uber.org/zap"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.uber.org-zap-sources.inc

EXTRA_DEPENDS += "\
    github.com-benbjohnson-clock-native \
    go.uber.org-atomic-native \
    go.uber.org-multierr-native \
"

GO_IMPORT = "go.uber.org/zap"

inherit gosrc
inherit native
