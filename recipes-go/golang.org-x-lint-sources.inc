SRC_URI += "https://proxy.golang.org/golang.org/x/lint/@v/v0.0.0-20210508222113-6edffad5e616.zip;srcoutput=golang.org/x/lint;srcinput=golang.org/x/lint@v0.0.0-20210508222113-6edffad5e616;downloadfilename=golang-org-x-lint-0.0.0-20210508222113-6edffad5e616.zip;name=golang-org-x-lint"
SRC_URI[golang-org-x-lint.sha256sum] = "0a4a5ebd2b1d79e7f480cbf5a54b45a257ae1ec9d11f01688efc5c35268d4603"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/lint/LICENSE;md5=4c728948788b1a02f33ae4e906546eef \
"

GOSRC_INCLUDEGUARD += "golang.org-x-lint-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
