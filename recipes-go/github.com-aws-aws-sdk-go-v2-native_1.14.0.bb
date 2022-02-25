SUMMARY = "go.mod: github.com/aws/aws-sdk-go-v2"
HOMEPAGE = "https://pkg.go.dev/github.com/aws/aws-sdk-go-v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-aws-aws-sdk-go-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-aws-smithy-go-native \
    github.com-google-go-cmp-native \
    github.com-jmespath-go-jmespath-native \
"

GO_IMPORT = "github.com/aws/aws-sdk-go-v2"

inherit gosrc
inherit native
