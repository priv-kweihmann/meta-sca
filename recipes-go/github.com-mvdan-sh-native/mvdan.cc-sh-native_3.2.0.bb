## This is a alias-recipe
GO_IMPORT = "mvdan.cc/sh"
require github.com-mvdan-sh-native_${PV}.bb

DEPENDS_remove = "mvdan.cc-sh-native"
DEPENDS += "\
            mvdan.cc-editorconfig-native \
            golang.org-lib-native \
            github.com-pkg-diff-native \
            github.com-google-renameio-native \
            "

do_install_append() {
    ## remove duplicated files
    rm ${D}${bindir}/gosh
    rm ${D}${bindir}/shfmt
}
