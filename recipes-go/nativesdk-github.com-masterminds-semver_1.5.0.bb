SUMMARY = "go.mod: github.com/Masterminds/semver"
HOMEPAGE = "https://pkg.go.dev/github.com/Masterminds/semver"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-masterminds-semver-sources.inc

GO_IMPORT = "github.com/Masterminds/semver"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>1\.\d+\.\d+)"
inherit gosrc
inherit nativesdk
