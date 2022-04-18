SUMMARY = "go.mod: github.com/sagikazarmark/crypt"
HOMEPAGE = "https://pkg.go.dev/github.com/sagikazarmark/crypt"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sagikazarmark-crypt-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-firestore-native \
    cloud.google.com-go-native \
    github.com-hashicorp-consul-api-native \
    go.etcd.io-etcd-client-v2-native \
    golang.org-x-crypto-native \
    google.golang.org-api-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "github.com/sagikazarmark/crypt"

inherit gosrc
inherit native
