SUMMARY = "go.mod: github.com/go-enry/go-license-detector/v4"
HOMEPAGE = "https://pkg.go.dev/github.com/go-enry/go-license-detector/v4"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-enry-go-license-detector-v4-sources.inc

EXTRA_DEPENDS += "\
    github.com-ekzhu-minhash-lsh-native \
    github.com-go-git-go-git-v5-native \
    github.com-hhatto-gorst-native \
    github.com-jdkato-prose-native \
    github.com-pkg-errors-native \
    github.com-russross-blackfriday-v2-native \
    github.com-sergi-go-diff-native \
    github.com-spf13-pflag-native \
    golang.org-x-exp-native \
    golang.org-x-net-native \
    golang.org-x-text-native \
    gonum.org-v1-gonum-native \
"

GO_IMPORT = "github.com/go-enry/go-license-detector/v4"

inherit gosrc
inherit native
