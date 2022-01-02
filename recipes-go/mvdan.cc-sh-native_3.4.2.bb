SUMMARY = "go.mod: mvdan.cc/sh"
HOMEPAGE = "https://pkg.go.dev/mvdan.cc/sh"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require mvdan.cc-sh-sources.inc

EXTRA_DEPENDS += "\
    github.com-google-renameio-native \
    github.com-pkg-diff-native \
    golang.org-x-sync-native \
    golang.org-x-sys-native \
    golang.org-x-term-native \
    mvdan.cc-editorconfig-native \
"

GO_IMPORT = "mvdan.cc/sh"

UPSTREAM_CHECK_REGEX = "v(?P<pver>\d+\.\d+\.\d+)$"

inherit gosrc
inherit native
