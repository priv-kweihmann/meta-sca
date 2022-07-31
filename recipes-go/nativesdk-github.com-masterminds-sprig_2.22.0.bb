SUMMARY = "go.mod: github.com/Masterminds/sprig"
HOMEPAGE = "https://pkg.go.dev/github.com/Masterminds/sprig"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-masterminds-sprig-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-google-uuid \
    nativesdk-github.com-huandu-xstrings \
    nativesdk-github.com-imdario-mergo \
    nativesdk-github.com-masterminds-goutils \
    nativesdk-github.com-masterminds-semver \
    nativesdk-github.com-mitchellh-copystructure \
    nativesdk-golang.org-x-crypto \
"
GO_IMPORT = "github.com/Masterminds/sprig"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)"
inherit gosrc
inherit nativesdk
