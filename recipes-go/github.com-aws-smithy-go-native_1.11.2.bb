SUMMARY = "go.mod: github.com/aws/smithy-go"
HOMEPAGE = "https://pkg.go.dev/github.com/aws/smithy-go"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-aws-smithy-go-sources.inc

EXTRA_DEPENDS += "\
    github.com-google-go-cmp-native \
    github.com-jmespath-go-jmespath-native \
"

GO_IMPORT = "github.com/aws/smithy-go"

UPSTREAM_CHECK_GITHUB_TAGS = "1"

inherit gosrc
inherit native
