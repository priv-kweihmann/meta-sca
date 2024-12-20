SRC_URI += "https://proxy.golang.org/golang.org/x/lint/@v/v0.0.0-20241112194109-818c5a804067.zip;srcoutput=golang.org/x/lint;srcinput=golang.org/x/lint@v0.0.0-20241112194109-818c5a804067;downloadfilename=golang-org-x-lint-0.0.0-20241112194109-818c5a804067.zip;name=golang-org-x-lint"
SRC_URI[golang-org-x-lint.sha256sum] = "0a94e5c77d96cfa828964f56de5434bbf5af7821c42e17ed13f96c31effd41c1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/lint/LICENSE;md5=4c728948788b1a02f33ae4e906546eef \
"

GOSRC_INCLUDEGUARD += "golang.org-x-lint-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
