SUMMARY = "go.mod: github.com/spf13/afero"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/afero"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-afero-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-pubsub-native \
    cloud.google.com-go-storage-native \
    github.com-googleapis-google-cloud-go-testing-native \
    github.com-pkg-sftp-native \
    golang.org-x-text-native \
    google.golang.org-api-native \
"

GO_IMPORT = "github.com/spf13/afero"

inherit gosrc
inherit native
