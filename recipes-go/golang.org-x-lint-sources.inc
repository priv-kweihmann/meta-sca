SRC_URI += "https://proxy.golang.org/golang.org/x/lint/@v/v0.0.0-20201208152925-83fdc39ff7b5.zip;srcoutput=golang.org/x/lint;srcinput=golang.org/x/lint@v0.0.0-20201208152925-83fdc39ff7b5;downloadfilename=golang-org-x-lint-0.0.0-20201208152925-83fdc39ff7b5.zip;name=golang-org-x-lint"
SRC_URI[golang-org-x-lint.sha256sum] = "4620205ccd1fd5c5ced7ccbc264217f407c53924e847f4219e48c04c7480b294"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/lint/LICENSE;md5=4c728948788b1a02f33ae4e906546eef \
"

GOSRC_INCLUDEGUARD += "golang.org-x-lint-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
