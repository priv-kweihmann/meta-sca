## This is a alias-recipe
GO_IMPORT = "mvdan.cc/sh"
include github.com-mvdan-sh-native_${PV}.bb

DEPENDS_remove = "mvdan.cc-sh-native"
DEPENDS += "\
            github.com-pkg-diff-native \
            golang.org-lib-native \
            mvdan.cc-editorconfig-native \
            "

do_install_append() {
    ## remove duplicated files
    rm ${D}${bindir}/gosh
    rm ${D}${bindir}/shfmt
}