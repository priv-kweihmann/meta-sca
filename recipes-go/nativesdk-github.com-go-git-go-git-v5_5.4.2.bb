SUMMARY = "go.mod: github.com/go-git/go-git/v5"
HOMEPAGE = "https://pkg.go.dev/github.com/go-git/go-git/v5"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-git-go-git-v5-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-acomagu-bufpipe \
    nativesdk-github.com-emirpasic-gods \
    nativesdk-github.com-go-git-gcfg \
    nativesdk-github.com-go-git-go-billy-v5 \
    nativesdk-github.com-go-git-go-git-fixtures-v4 \
    nativesdk-github.com-imdario-mergo \
    nativesdk-github.com-jbenet-go-context \
    nativesdk-github.com-jessevdk-go-flags \
    nativesdk-github.com-kevinburke-ssh-config \
    nativesdk-github.com-mitchellh-go-homedir \
    nativesdk-github.com-protonmail-go-crypto \
    nativesdk-github.com-sergi-go-diff \
    nativesdk-github.com-xanzy-ssh-agent \
    nativesdk-golang.org-x-crypto \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-sys \
    nativesdk-gopkg.in-check.v1 \
"
GO_IMPORT = "github.com/go-git/go-git/v5"
inherit gosrc
inherit nativesdk
