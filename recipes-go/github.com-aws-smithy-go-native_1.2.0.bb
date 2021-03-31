SUMMARY = "go.mod: github.com/aws/smithy-go"
HOMEPAGE = "https://pkg.go.dev/github.com/aws/smithy-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-aws-smithy-go-sources.inc
require github.com-google-go-cmp-sources.inc
require golang.org-x-xerrors-sources.inc

GO_IMPORT = "github.com/aws/smithy-go"

inherit gosrc
inherit native
